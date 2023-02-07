import java.util.Scanner;

public class IfStatements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        if(s.equals("tim")) //when you compare string do .equals() and if it meets that condition in the if statement it will do stuff the if block tell it to do
        {
            System.out.println("You are tim");
        }
        else if(s.equals("hello")) // checks that if the if condition is false, its ok to have jkust a if or an else if without the else
        {
            System.out.println("Hi");
        }
        else if(s.equals("hello")) //will not check it and do stuff if that is true because there  is already the same else if on the top, and always looks at the top one first
        {
            System.out.println("hello");

        }
    
        else
        {
            System.out.println("Hello"); //if the first ifstatement or any other else  if is false it will print thwe stuff listed in the else block
        }
        System.out.println("Hello");//this will print becuase  hello at all times because it's not part of of the if else blocks








    
    }
}