package assignment1;

/**
 *
 * @author Christopher Jaramillo
 */
public class DoubleLinkedList<E> {
    private Node<E> front;
    private Node<E> back;
    private int count;
    
    DoubleLinkedList()
    {
        front = null;
        back = null;
        count = 0;
    }
    DoubleLinkedList(Node node)
    {
        front=back=node;
        count++;
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
    
    /*
     * Adds students to the double linked list 
     */
    public void add(Object newObject)
    {
        Node newNode = new Node(newObject);
        
        count++;
    }

    public Node getElement(int k)
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
    
    public void print() 
    {
        Node currentNode = front;
        while(currentNode != null)
        {
            currentNode.print();
            currentNode = currentNode.next();
        }
    }
    public void printProbationList()
    {
        Node currentNode = front;
        while(currentNode != null)
        {
            if(currentNode.onProbation())
            {
                currentNode.printRedId();
            }
            currentNode = currentNode.next();
        }
    }
    public void printPerfectGpaList()
    {
        Node currentNode = back;
        while(currentNode != null)
        {
            if(currentNode.isPerfectGpa())
            {
                currentNode.printName();
            }
            currentNode = currentNode.previous();
        }
    }
}
