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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of name method, of class Student.
     */
    @Test
    public void testName_0args() {
        System.out.println("name");
        Student instance = new Student();
        String expResult = "";
        String result = instance.name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of name method, of class Student.
     */
    @Test
    public void testName_String() {
        System.out.println("name");
        String name = "";
        Student instance = new Student();
        instance.name(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redId method, of class Student.
     */
    @Test
    public void testRedId_0args() {
        System.out.println("redId");
        Student instance = new Student();
        String expResult = "";
        String result = instance.redId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redId method, of class Student.
     */
    @Test
    public void testRedId_String() {
        System.out.println("redId");
        String redId = "";
        Student instance = new Student();
        instance.redId(redId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gpa method, of class Student.
     */
    @Test
    public void testGpa_0args() {
        System.out.println("gpa");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.gpa();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gpa method, of class Student.
     */
    @Test
    public void testGpa_double() {
        System.out.println("gpa");
        double gpa = 0.0;
        Student instance = new Student();
        instance.gpa(gpa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of probationaryGpa method, of class Student.
     */
    @Test
    public void testProbationaryGpa() {
        System.out.println("probationaryGpa");
        double probationaryGpa = 0.0;
        Student instance = new Student();
        instance.probationaryGpa(probationaryGpa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGreaterThan method, of class Student.
     */
    @Test
    public void testIsGreaterThan() {
        System.out.println("isGreaterThan");
        Student aStudent = null;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.isGreaterThan(aStudent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class Student.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Student instance = new Student();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onProbation method, of class Student.
     */
    @Test
    public void testOnProbation() {
        System.out.println("onProbation");
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.onProbation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printRedId method, of class Student.
     */
    @Test
    public void testPrintRedId() {
        System.out.println("printRedId");
        Student instance = new Student();
        instance.printRedId();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPerfectGpa method, of class Student.
     */
    @Test
    public void testIsPerfectGpa() {
        System.out.println("isPerfectGpa");
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.isPerfectGpa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printName method, of class Student.
     */
    @Test
    public void testPrintName() {
        System.out.println("printName");
        Student instance = new Student();
        instance.printName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
