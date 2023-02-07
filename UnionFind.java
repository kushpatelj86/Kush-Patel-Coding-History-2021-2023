/*
 * UnionFind/Disjoint Set data structure implementation
 * this code is an inspired modification of the union find implementation
 */
public class UnionFind
{
    ///the number of elements in this union find
    private int size;

    ///used to track the size of each component using a array
    private int[] sz;

    //id[i] points to the parent of i, if id[i] = i then i is a root node

    private int[] id;


    ///tracks the number of components in the unionn find
    private int numComponents;

    public UnionFind(int size)
    {
        if(size <= 0)
        {
            throw new IllegalArgumentException("Size <= 0 is not allowed");
        }
        this.size = numComponents = size;
        sz = new int[size];
        id = new int[size];


        for(int i = 0; i < size; i++)
        {
            id[i] = i; //link to itself(self root)
            sz[i] = 1; //each componet is originally of one size
        }
    }

    //find which component/set 'p' belongs to, takes amortized constant time
    public int find(int p)
    {
        int root = p;
        while(root != id[root])
        {
            root = id[root];
        }
        //compress the path leading back to the root
        //doing this operation is called "path compression" 
        //and is what gives us amortized constant tme complexity
        while(root != id[root])
        {
            int next = id[p];
            id[p]= root;
            p = next;
        }
        return root;
    }

    //return wheter or ot the elements p and g and not the same component
    public boolean connected(int p,int q)
    {
        return find(p) == find(q);
    }
    //return the size of the components/set p belogs to
    public int componentSize(int p, int q)
    {
        return sz[find(p)];
    }

    //return th number of elements in this unionfind/disjoint set
    public int size()
    {
        return size;
    }

    //return the number of remaining components/sets
    public int components()
    {
        return numComponents; 
    }

    //unift the components/set containing elements 'p' and 'q'
    public void unify(int p, int q)
    {
        int root1 = find(p);
        int root2 = find(q);

        //these elements are already in the same group
        if(root1 == root2)
        {
            return;
        }

        //merge two components/sets together
        //merge smaller component/set into the larger one
        if(sz[root1] < sz[root2])
        {
            sz[root2] += sz[root1];
            id[root1] = root2;
        }
        else
        {
            sz[root1] += sz[root2];
            id[root2] = root1;
        }


        //since the roots found are different we know that the
        //number of components/sets has decreased by one
    }


}