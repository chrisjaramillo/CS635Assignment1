package assignment1;

/**
 *
 * @author Christopher Jaramillo
 */

public class Node<T>{
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
}