package lab04;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Laboratorio 4. Punto 1.2. La plantilla de esta clase fue tomada del codigo
 * propuesto para el Laboratorio 4 de:
 * https://github.com/mauriciotoro/ST0245-Eafit/tree/master/laboratorios/lab04/codigo/Java/Laboratorio3/src
 *
 * En esta clase se encuentran las pruebas Unitarias a la clase
 * LinkedListMauricio realizadas con JUnit.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class LinkedListMauricioTest {

    /**
     * Test del metodo insert, de la clase LinkedListMauricio.
     */
    @Test
    public void testInsert() {
        System.out.println("\ninsert");
        LinkedListMauricio list = new LinkedListMauricio();
                System.out.println("Test con lista vacia: ");
                list.insert(0, 100);
		list.insert(5, 0);
		list.insert(4, 0);
		list.insert(3, 0);
		list.insert(2, 0);
		list.insert(1, 0);
		for (int i = 0; i < list.size(); i++)
		{
			assertEquals(list.get(0),1);
			assertEquals(list.get(1),2);
			assertEquals(list.get(2),3);
			assertEquals(list.get(3),4);
			assertEquals(list.get(4),5);			
		}
                list.insert(6, list.size());
                assertEquals(list.get(list.size()-1), 6);
    }

    /**
     * Test del metodo remove, de la clase LinkedListMauricio.
     */
    @Test
    public void testRemove() {
        System.out.println("\nremove");
        LinkedListMauricio list = new LinkedListMauricio();
                System.out.println("Test con lista vacia: ");
                list.remove(100);
		list.insert(5, 0);
		list.insert(4, 0);
		list.insert(3, 0);
		list.insert(2, 0);
		list.insert(1, 0);
		assertTrue(list.contains(3));
		list.remove(2);
		assertFalse(list.contains(3));
                list.remove(list.size()-1);
                assertFalse(list.contains(5));
    }

    /**
     * Test del metodo contains, de la clase LinkedListMauricio.
     */
    @Test
    public void testContains() {
        System.out.println("\ncontains");
        LinkedListMauricio list = new LinkedListMauricio();
		list.insert(5, 0);
		list.insert(4, 0);
		list.insert(3, 0);
		list.insert(2, 0);
		list.insert(1, 0);
		assertTrue(list.contains(3));
		assertFalse(list.contains(10));
    }
}
