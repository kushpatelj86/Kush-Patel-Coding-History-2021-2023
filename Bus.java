import java.util.Currency;

public class Bus
{
    private int currentStop;
    private int numStops;
    private int firstStop;
    private int lastStop;

    public Bus(int num)
    {
        currentStop = 1;
        numStops = num;
        firstStop = 1;
        lastStop = num;
        
    }

    public int getCurrentStop()
    {
        return currentStop;
    }
   /* public void move()
    {
        boolean quitLoop1 = true;
        if(currentStop >= firstStop && currentStop < lastStop && quitLoop1 == true)
        {
            currentStop++;
        }
        else if(currentStop == lastStop)
        {
            quitLoop1 = false;
        }


        else if(currentStop > firstStop)
        {
            currentStop--;
        }
        else 
        {
            currentStop++;
        }
    }*/

    public void move()
    {
        if(currentStop >= firstStop && currentStop < lastStop)
        {
            currentStop++;
        }
      


        else if(currentStop == lastStop || currentStop > firstStop)
        {
            currentStop--;
        }
        else
        {
            currentStop++;
        }
    }

    public static void main(String[] args) 
    {
        Bus b1 = new Bus(5);

        System.out.println(b1.getCurrentStop());
        b1.move();
        System.out.println(b1.getCurrentStop());
        b1.move();
        System.out.println(b1.getCurrentStop());
        b1.move();
        System.out.println(b1.getCurrentStop());
        b1.move();
        System.out.println(b1.getCurrentStop());
        b1.move();
        System.out.println(b1.getCurrentStop());
        b1.move();
        System.out.println(b1.getCurrentStop());
        b1.move();
        System.out.println(b1.getCurrentStop());

    }
    
}