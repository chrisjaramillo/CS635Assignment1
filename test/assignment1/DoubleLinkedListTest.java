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
    }

    /**
     * Test of front method, of class DoubleLinkedList.
     */
    @Test
    public void testFront_Node() {
        System.out.println("front");
        Node front = new Node();
        DoubleLinkedList instance = new DoubleLinkedList(front);
        Node listFront = instance.front();
        assertEquals(listFront, front);
    }
    
    @Test
    public void testFront_Node2() {
        System.out.println("front2");
        Node front = new Node();
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.front(front);
        Node listFront = instance.front();
        assertEquals(listFront, front);
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
    }

    /**
     * Test of back method, of class DoubleLinkedList.
     */
    @Test
    public void testBack_Node() {
        System.out.println("back");
        Node back = new Node();
        DoubleLinkedList instance = new DoubleLinkedList(back);
        assertEquals(instance.back(), back);
    }
    /**
     * Test of back method, of class DoubleLinkedList.
     */
    @Test
    public void testBack_Node2() {
        System.out.println("back");
        Node back = new Node();
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.back(back);
        assertEquals(instance.back(), back);
    }

    /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAddOneStudent() {
        System.out.println("add");
        Student student = new Student();
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add(student);
        assertEquals(instance.front().student(), student);
        assertEquals(instance.back().student(), student);
    }
    
        /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAddTwoStudents() {
        System.out.println("add");
        Student student = new Student("Abe", "888111", 3.45);
        Student student2 = new Student("Ben", "999222", 1.45);
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add(student);
        instance.add(student2);
        assertEquals(instance.front().student(), student);
        assertEquals(instance.back().student(), student2);
    }
    
    @Test
    public void testAddThreeStudents() {
        System.out.println("add");
        Student student = new Student("Abe", "888111", 3.45);
        Student student2 = new Student("Ben", "999222", 1.45);
        Student student3 = new Student("Chris", "777333", 2.45);
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add(student);
        instance.add(student2);
        instance.add(student3);
        assertEquals(instance.front().student(), student);
        assertEquals(instance.back().student(), student3);
    }

    /**
     * Test of getElement method, of class DoubleLinkedList.
     */
    @Test
    public void testGetElement() {
        System.out.println("getElement");
        int k = 0;
        DoubleLinkedList instance = new DoubleLinkedList();
        Student expResult = new Student();
        instance.add(expResult);
        Node result = instance.getElement(k);
        assertEquals(expResult, result.student());
    }
    
    /**
     * Test of getElement method, of class DoubleLinkedList.
     */
    @Test
    public void testGetElement2() {
        System.out.println("getElement");
        int k = 0;
        DoubleLinkedList instance = new DoubleLinkedList();
        Student expResult = new Student("Abe", "888111", 3.45);
        Student nonExpResult = new Student("Ben", "999222", 1.45);
        instance.add(expResult);
        instance.add(nonExpResult);
        Node result = instance.getElement(k);
        assertEquals(expResult, result.student());
    }

    /**
     * Test of getElement method, of class DoubleLinkedList.
     */
    @Test
    public void testGetElement3() {
        System.out.println("getElement");
        int k = 1;
        DoubleLinkedList instance = new DoubleLinkedList();
        Student nonExpResult = new Student("Abe", "888111", 3.45);
        Student expResult = new Student("Ben", "999222", 1.45);
        instance.add(expResult);
        instance.add(nonExpResult);
        Node result = instance.getElement(k);
        assertEquals(expResult, result.student());
    }

    /**
     * Test of getElement method, of class DoubleLinkedList.
     */
    @Test
    public void testGetElement4() {
        System.out.println("getElement");
        int k = 0;
        DoubleLinkedList instance = new DoubleLinkedList();
        Student student = new Student("Abe", "888111", 3.45);
        Student student2 = new Student("Ben", "999222", 1.45);
        Student student3 = new Student("Chris", "777333", 2.45);
        instance.add(student);
        instance.add(student2);
        instance.add(student3);
        Node result = instance.getElement(k);
        assertEquals(student, result.student());
        k++;
        result = instance.getElement(k);
        assertEquals(student2, result.student());
        k++;
        result = instance.getElement(k);
        assertEquals(student3, result.student());
    }

    /**
     * Test of getElement method, of class DoubleLinkedList.
     */
    @Test
    public void testGetElement5() {
        System.out.println("getElement");
        int k = 0;
        DoubleLinkedList instance = new DoubleLinkedList();
        Student student = new Student("Abe", "888111", 3.45);
        Student student2 = new Student("Ben", "999222", 1.45);
        Student student3 = new Student("Chris", "777333", 2.45);
        instance.add(student2);
        instance.add(student3);
        instance.add(student);
        Node result = instance.getElement(k);
        assertEquals(student, result.student());
        k++;
        result = instance.getElement(k);
        assertEquals(student2, result.student());
        k++;
        result = instance.getElement(k);
        assertEquals(student3, result.student());
    }   
}
