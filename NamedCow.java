/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          03-07-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 20
 *<BR> Description:   We get sounds of other animals
 *<BR> Cite Sources:  Mr.Eliot taught were to use the Math.random
 */
public class NamedCow extends Cow
{
    private String MyName;
    
    public NamedCow()
    {
      super("NamedCow", "moo");  
      MyName = "Moose"; 
    }
    
    public NamedCow(String Name)
    {
      super("NamedCow", "moo");    
      MyName = Name;
    }

    public String getName()
    {
        return MyName;
    }

    public String getSound()
    {
      return MySound;
    }
  
    public String getType()
    {
      return MyType;
    }
}