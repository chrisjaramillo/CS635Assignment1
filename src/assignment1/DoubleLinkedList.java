package assignment1;
/*
Notes

need to figure out add functionality. iterator and reverse iterator, find node 
less than, insert? Node is not currently comparable, should it be? also, should 
this implement deque? or just abstract list or list interface in general?
*/

/**
 *
 * @author Christopher Jaramillo
 */
public class DoubleLinkedList<T> {
    private Node<T> front;
    private Node<T> back;
    private int count;
    
    DoubleLinkedList()
    {
        front = null;
        back = null;
        count = 0;
    }
    DoubleLinkedList(Node<T> node)
    {
        front=back=node;
        count++;
    }
    
    Node<T> front()
    {
        return this.front;
    }
    void front(Node<T> front)
    {
        this.front = front;
    }
    
    Node<T> back()
    {
        return this.back;
    }
    void back(Node<T> back)
    {
        this.back = back;
    }
    
    /*
     * Adds elements of type T to the double linked list 
     */
    public void add(T newObject)
    {
        Node<T> newNode = new Node<>(newObject);
        count++;
    }

    public Node<T> getElement(int k)
    {
        Node requestedElement;
        if(k > count)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        else
        {
            requestedElement = front;
            for(int elementIndex=1; elementIndex <= k; elementIndex++)
            {
                requestedElement = requestedElement.next();
            }
        }
        return requestedElement;
    }
}
