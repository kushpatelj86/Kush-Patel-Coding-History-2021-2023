/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          03-07-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 20
 *<BR> Description:   We get sounds of other animals
 *<BR> Cite Sources:  Mr.Eliot taught were to use the Math.random
 */
import java.util.ArrayList;

public class Farm
{
  private ArrayList <Animal> MyFarm = new ArrayList <Animal>();

  public Farm()
  {
    MyFarm.add(new Cow());
    MyFarm.add(new Chick());
    MyFarm.add(new Chick("f"));
    MyFarm.add(new Pig());
    MyFarm.add(new NamedCow("Chris"));
    MyFarm.add(new NamedCow("Soos"));
    MyFarm.add(new NamedCow("Stroos"));

    //plus more Animals to test
  }
  public void animalSounds()
  {
    Animal MyAnimal;
    for (int i = 0; i < MyFarm.size(); i++)
    {
      MyAnimal = MyFarm.get(i);
      System.out.println(MyAnimal.getType() + " goes " + MyAnimal.getSound());
      if (MyAnimal instanceof NamedCow)
      {
        //extra parenthesis FORCE typecasting to (NamedCow) BEFORE use of .getName() method
        System.out.println( "The NamedCow is known as " + ((NamedCow)MyAnimal).getName());
      }
    }
  }
}