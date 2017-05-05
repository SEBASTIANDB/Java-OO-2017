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

        Field[] fields = c.getDeclaredFields();
        assertEquals(4, fields.length);
        
        for (Field f : fields) {
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
    public void testEqualsMethodSignature() throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("test EqualsMethodSignature");
        Class<?> c = Class.forName("logica.Figuur");

        Method m = c.getDeclaredMethod("equals", Class.forName("java.lang.Object"));
        assertTrue((m.getModifiers() & Modifier.PUBLIC) != 0);
        assertNotNull(m);
    }
}
