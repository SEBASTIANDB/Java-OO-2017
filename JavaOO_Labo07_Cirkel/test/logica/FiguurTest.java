package logica;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kristien.vanassche
 */
public class FiguurTest {
    @Test
    public void testFieldModifier() throws ClassNotFoundException {
        System.out.println("test field modifier");
        Class<?> c = Class.forName("logica.Figuur");

        for (Field f : c.getDeclaredFields()) {
            assert ((f.getModifiers() & Modifier.PRIVATE) != 0);
        }
    }
    
    @Test
    public void testClassModifier() throws ClassNotFoundException {
        System.out.println("test class modifier");
        Class<?> c = Class.forName("logica.Figuur");
        assert((c.getModifiers() & Modifier.ABSTRACT) != 0);
    }
    
    
    @Test
    public void testGetterMethodSignature() throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("test getters");
        Class<?> c = Class.forName("logica.Figuur");

        Method m = c.getDeclaredMethod("getKleur");
        assertNotNull(m);
        assertTrue((m.getModifiers() & Modifier.PUBLIC) != 0);
        assertTrue((m.getModifiers() & Modifier.ABSTRACT) == 0);
        assertEquals(0, m.getParameterCount());
        assertEquals(Kleur.class, m.getReturnType());
        
        m = c.getDeclaredMethod("getKleurRand");
        assertNotNull(m);
        assertTrue((m.getModifiers() & Modifier.PUBLIC) != 0);
        assertTrue((m.getModifiers() & Modifier.ABSTRACT) == 0);
        assertEquals(0, m.getParameterCount());
        assertEquals(Kleur.class, m.getReturnType());

        m = c.getDeclaredMethod("getDikteRand");
        assertNotNull(m);
        assertTrue((m.getModifiers() & Modifier.PUBLIC) != 0);
        assertTrue((m.getModifiers() & Modifier.ABSTRACT) == 0);
        assertEquals(0, m.getParameterCount());
        assertEquals(Integer.TYPE, m.getReturnType());    
    }

    @Test
    public void testEqualsMethodSignature() throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("test EqualsMethodSignature");
        Class<?> c = Class.forName("logica.Figuur");

        Method m = c.getDeclaredMethod("equals", Class.forName("java.lang.Object"));
        assertTrue((m.getModifiers() & Modifier.PUBLIC) != 0);
        assertNotNull(m);
    }
    
    @Test
    public void testBerekenOppervlakteMethodSignature() throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("test testBerekenOppervlakteMethodSignature");
        Class<?> c = Class.forName("logica.Figuur");

        Method m = c.getDeclaredMethod("berekenOppervlakte");
        assertNotNull(m);
        assertTrue((m.getModifiers() & Modifier.PUBLIC) != 0);
        assertTrue((m.getModifiers() & Modifier.ABSTRACT) != 0);
        assertEquals(0, m.getParameterCount());
        assertEquals(Double.TYPE, m.getReturnType());
    }

    @Test
    public void testBerekenOmtrekMethodSignature() throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("test testBerekenOmtrekMethodSignature");
        Class<?> c = Class.forName("logica.Figuur");

        Method m = c.getDeclaredMethod("berekenOmtrek");
        assertNotNull(m);
        assertTrue((m.getModifiers() & Modifier.PUBLIC) != 0);
        assertTrue((m.getModifiers() & Modifier.ABSTRACT) != 0);
        assertEquals(0, m.getParameterCount());
        assertEquals(Double.TYPE, m.getReturnType());
    }
}
