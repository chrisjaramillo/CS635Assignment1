/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

/**
 *
 * @author Christopher
 */
public class Student {
    String name;
    String redId;
    double gpa;
    double probationaryGpa;
    
    Student()
    {
        name = new String();
        redId = new String();
        gpa = new Double(0.0);
    }
    Student(String name, String redId, Double gpa)
    {
        this.name=name;
        this.redId=redId;
        this.gpa=gpa;
    }
    
    String name()
    {
        return this.name;
    }
    void name(String name)
    {
        this.name=name;
    }
    
    String redId()
    {
        return this.redId;
    }
    void redId(String redId)
    {
        this.redId=redId;
    }
    
    double gpa()
    {
        return this.gpa;
    }
    void gpa(double gpa)
    {
        this.gpa=gpa;
    }

    public void probationaryGpa(double probationaryGpa)
    {
        this.probationaryGpa = probationaryGpa;
    }
    
    boolean isGreaterThan(Student aStudent) 
    {
        if(this.name.compareTo(aStudent.name()) > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void print() {
        System.out.println(name);
    }

    boolean onProbation() 
    {
        return gpa < probationaryGpa;
    }

    void printRedId() 
    {
        System.out.println(this.redId);
    }

    boolean isPerfectGpa() {
        return gpa == 4.0;
    }

    void printName() {
        System.out.println(name);
    }
}