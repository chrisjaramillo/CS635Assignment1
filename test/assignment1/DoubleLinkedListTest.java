package assignment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christopher Jaramillo
 */
public class DoubleLinkedListTest {
    
    public DoubleLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of front method, of class DoubleLinkedList.
     */
    @Test
    public void testFront_0args() {
        System.out.println("front");
        DoubleLinkedList instance = new DoubleLinkedList();
        Node expResult = null;
        Node result = instance.front();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of front method, of class DoubleLinkedList.
     */
    @Test
    public void testFront_Node() {
        System.out.println("front");
        Node front = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.front(front);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of back method, of class DoubleLinkedList.
     */
    @Test
    public void testBack_0args() {
        System.out.println("back");
        DoubleLinkedList instance = new DoubleLinkedList();
        Node expResult = null;
        Node result = instance.back();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of back method, of class DoubleLinkedList.
     */
    @Test
    public void testBack_Node() {
        System.out.println("back");
        Node back = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.back(back);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Student student = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElement method, of class DoubleLinkedList.
     */
    @Test
    public void testGetElement() {
        System.out.println("getElement");
        int k = 0;
        DoubleLinkedList instance = new DoubleLinkedList();
        Node expResult = null;
        Node result = instance.getElement(k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class DoubleLinkedList.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printProbationList method, of class DoubleLinkedList.
     */
    @Test
    public void testPrintProbationList() {
        System.out.println("printProbationList");
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.printProbationList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPerfectGpaList method, of class DoubleLinkedList.
     */
    @Test
    public void testPrintPerfectGpaList() {
        System.out.println("printPerfectGpaList");
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.printPerfectGpaList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
