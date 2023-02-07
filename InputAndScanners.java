import java.util.Scanner; // we must always do an import if we are using a scanner to get input

public class InputAndScanners
{
    public static void main(String[] args)
    {
        int i = 56 % 5; //modulus is essentially the remainder of 56 devided by 5 so it is 11 remainder 1, it reurns 1 which is the remainder of a division
        System.out.println(i);
        Scanner MyInput = new Scanner(System.in);//scanner is a different type of data type
        System.out.print("Enter a name: ");
        String scanned = MyInput.next(); //.next() is the string, it automactically skips a line
        System.out.println("It was scanned " + scanned);
        System.out.println();
        System.out.print("Enter age: ");
        int num = MyInput.nextInt();  //.nextInt() is used when we input a integer
        System.out.println("It was age " + num); //if we type a data type that not an integer number it will crash

        System.out.print("Enter a boolean: ");
        boolean condition = MyInput.nextBoolean(); //.nextBoolean() is used for a boolean, it automactically skips a line
        System.out.println("It was scanned " + condition); //if we type a data type thats not true or false spelling exact it will crash
        System.out.println();


        System.out.print("Enter a double: ");
        double er = MyInput.nextDouble(); //.nextDouble() is used for a double, it automactically skips a line
        System.out.println("It was scanned " + er); //if we type a data type thats not a double it will crash, int can work as input but will be converted to a double
        System.out.println();

        //we can type cast after the creation of the scanner
        System.out.print("Enter a scan: ");
        String scan = MyInput.next();
        System.out.println("It was scanned " + scan);
        System.out.println();

        System.out.print("Enter a int: ");
        int x = Integer.parseInt(scan);
        System.out.println(x);

    }
}