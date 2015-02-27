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

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Deque;
        
import java.util.Iterator;
public class DoubleLinkedList<T> implements Deque<T>{
    private Node<T> front;
    private Node<T> back;
    private int count;
    
    DoubleLinkedList()
    {
        front = null;
        back = null;
        count = 0;
    }
    
    /*
     * Adds elements of type T to the double linked list 
     */
    @Override
    public boolean add(T newObject)
    {
        Node<T> newNode = new Node<>(newObject);
        System.out.println("Incoming " + newNode);
        if(count == 0)
        {
            front = back = newNode;
        }
        else
        {
            
            if(newNode.compareTo(front) < 0)
            {
                newNode.add(front);
                front = newNode;
            }
            else
            {
                Node testNode = front;
                while(testNode != null && newNode.compareTo(testNode) >= 0)
                {
                    testNode = testNode.next();
                }
                if(testNode == null)
                {
                    back.add(newNode);
                    back = newNode;
                }
                else
                {
                    newNode.add(testNode);
                }
            }
        }
        count++;
        System.out.println(this);
        return true;
    }

    public T getElement(int k)
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
        return (T) requestedElement.data();
    }

    @Override
    public void addFirst(T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addLast(T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean offerFirst(T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean offerLast(T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T pollFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T pollLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getFirst() {
        T value = null;
        if(front != null)
        {
            value = front.data();
            front = front.next();
            count--;
        }
        return value;
    }

    @Override
    public T getLast() {
        T value = null;
        if(back != null)
        {
            value = back.data();
            back = back.previous();
            count--;
        }
        return value;
    }

    @Override
    public T peekFirst() {
        T value = null;
        if(front != null)
        {
            value = front.data();
        }
        return value;
    }

    @Override
    public T peekLast() {
        T value = null;
        if(back != null)
        {
            value = back.data();
        }
        return value;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean offer(T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T poll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T element() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void push(T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<T> descendingIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        Object[] anArray = new Object[count];
        int i=0;
        Node currentNode = front;
        while(currentNode != null)
        {
            anArray[i] = currentNode.data();
            i++;
            currentNode = currentNode.next();
        }
        return anArray;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        Class<T> s = null;
        ts = (T[])Array.newInstance(s, count);
        int i=0;
        Node currentNode = front;
        while(currentNode != null)
        {
            ts[i] = (T)currentNode.data();
            i++;
            currentNode = currentNode.next();
        }
        return ts;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        Node aNode = front;
        while(aNode != null)
        {
            String temp = aNode.toString();
            s.append(temp);
            s.append( ", ");
            aNode = aNode.next();
        }
        s.delete(s.length()-2, s.length()-1);
        return s.toString();
    }
    
    @Override
    public boolean containsAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends T> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
