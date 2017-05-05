package logica;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kristien.vanassche
 */
public class CirkelTestDeel3 {
    private Cirkel c1, c2;
    
    @Test
    public void testFieldModifier() throws ClassNotFoundException {
        System.out.println("test field modifier");
        Class<?> c = Class.forName("logica.Cirkel");

        Field[] fields = c.getDeclaredFields();
        assertEquals(1, fields.length);
        
        for (Field f : fields) {
            assert ((f.getModifiers() & Modifier.PRIVATE) != 0);
        }
    }

    @Test
    public void testConstructorOrig() {
        System.out.println("testconstructorOrig");

        assertNotNull(c1 = new Cirkel(new Punt(1,2), 3));
        assertEquals(Kleur.wit, c1.getKleur());
        assertEquals(Kleur.zwart, c1.getKleurRand());
        assertEquals(1, c1.getDikteRand());
        assertEquals(3, c1.getStraal(), 0);        
        assertEquals(new Punt(1,2), c1.getMiddelpunt());        
    } 

    @Test
    public void testConstructorDefault() {
        System.out.println("testconstructorDefault");

        assertNotNull(c1 = new Cirkel());
        assertEquals(Kleur.wit, c1.getKleur());
        assertEquals(Kleur.zwart, c1.getKleurRand());
        assertEquals(1, c1.getDikteRand());
        assertEquals(50, c1.getStraal(), 0);        
        assertEquals(new Punt(0,0), c1.getMiddelpunt());        
    }    
    
    @Test
    public void testConstructorBis() {
        System.out.println("testconstructorBis");

        assertNotNull(c1 = new Cirkel(3));
        assertEquals(Kleur.wit, c1.getKleur());
        assertEquals(Kleur.zwart, c1.getKleurRand());
        assertEquals(1, c1.getDikteRand());  
        assertEquals(3, c1.getStraal(), 0);
        assertEquals(new Punt(0,0), c1.getMiddelpunt());
    } 
    
    @Test
    public void testConstructorTris() {
        System.out.println("testconstructorTris");

        assertNotNull(c1 = new Cirkel(Kleur.blauw, Kleur.geel, 12, 13));
        assertEquals(Kleur.blauw, c1.getKleur());
        assertEquals(Kleur.geel, c1.getKleurRand());
        assertEquals(12, c1.getDikteRand());         
        assertEquals(13, c1.getStraal(), 0);
        assertEquals(new Punt(0,0), c1.getMiddelpunt());        
    } 

    @Test
    public void testGetterSetter() {
        System.out.println("testGetterSetter");

        assertNotNull(c1 = new Cirkel());
        c1.setMiddelpunt(new Punt(1,2));
        assertEquals(new Punt(1,2), c1.getMiddelpunt());
    } 

    @Test
    public void testEquals() {
        System.out.println("test equals");
        c1 = new Cirkel(7.0);
        c2 = new Cirkel(7.0);
        assertEquals(true, c1.equals(c2));
        Cirkel instance = new Cirkel(2.0);
        assertEquals(false, instance.equals(c1));
    } 
    
    @Test
    public void testEqualsBis() {
        System.out.println("test equalsBis");
        Cirkel c1 = new Cirkel(Kleur.blauw, Kleur.geel, 12, 5);

        Cirkel instance = new Cirkel(Kleur.wit, Kleur.wit, 12, 5);
        assertEquals(false, instance.equals(c1));
        instance = new Cirkel(Kleur.blauw, Kleur.geel, 111, 5);
        assertEquals(false, instance.equals(c1));        
        instance = new Cirkel(Kleur.blauw, Kleur.geel, 12, 5);
        assertEquals(true, instance.equals(c1));   
    }  
    
    @Test
    public void testBerekenAfstand() {
        System.out.println("testBerekenAfstand");

        c1 = new Cirkel();
        c2 = new Cirkel();        
        c2.setMiddelpunt(new Punt(1,2));
        
        assertEquals(Math.sqrt(5), c1.berekenAfstand(new Punt(1,2)), 0);
        assertEquals(Math.sqrt(5), c1.berekenAfstand(c2.getMiddelpunt()), 0);

        c1.setMiddelpunt(new Punt(1,0));
        assertEquals(2, c1.berekenAfstand(c2.getMiddelpunt()), 0);
    } 
}
