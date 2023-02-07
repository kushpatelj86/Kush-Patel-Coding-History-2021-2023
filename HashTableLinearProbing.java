
@SuppressWarnings("unchecked")
public class HashTableLinearProbing<K, V> extends HashTableOpenAdressingBase<K, V> {

    private static final int LINEAR_CONSTANT = 17;


  // This is the linear constant used in the linear probing, it can be
  // any positive number. The table capacity will be adjusted so that
  // the GCD(capacity, LINEAR_CONSTANT) = 1 so that all buckets can be probed.
    public HashTableLinearProbing()
    {
        super();
    }

    public HashTableLinearProbing(int capacity)
    {
        super(capacity);
    }

    public HashTableLinearProbing(int capacity, double loadFactor) 
    {
        super(capacity, loadFactor);
    }


    @Override
    protected void setupProbing(K key)
    {

    }

    @Override
    protected int probe(int x)
    {
        return LINEAR_CONSTANT * x;
    }

    // Adjust the capacity so that the linear constant and
  // the table capacity are relatively prime.
  
@Override
protected void adjustCapacity() 
{
    // TODO Auto-generated method stub
    while(gcd(LINEAR_CONSTANT,capacity) != 1)
    {
        capacity++;
    }
}




}
