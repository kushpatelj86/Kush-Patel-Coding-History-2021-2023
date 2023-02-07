import java.util.HashMap;
import java.util.Map;

public class MapExamples
{
    
    public static void main(String[] args) {
        
    
    
    HashMap m = new HashMap();
    String str = "hello my name is kush and I'm cool";

    for(char x: str.toCharArray())
    {
        if(m.containsKey(x))
        {
            int old = (int) m.get(x);
            m.put(x,old + 1);
        }
        else
        {
            m.put(x,1);
        }
    }
    m.remove(' ');
    System.out.println(m);
    }
    
}