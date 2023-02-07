
public class DynamicArrayTester
{
    public static void main(String[] args) 
    {
        DynamicArray dynamicArray = new DynamicArray(5);
        System.out.println(dynamicArray.size());


        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size());
        System.out.println("empty: " + dynamicArray.isEmpty());
        System.out.println("First Element: " + dynamicArray.get(0));
        dynamicArray.set(0,"C");
        dynamicArray.clear(); // removes all elements
        System.out.println(dynamicArray);
        System.out.println("empty: " + dynamicArray.isEmpty());
        System.out.println("size: " + dynamicArray.size());
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.removeAt(2);
        dynamicArray.remove("B");
        System.out.println("Location: " + dynamicArray.indexOf("A"));
        System.out.println("Cointains: " + dynamicArray.contains("A"));



    }
}
