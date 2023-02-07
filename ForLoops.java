import java.util.Scanner;
public class ForLoops 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,3,5,3,6,2};
        for(int i = 0; i < arr.length;i++)
        {
            System.out.println(i);
        }


        String[] name = new String[0];
        Scanner s = new Scanner(System.in);
        for(int j = 0; j < name.length;j++)
        {
            System.out.print("Input: ");
            String input = s.nextLine();
            name[j] = input;
        }

        for(String n : name)//range based/for each loop
        {
            System.out.println(n); 
        }










    }
}
