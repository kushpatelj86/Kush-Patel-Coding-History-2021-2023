import java.util.ArrayList;
public class TwoDimensionalArrayList
{
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");


        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchinis");
        produceList.add("peppers");


        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("soda");
        drinkList.add("coffee");
        
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);
        System.out.println(groceryList);




        System.out.println("Firtst list: " + groceryList.get(0));
        System.out.println("Firtst element of first list: " + groceryList.get(0).get(0));

    }
}