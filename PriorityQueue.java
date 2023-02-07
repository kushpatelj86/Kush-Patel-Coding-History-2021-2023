/*
 A min priority queue implementation using a binary heap.
 */

 import java.util.*;
public class PriorityQueue <T extends Comparable<T>>
{

    //the number of elements currently in the heap
    private int size = 0;
    //the internal capacity of the heap
    private int capacity = 0;
    //A dynamic list to track the elements inside the heap
    private List <T> heap = null;

    /*this map keeps track of the possible indices a particular
    node value is found in the heap. Having this mapping allows us to have 
    O(log(n)) removals and O(1) element containment check at the cost of
    some additional space and minor overhead
    */
    private Map<T,TreeSet<Integer>> map = new HashMap<>();


    //construct and initially empty priority queue
    public PriorityQueue()
    {
        this(1);
    }

    //construct a priority queue with an initial capacity
    public PriorityQueue(int initialCapacity)
    {
        heap = new ArrayList<>(initialCapacity);
    }

    //construct a priority queue using heapify in O(n)
    public PriorityQueue(T[] elems)
    {
        size = capacity = elems.length;
        heap = new ArrayList<>(capacity);
        //places all elements in the heap
        for(int i = 0;i < size;i++)
        {
            mapAdd(elems[i],i);
            heap.add(elems[i]);
        }




        //heapify process, O(n)

        for(int i = Math.max(0,(size/2)-1);i>=0;i--)
        {
            sink(i);
        }
           



    }

    //priority queue construction O(nlog(n))
    public PriorityQueue(Collection<T> elems)
    {
        this(elems.size());
        for(T elem : elems)
        {
            add(elem);
        } 
    }

    //return true/false if the priortiy queue is empty
    public boolean isEmpty()
    {
        return size == 0;
    }
    //clears everything inside the heap, O(n)
    public void clear()
    {
        for(int i = 0;i < capacity;i++)
        {
            heap.set(i,null);
        }
            
        size = 0;
        map.clear();
        
    }

    //return the size of the heap
    public int size()
    {
        return size;
    }

    /*return the value of the element with the lowest
    priority in this priority queue, if the priority
    queue is empty then null is returned
    */
    public T peek()
    {
        if(isEmpty())
        {
            return null;
        } 
        return heap.get(0);
    }



    //remove the root of the heap O(log(n))
    public T poll()
    {
        return removeAt(0);
    }

    //test if an element is in the heap O(1)

    public boolean contains(T element)
    {
        if(element == null) 
        {
            return false;
        }
        return map.containsKey(element);
    }

    //ads an element to the priority queue, tje
    ///element must not be null
    public void add(T elem)
    {
        if(elem == null)
        {
            
            throw new IllegalArgumentException();
        }

        
        if(size < capacity)
        {
            heap.set(size, elem);
        }
        else
        {
            heap.add(elem);
            capacity++;
        }

        swim(size);
        size++;


    }

    //tests if the value of the node i <= node j
    //it assues i and j are valid indexes
    public boolean less(int i, int j)
    {
        T node1 = heap.get(i);
        T node2 = heap.get(j);
        return node1.compareTo(node2) <= 0;
    }

    //bottom up node swim O(log(n))
    public void swim(int n)
    {
        int parent = (n - 1) / 2;
        //keep swimming whule we reached the root and while we're less than our parent
        while( n > 0 && less(n,parent))
        {
            //exchange k with the parent node
            swap(parent, n);
            n = parent;

            //grab the index of the next parent node WRT to k
            parent = (n - 1) / 2;
        }
    }


    //top down node sink, O(log(n))
    public void sink(int k)
    {
        while(true)
        {
            int left = 2 * k + 1; // left node
            int right = 2 * k + 2; //right node
            int smallest = left; //asuume left is the smallest of the two nodes


            //find which is smaller left or right
            //if right is smaller set smallest to the right
            if(right < size && less(right,left))
            {
                smallest = right;

            }
            //stop if we're outside the bound of the tree
            // or stop early if we cant sink k anymore
            if(left >= size || less(k, smallest))
            {
                break;
            } 
    
            //move down the tree following the smallest node
            swap(smallest,k);
            k = smallest;
        }
    }


    //swap two nodes, we assume i and j are valid, O(1)
    public void swap(int i , int j)
    {
        T I = heap.get(i);
        T J = heap.get(j);

        mapSwap(I,J,i,j);
    }

    //removes a particu;ar element in the heap, O(log(n))
    public boolean remove(T elem)
    {
        if(elem == null)
        { 
            return false;
        }

        Integer index = mapGet(elem);
        if(index != null) 
        {
            removeAt(index);
        }
        return index != null;
    }
    //remove a node at a particular index
    public T removeAt(int i)
    {
        if(isEmpty())
        {
            return null;
        }

        size--;
        T data_removed = heap.get(i);
        swap(i,size);

        //obliterate the value
        heap.set(size,null);
        mapRemove(data_removed, size);

        //remove last element
        if(i == size) 
        {
            return data_removed;
        }
        T elem = heap.get(i);

        //try sinking element
        sink(i);


        //if sinking doesnt work trying swimming
        if(heap.get(i).equals(elem))
        {
            swim(i);
        }    

        return data_removed;


    }



    //this method is just for testing purposes to make sure
    //the heap invariant is maintained, called this method
    //call this method with k=0 to start the root
    public boolean isMinHeap(int k)
    {
        if(k >= size)
        {
            return true;
        }
        int left = 2 * k + 1;
        int right = 2 * k + 2;


        /*
         Make sure that the current node k is less than
         both of its children left and right if they exist
         return false otherwise to indicate an invalid heap
         */

        if(left < size && !less(k,left))
        {
            return false;
        }

        if(right < size && !less(k,right))
        {
            return true;
        }




        //use recursion on both children to see if they're valid heaps
        return isMinHeap(left) && isMinHeap(right);
    }

    //add a node value and its index to the map
    public void mapAdd(T value,int index)
    {
        TreeSet <Integer> set = map.get(value);
        //new value is inserted
        if(set == null)
        {
            set = new TreeSet<Integer>();
            set.add(index);
            map.put(value,set);
        }
        else
        {
            set.add(index);
        }
    }
    //rempoves the index at a given value
    public void mapRemove(T value, int index)
    {
        TreeSet <Integer> set = map.get(value);
        set.remove(index);
        if(set.size() == 0)
        {
            map.remove(value);
        }
    }


    //extract an index position for the given value
    private Integer mapGet(T value)
    {
        TreeSet <Integer> set = map.get(value);
        if(set != null)
        {
            return set.last();
        }
        return null;
    }

    //exchange the index of two nodes internally within the map
    public void mapSwap(T val1, T val2,int index1, int index2)
    {
        Set<Integer> set1 = map.get(val1);
        Set<Integer> set2 = map.get(val2);

        set1.remove(index1);
        set2.remove(index2);

        set1.add(index1);
        set2.add(index2);

    }

    @Override public String toString()
    {
        return heap.toString();
    }






}