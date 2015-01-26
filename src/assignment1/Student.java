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
    Double gpa;
    
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
    
    Double gpa()
    {
        return this.gpa;
    }
    void gpa(Double gpa)
    {
        this.gpa=gpa;
    }

    boolean isGreaterThan(Student student) 
    {
        if(this.name.compareTo(student.name()) > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}