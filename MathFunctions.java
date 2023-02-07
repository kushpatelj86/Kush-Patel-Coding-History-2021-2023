public class MathFunctions
{
    
    public static void main(String[] args) 
    {
        double x = 3.14;
        double y = -10;
        
        double a = Math.max(x,y);
        System.out.println(a);

        double b = Math.min(x,y);
        System.out.println(b);

        double c = Math.abs(y); //absolute value
        System.out.println(c);

        double d = Math.sqrt(x); //squareroot of ther number
        System.out.println(d);


        double e =  Math.round(x); //rounds to the nearest integer
        System.out.println(e);

        double f = Math.ceil(x); //always round up
        System.out.println(f);


        double g = Math.floor(x); //always round down
        System.out.println(g);



    }
    
    
    
    
    



}
