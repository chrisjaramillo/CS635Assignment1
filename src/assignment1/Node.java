package assignment1;

/**
 *
 * @author Christopher Jaramillo
 */

import java.util.Comparator;

public class Node<E> implements Comparable{
    private E data;
    Node<E> previous;
    Node<E> next;
    
    Node()
    {
        previous = null;
        next = null;
    }
    Node(E data)
    {
        this.data = data;
        previous = null;
        next = null;
    }
    
    public E data()
    {
        return this.data;
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
    
    /*
     * Adds Nodes maintaining alphabetical order
     */
    public void add(Node aNode)
    {
        if(aNode == null)
        {
            aNode = this;
        }
        else if(aNode.isGreaterThan(this))
        {
            if(aNode.previous() == null)
            {
                this.next(aNode);
                aNode.previous(this);
            }
            else
            {
                this.previous(aNode.previous());
                aNode.previous(this);
                this.next(aNode);
                this.previous().next(this);
            }
        }
        else 
        {
            if(aNode.next() == null)
            {
                aNode.next(this);
                this.previous(aNode);
            }
            else
            {
                this.add(aNode.next());
            }
        }
    }

    public boolean isGreaterThan(Node aNode) 
    {
        return this.data.isGreaterThan(aNode.data());
    }

    public void print() 
    {
        this.student.print();
    }

    boolean onProbation() {
        return student.onProbation();
    }

    void printRedId() {
        student.printRedId();
    }

    public void probationaryGpa(double probationaryGpa) {
        student.probationaryGpa(probationaryGpa);
    }

    public boolean isPerfectGpa() {
        return student.isPerfectGpa();
    }

    void printName() {
        student.printName();
    }

    @Override
    public int compareTo(Node compareNode) {
        
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
