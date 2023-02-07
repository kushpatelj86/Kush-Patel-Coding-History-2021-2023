import java.util.Iterator;

public class Queue <T> implements Iterable <T> {

    
    private java.util.LinkedList<T> list = new java.util.LinkedList<T> ();


    public Queue() { }


//return the size of the queue
    public int size()
    {
        return list.size();
    }
//returns wheter the size is empty or not
    public boolean isEmpty()
    {
        return size() == 0;
    }
    // Peek the element at the front of the queue, 
    //the method throws an error is the queue is empty
    public T peek()
    {
        if(isEmpty())
            throw new RuntimeException("Queue Empty");

        return list.peekFirst();    
    }

    //poll an element from the front of the queue
    //The method throws an error is the queue is empty
    public T poll()
    {
        if(isEmpty())
            throw new RuntimeException("Queue Empty");
        
        return list.removeFirst();
    }

    //Add an element to the back of the quene
    public void  offer(T elem)
    {
        list.addLast(elem);
    }






    public Queue(T firstElem)
    {
        offer(firstElem);
    }
    
    
    
    //return an iterarator to allow the user to traverse 
    //through the elements found inside the queue
    @Override public java.util.Iterator <T> iterator()
    {
        return list.iterator();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    






























}