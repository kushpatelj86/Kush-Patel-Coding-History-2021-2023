public class SwappingVariables
{
    public static void main(String[] args) 
    {
        

        String x = "Water";
        String y = "Kool-Aode";
        String temp;


        temp = x;
        x = y;
        y = temp;


        System.out.println("X: " + x);
        System.out.println("Y: " + y);

    }
}


