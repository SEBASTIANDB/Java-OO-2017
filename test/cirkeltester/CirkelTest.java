package cirkeltester;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import logica.Cirkel;
import logica.Punt;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author kristien.vanassche
 */
public class CirkelTest {
    private Cirkel instance;
    private Punt punt1, punt2;

    @Test
    public void testFieldModifier() throws ClassNotFoundException {
        System.out.println("test field modifier");
        Class<?> c = Class.forName("logica.Cirkel");

        for (Field f : c.getDeclaredFields()) {
            assert ((f.getModifiers() & Modifier.PRIVATE) != 0);
        }
    }
    
    @Before
    public void setUp() throws Exception {
        instance = new Cirkel(new Punt(1,2), 2.0);
        punt1 = new Punt(1, 0);
        punt2 = new Punt(5, 2);
    }
    
    /**
     * Test of constructor method, of class Cirkel.
     */    
    @Test
    public void testConstructor() {
        System.out.println("testconstructor");

        assertNotNull(new Cirkel(new Punt(0,0), 0));
        assertNotNull(new Cirkel(new Punt(-1,-1), 0));
    }
    
    /**
     * Test of berekenOmtrek method, of class Cirkel.
     */    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorBis() {
        System.out.println("test constructor bis");

        assertNull(new Cirkel(new Punt(-1,-1), -1));
    }
    
    /**
     * Test of berekenOmtrek method, of class Cirkel.
     */    
    @Test
    public void testBerekenOmtrek() {
        System.out.println("test berekenOmtrek");
         
        double expResultOmtrek = 12.566370614359172;
        double resultOmtrek = instance.berekenOmtrek();
        assertEquals(expResultOmtrek, resultOmtrek, 0.0);
    }

    /**
     * Test of berekenOppervlakte method, of class Cirkel.
     */
    @Test
    public void testBerekenOppervlakte() {
        System.out.println("test berekenOppervlakte");
        
        double expResultOpp = 12.566370614359172;
        double resultOpp = instance.berekenOppervlakte();
        assertEquals(expResultOpp, resultOpp, 0.0);
    }

    /**
     * Test of berekenAfstand method, of class Cirkel.
     */
    @Test
    public void testBerekenAfstand() {
        System.out.println("test berekenAfstand");
       
        assertEquals(2.0, instance.berekenAfstand(punt1), 0);
        assertEquals(4.0, instance.berekenAfstand(punt2), 0);
    }    
    
    /**
     * Test of toString method, of class Punt.
     */
    @Test
    public void testToString() {
        System.out.println("test toString");
        
        Cirkel c1 = new Cirkel(new Punt(1,2), 7.0);
        Cirkel c2 = new Cirkel(new Punt(1,2), 7.0);
        assertEquals(true, c1.toString().equals(c2.toString()));
        assertEquals(false, instance.toString().equals(c1.toString()));
    }

    /**
     * Test of equals method, of class Punt.
     */
    @Test
    public void testEquals() {
        System.out.println("test equals");
        Cirkel c1 = new Cirkel(new Punt(1,2), 7.0);
        Cirkel c2 = new Cirkel(new Punt(1,2), 7.0);
        assertEquals(true, c1.equals(c2));
        assertEquals(false, instance.equals(c1));
    } 
    
    @Test
    public void testEqualsMethodSignature() throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("test EqualsMethodSignature");
        Class<?> c = Class.forName("logica.Cirkel");

        Method m = c.getDeclaredMethod("equals", Class.forName("java.lang.Object"));
        assertTrue((m.getModifiers() & Modifier.PUBLIC) != 0);
        assertNotNull(m);
    }
}
