import java.util.Scanner;

public class NestedStatements
{
    public static void main(String[] args)
    {
        
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);


        if(age >= 13)
        {
            System.out.println("You are mature");

            if(age >= 18) //only checks this if statement if the  if statement block it sin right now is true or age is greater than 13
            {
                System.out.println("You are legal");

            }
            else//only checks this if statement if the  if statement block it sin right now is true or age is greater than 13
            {
                System.out.println("You are a minor");
            }
        }

        else
        {
            System.out.println("You are immature");
        }

    
    }
}