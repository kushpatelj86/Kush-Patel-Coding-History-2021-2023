public class BasicOperators 
{
    public static void main(String[] args)
    {
        int x = 4;
        int y = 6;
        int z = 34; //we first must declare and initiliaze a variable

        int addSum = x + y + z; //we will be using the addition operator of  + to add these variables together
       System.out.println(addSum);

       int subtrctSum = x - y - z; //we will be using the subtraction operator of - to substract these variables from each other
       System.out.println(subtrctSum);

        int multSum = x * y * z; // we will be using the multiplication operator of * to multiply these variables
        System.out.println(multSum);

        int divSum = x / y / z; //we will be using the division operator to devide these
        System.out.println(divSum);

        int divsum2 = z / y; // it returns 5 because int 34 / int 6  = 5 in java
        System.out.println(divsum2);

        //think all of it like order of operation where you start with parenthesis, then multiplication/division , and then addition and substractiion, parenthesis have the highest precedence meaining which one has more priority to calculate


        int a = x *(y-z) + 2;
        System.out.println(a);

        double d = Math.pow(2,3); //the first paramenter is the base and the second parameter is the exponent so it is 2 times 2 times 2 or 2 ^3 or 2 to the power of 3, and it returns a double
        System.out.println(d);


        int e = Math.abs(-25); // it reutns the absolute value of -25 or |-25| which is positve25
        System.out.println(e);

        double f = (double) e / d; // when you put (data type) before a variable you are type casting it meaning your changing the data type from its current data type like an int to a new data type called a double
        System.out.println(f);

        //you can store a int in a double but not a double in a int or else you get a eror

    }
}