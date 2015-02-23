/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cxj8923
 */
public class NodeTest {
    
    public NodeTest() {
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
     * Test of student method, of class Node.
     */
    @Test
    public void testStudent() {
        System.out.println("student");
        Node instance = new Node();
        Student expResult = null;
        Student result = instance.student();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class Node.
     */
    @Test
    public void testPrevious_0args() {
        System.out.println("previous");
        Node instance = new Node();
        Node expResult = null;
        Node result = instance.previous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class Node.
     */
    @Test
    public void testPrevious_Node() {
        System.out.println("previous");
        Node node = null;
        Node instance = new Node();
        instance.previous(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class Node.
     */
    @Test
    public void testNext_0args() {
        System.out.println("next");
        Node instance = new Node();
        Node expResult = null;
        Node result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class Node.
     */
    @Test
    public void testNext_Node() {
        System.out.println("next");
        Node node = null;
        Node instance = new Node();
        instance.next(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Node.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Node aNode = null;
        Node instance = new Node();
        instance.add(aNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGreaterThan method, of class Node.
     */
    @Test
    public void testIsGreaterThan() {
        System.out.println("isGreaterThan");
        Node aNode = null;
        Node instance = new Node();
        boolean expResult = false;
        boolean result = instance.isGreaterThan(aNode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class Node.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Node instance = new Node();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onProbation method, of class Node.
     */
    @Test
    public void testOnProbation() {
        System.out.println("onProbation");
        Node instance = new Node();
        boolean expResult = false;
        boolean result = instance.onProbation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printRedId method, of class Node.
     */
    @Test
    public void testPrintRedId() {
        System.out.println("printRedId");
        Node instance = new Node();
        instance.printRedId();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of probationaryGpa method, of class Node.
     */
    @Test
    public void testProbationaryGpa() {
        System.out.println("probationaryGpa");
        double probationaryGpa = 0.0;
        Node instance = new Node();
        instance.probationaryGpa(probationaryGpa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPerfectGpa method, of class Node.
     */
    @Test
    public void testIsPerfectGpa() {
        System.out.println("isPerfectGpa");
        Node instance = new Node();
        boolean expResult = false;
        boolean result = instance.isPerfectGpa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printName method, of class Node.
     */
    @Test
    public void testPrintName() {
        System.out.println("printName");
        Node instance = new Node();
        instance.printName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
