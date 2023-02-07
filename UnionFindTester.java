public class UnionFindTester
{
    public static void main(String[] args) {
        UnionFind newUnion = new UnionFind(7);
        System.out.println("Find: " + newUnion.find(4));
        System.out.println("Connected: " + newUnion.connected(2,4));
        System.out.println("Component Size: " + newUnion.componentSize(2,4));
        System.out.println("Size: " + newUnion.size());
        System.out.println("Components: " + newUnion.components());
         newUnion.unify(2,3);
         System.out.println("Find: " + newUnion.find(4));
        System.out.println("Connected: " + newUnion.connected(2,4));
        System.out.println("Component Size: " + newUnion.componentSize(2,4));
        System.out.println("Size: " + newUnion.size());
        System.out.println("Components: " + newUnion.components());

    }
}