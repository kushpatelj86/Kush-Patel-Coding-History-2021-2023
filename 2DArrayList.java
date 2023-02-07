import java.util.ArrayList;
public class 2DArrayList
{
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");


        ArrayList<String> produceList = new ArrayList();
        bakeryList.add("tomatoes");
        bakeryList.add("zucchinis");
        bakeryList.add("peppers");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("soda");
        drinkList.add("coffee");


        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);
        System.out.print(drinkList)


        System.out.println("First list " + groceryList.get(0));
        System.out.println("First element of first list " + groceryList.get(0).get(0));




    }
}