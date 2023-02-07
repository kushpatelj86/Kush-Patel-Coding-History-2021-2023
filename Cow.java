/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          03-07-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 20
 *<BR> Description:   We get sounds of other animals
 *<BR> Cite Sources:  Mr.Eliot taught were to use the Math.random
 */
public class Cow extends Animal
{
    public Cow()
    {
        super("Cow", "moo");
    }

    public Cow(String Type, String Sound)
    {
        super(Type, Sound);
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