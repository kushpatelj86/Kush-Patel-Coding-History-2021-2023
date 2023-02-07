
import java.util.Random;
public class RandomFunctions
{
    public static void main(String[] args) 
    {
        Random r = new Random();

        int x = r.nextInt(6) + 1; //generate an integer from 1 to 6
        System.out.println(x);


        double y = r.nextDouble(); // generates a random double between 0 and 1
        System.out.println(y);


        boolean z = r.nextBoolean(); //generates a random boolean which is true or false
        System.out.println(z);



    }
}