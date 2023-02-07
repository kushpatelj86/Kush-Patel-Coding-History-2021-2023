/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          03-07-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 20
 *<BR> Description:   We get sounds of other animals
 *<BR> Cite Sources:  Mr.Eliot taught were to use the Math.random
 */
public abstract class Animal
{
    protected String MyType;
    protected String MySound;


    public Animal(String Type, String Sound)
    {
        MyType = Type;
        MySound = Sound;
    }

    public abstract String getSound();
    public abstract String getType();
    
}