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
public class Node {
    Student student;
    Node previous;
    Node next;
    
    Node()
    {
        student = new Student();
        previous = null;
        next = null;
    }
    Node(Student student)
    {
        this.student = student;
        previous = null;
        next = null;
    }
    Node(String name, String redId, Double gpa)
    {
        this.student = new Student(name,redId,gpa);
        previous = null;
        next = null;
    }
    
    public Student student()
    {
        return this.student;
    }
    
    public Node previous()
    {
        return previous;
    }
    public void previous(Node node)
    {
        this.previous = node;
    }
    
    public Node next()
    {
        return this.next;
    }
    public void next(Node node)
    {
        this.next = node;
    }
    
    public void add(DoubleLinkedList doubleLinkedList)
    {
        // Empty list
        if(doubleLinkedList.front() == null) 
        {
            addToFrontAndBack(doubleLinkedList);
        }
        else
        {
            add(doubleLinkedList.front(), doubleLinkedList);
        }
    }
    public void add(Node node, DoubleLinkedList doubleLinkedList)
    {
        if(node.isGreaterThan(this))
        {
            if(node == doubleLinkedList.front())
            {
                this.next=node;
                doubleLinkedList.front(this);
            }
            else
            {
                this.previous=node.previous();
                this.next=node;
                node.previous(this);
            }
        }
        else
        {
            this.add(node.next(),doubleLinkedList);
        }
    }

    private void addToFrontAndBack(DoubleLinkedList doubleLinkedList) 
    {
        doubleLinkedList.front(this);
        doubleLinkedList.back(this);
    }

    public boolean isGreaterThan(Node node) 
    {
        if(this.student.isGreaterThan(node.student()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
