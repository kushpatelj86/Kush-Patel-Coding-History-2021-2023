
@SuppressWarnings("unchecked")
public class HashTableQuadraticProbing<K, V> extends HashTableOpenAdressingBase<K, V> {



  // This is the linear constant used in the linear probing, it can be
  // any positive number. The table capacity will be adjusted so that
  // the GCD(capacity, LINEAR_CONSTANT) = 1 so that all buckets can be probed.
    public HashTableQuadraticProbing()
    {
        super();
    }

    public HashTableQuadraticProbing(int capacity)
    {
        super(capacity);
    }
  // Designated constructor
    public HashTableQuadraticProbing(int capacity, double loadFactor) 
    {
        super(capacity, loadFactor);
    }

  // Given a number this method finds the next
  // power of two above this value.
    private static int nextPowerOfTwo(int n)
    {
        return Integer.highestOneBit(n) << 1;
    }



  // No setup required for quadratic probing.
    @Override
    protected void setupProbing(K key) 
    {
        
    }

    @Override
    protected int probe(int x) 
    {
    // Quadratic probing function (x^2+x)/2
        return (x * x + x) >> 1;
    }


  // Increase the capacity of the hashtable to the next power of two.
  @Override
    protected void increaseCapacity()
    {
        capacity = nextPowerOfTwo(capacity);
    }









  // Adjust the capacity of the hashtable to be a power of two.
    @Override
    protected void adjustCapacity() {
        int pow2 = Integer.highestOneBit(capacity);
        if(capacity == pow2)
        {
            return;
        }
        increaseCapacity();
        
    }


    




}
