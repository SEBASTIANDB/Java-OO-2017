/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Joachim
 */
public class ProjectTest {
    private Curriculum curriculum;
    private Student student;
    
    @Test
    public void testFieldModifier() throws ClassNotFoundException {
        System.out.println("test field modifier");
        Class<?> c = Class.forName("logica.Curriculum");

        Field[] fields = c.getDeclaredFields();
        assertEquals(1, fields.length);
        
        for (Field f : fields) {
            assert ((f.getModifiers() & Modifier.PRIVATE) != 0);
        }
    }

    @Test
    public void testConstructor() {
        System.out.println("testconstructor");
        assertNotNull(curriculum = new Curriculum()); 
        assertNotNull(curriculum.getVakkenlijst().get(0));
    }
    
    
    @Test
    public void testVak() {
        curriculum = new Curriculum();
        
        // Iterate over the list and check for null
        for(Vak v : curriculum.getVakkenlijst()) {
            assertNotNull(v.getCode());
            assertNotNull(v.getNaam());
            assertNotNull(v.getFase());
            assertNotNull(v.getStgrp());
            assertNotNull(v.getSemester());
            assertNotNull(v.getStdp());
        }
        
        // Test first element
        assertEquals("JPW275", curriculum.getVakkenlijst().get(0).getCode());
        assertEquals("Computer Architecture", curriculum.getVakkenlijst().get(0).getNaam());
        assertEquals("Fase1", curriculum.getVakkenlijst().get(0).getFase());
        assertEquals(Studiegroep.ELOICT, curriculum.getVakkenlijst().get(0).getStgrp());
        assertEquals("Sem1", curriculum.getVakkenlijst().get(0).getSemester());
        assertEquals(4, curriculum.getVakkenlijst().get(0).getStdp());
    }
    
    @Test
    public void testVakToString() {
        curriculum = new Curriculum();
        assertEquals("Fase1-Sem1-ELOICT: Computer Architecture (4stp)\n", curriculum.getVakkenlijst().get(0).toString());
        assertEquals("Fase1-Sem2-ELOICT: Digitale technieken (6stp)\n", curriculum.getVakkenlijst().get(3).toString());
        assertEquals("Fase1-Sem2-ELOICT: Java OO Programming (6stp)\n", curriculum.getVakkenlijst().get(7).toString());
        assertEquals("Fase1-Sem2-ICT: Web Technology (5stp)\n", curriculum.getVakkenlijst().get(11).toString());
        
    }

}
