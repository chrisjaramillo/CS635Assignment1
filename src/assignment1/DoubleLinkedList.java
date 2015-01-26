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
public class DoubleLinkedList {
    Node front;
    Node back;
    
    DoubleLinkedList()
    {
        front = null;
        back = null;
    }
    DoubleLinkedList(Node node)
    {
        front=back=node;
    }
    
    Node front()
    {
        return this.front;
    }
    void front(Node front)
    {
        this.front = front;
    }
    
    Node back()
    {
        return this.back;
    }
    void back(Node back)
    {
        this.back = back;
    }
    
    public void add(Student student)
    {
        Node newStudent = new Node(student);
        newStudent.add(this);
    }
}
