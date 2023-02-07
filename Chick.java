/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          03-07-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 20
 *<BR> Description:   We get sounds of other animals
 *<BR> Cite Sources:  Mr.Eliot taught were to use the Math.random
 */
public class Chick extends Animal
{
    private boolean canMakeRandomSound;
    
    public Chick()
    {
        super("Chick", "cluck");
        canMakeRandomSound = false;
    }
    public Chick(String Kid)
    {
        super("Chick", "cluck");  
        canMakeRandomSound = true;
    }

    public String getSound()
    {
        if(canMakeRandomSound == true && Math.random() < 0.5)
        {
            return "cheep";
        }
        else
        {
            return MySound;
        }

    }
  
    public String getType()
    {
      return MyType;
    }
}