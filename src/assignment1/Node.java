package assignment1;

/**
 *
 * @author Christopher Jaramillo
 */

public class Node<T> implements Comparable{
    private T data;
    Node<T> previous;
    Node<T> next;
    
    Node()
    {
        previous = null;
        next = null;
    }
    Node(T data)
    {
        this.data = data;
        previous = null;
        next = null;
    }
    
    public T data()
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
    
    public void add(Node aNode)
    {/*
        Comparable myData = (Comparable) this.data;
        Comparable newData = (Comparable) aNode.data;
        int result = myData.compareTo(newData);
        if(result >= 0) //Insert new node before
        {
            aNode.next(this);
            aNode.previous(this.previous());
            this.previous().next(aNode);
            this.previous(aNode);
        }
        else if(this.next() == null)
        {
            this.next(aNode);
            aNode.previous(this);
        }
        else
        {
            this.next().add(aNode);
        }
       */
        System.out.println("Adding " + aNode + " after " + this);
        aNode.previous(this);
        aNode.next(this.next());
        if(this.next() != null)
        {
            this.next().previous(aNode);
        }
        this.next=aNode;
        
    }

    @Override
    public int compareTo(Object t) {
        Node anotherNode = (Node) t;
        Comparable myData = (Comparable) this.data();
        Comparable otherData = (Comparable) anotherNode.data();
        return myData.compareTo(otherData);
    }
    
    @Override
    public String toString() {
        return data.toString();
    }
}