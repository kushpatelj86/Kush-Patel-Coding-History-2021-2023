public class Enum
{
    public static void main(String[] args) {
        Level lvl = Level.LOW;
        Level[] arr = Level.values();
        for (int i = 0; i < arr.length; i++)
         {

            System.out.println(arr[i]);
         }

        if(lvl == Level.LOW)
        {
            System.out.println(lvl);
        }
        else if(lvl == Level.MEDIUM)
        {
            System.out.println(lvl);

        }
        else
        {
            System.out.println(lvl);

        }
    }
}