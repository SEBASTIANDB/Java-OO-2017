package logica;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kristien.vanassche
 */
public class CirkelTestDeel2 {
    private Cirkel c1, c2;
    
    @Test
    public void testConstructor() {
        System.out.println("testconstructor");

        assertNotNull(c1 = new Cirkel(new Punt(1,2), 3));
        assertEquals(Kleur.wit, c1.getKleur());
        assertEquals(Kleur.zwart, c1.getKleurRand());
        assertEquals(1, c1.getDikteRand());        
    }    
    
    @Test
    public void testConstructorBis() {
        System.out.println("testconstructorBis");

        assertNotNull(c2 = new Cirkel(Kleur.blauw, Kleur.geel, 12, new Punt(3,4), 5));
        assertEquals(Kleur.blauw, c2.getKleur());
        assertEquals(Kleur.geel, c2.getKleurRand());
        assertEquals(12, c2.getDikteRand());         
    } 
    
    @Test
    public void testEquals() {
        System.out.println("test equals");
        Cirkel c1 = new Cirkel(new Punt(1,2), 7.0);
        Cirkel c2 = new Cirkel(new Punt(1,2), 7.0);
        assertEquals(true, c1.equals(c2));
        Cirkel instance = new Cirkel(new Punt(1,2), 2.0);
        assertEquals(false, instance.equals(c1));
    } 
    
    @Test
    public void testEqualsBis() {
        System.out.println("test equalsBis");
        Cirkel c1 = new Cirkel(Kleur.blauw, Kleur.geel, 12, new Punt(3,4), 5);

        Cirkel instance = new Cirkel(Kleur.wit, Kleur.wit, 12, new Punt(3,4), 5);
        assertEquals(false, instance.equals(c1));
        instance = new Cirkel(Kleur.blauw, Kleur.geel, 111, new Punt(3,4), 5);
        assertEquals(false, instance.equals(c1));        
        instance = new Cirkel(Kleur.blauw, Kleur.geel, 12, new Punt(3,4), 5);
        assertEquals(true, instance.equals(c1));   
    }    
}
