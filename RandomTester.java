public class RandomTester
{
    public static void main(String[] args) 
    {
        printEvenMultiple(7, 6);
        int[][] arr2D= {{1,0,1},{1,0,3}};
       System.out.println(reverse("Hello"));
    }

    public static void printEvenMultiple(int value, int howMany)
    {
        int num = 0;
        int sum = value;


        while(num < howMany)
        {
            if(sum % 2 == 0)
            {
                System.out.println("The even multiple of " + value + " is " + sum);
            }
            sum += value;
            num++;
        }
    }

    public static String reverse(String Input)
    {
        String Result;
        String LastWord = (Input.substring(Input.length() - 1));
        String OtherWords = (Input.substring(0,Input.length() - 1));

        if(Input.length() <= 1)
        {
            Result = Input;
        }
        else
        {
            Result = LastWord + reverse(OtherWords);
        }

        
        return Result;
    }


    

}