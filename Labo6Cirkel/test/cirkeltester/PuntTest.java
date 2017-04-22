package cirkeltester;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import logica.Punt;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kristien.vanassche
 */
public class PuntTest {
    private Punt punt1, punt2, punt3;
    
    @Test
    public void testFieldModifier() throws ClassNotFoundException {
        System.out.println("test field modifier");
        Class<?> c = Class.forName("logica.Punt");

        for (Field f : c.getDeclaredFields()) {
            assert ((f.getModifiers() & Modifier.PRIVATE) != 0);
        }
    }
    
    @Before
    public void setUp() {
        punt1 = new Punt(12, 13);
        punt2 = new Punt(12, 13);
        punt3 = new Punt(12, 14);
    }

    /**
     * Test of toString method, of class Punt.
     */
    @Test
    public void testToString() {
        System.out.println("toString");

        assertEquals(true, punt1.toString().equals(punt2.toString()));
        assertEquals(false, punt1.toString().equals(punt3.toString()));
    }

    /**
     * Test of equals method, of class Punt.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");

        assertEquals(true, punt1.equals(punt2));
        assertEquals(false, punt1.equals(punt3));
    }
    
    /**
     * Test of berekenAfstand method, of class Punt.
     */
    @Test
    public void testBerekenAfstand() {
        System.out.println("berekenAfstand");

        assertEquals(0, punt1.berekenAfstand(punt2), 0.0);
        assertEquals(1, punt1.berekenAfstand(punt3), 0.0);
    }
    
    @Test
    public void testEqualsMethodSignature() throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("test EqualsMethodSignature");
        Class<?> c = Class.forName("logica.Punt");

        Method m = c.getDeclaredMethod("equals", Class.forName("java.lang.Object"));
        assertTrue((m.getModifiers() & Modifier.PUBLIC) != 0);
        assertNotNull(m);
    }
}
