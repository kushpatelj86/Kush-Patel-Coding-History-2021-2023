/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          03-07-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 20
 *<BR> Description:   We get sounds of other animals
 *<BR> Cite Sources:  Mr.Eliot taught were to use the Math.random
 */
public class OldMacDonald
{
    public static void main(String[] args) 
    {
        Farm TestFarm = new Farm();
        Cow MyCow = new Cow();
        Cow MyCow2 = new Cow("Cow", "Moo");
        Chick MyChick = new Chick();
        Chick MyNewChick = new Chick("Kid");
        Pig MyPig = new Pig();
        NamedCow NameCow2 = new NamedCow("Moose");
        NamedCow NameCow3 = new NamedCow("Soos");
        NamedCow NameCow4 = new NamedCow("Stroos");
        NamedCow NameCow = new NamedCow();
        System.out.println();
        System.out.println("Testing Methods: ");
        System.out.println();
        System.out.println( MyCow.getType() + " goes " + MyCow.getSound() );
        System.out.println( MyCow2.getType() + " goes " + MyCow2.getSound() );

        System.out.println( MyChick.getType() + " goes " + MyChick.getSound() );
        System.out.println( MyNewChick.getType() + " goes " + MyNewChick.getSound() );
        System.out.println( MyPig.getType() + " goes " + MyPig.getSound() );
        System.out.println( NameCow.getType() + " goes " + NameCow.getSound() + " and is named " + NameCow.getName());
        System.out.println( NameCow2.getType() + " goes " + NameCow2.getSound() + " and is named " + NameCow2.getName());
        System.out.println( NameCow3.getType() + " goes " + NameCow3.getSound() + " and is named " + NameCow3.getName());
        System.out.println( NameCow4.getType() + " goes " + NameCow4.getSound() + " and is named " + NameCow4.getName());

        System.out.println();
        System.out.println("Testing Animal Sounds: ");
        System.out.println();

        TestFarm.animalSounds();
        
        
    }

    
}
/*

Testing Methods: 

Cow goes moo
Chick goes cluck
Chick goes cluck
Pig goes oink
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Soos
NamedCow goes moo and is named Stroos

Testing Animal Sounds:

Cow goes moo
Chick goes cluck
Chick goes cheep
Pig goes oink
NamedCow goes moo
The NamedCow is known as Chris
NamedCow goes moo
The NamedCow is known as Soos
NamedCow goes moo
The NamedCow is known as Stroos

Testing Methods: 

Cow goes moo
Chick goes cluck
Chick goes cheep
Pig goes oink
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Soos
NamedCow goes moo and is named Stroos

Testing Animal Sounds:

Cow goes moo
Chick goes cluck
Chick goes cheep
Pig goes oink
NamedCow goes moo
The NamedCow is known as Chris
NamedCow goes moo
The NamedCow is known as Soos
NamedCow goes moo
The NamedCow is known as Stroos

Testing Methods: 

Cow goes moo
Chick goes cluck
Chick goes cluck
Pig goes oink
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Soos
NamedCow goes moo and is named Stroos

Testing Animal Sounds:

Cow goes moo
Chick goes cluck
Chick goes cluck
Pig goes oink
NamedCow goes moo
The NamedCow is known as Chris
NamedCow goes moo
The NamedCow is known as Soos
NamedCow goes moo
The NamedCow is known as Stroos

Testing Methods: 

Cow goes moo
Chick goes cluck
Chick goes cluck
Pig goes oink
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Soos
NamedCow goes moo and is named Stroos

Testing Animal Sounds:

Cow goes moo
Chick goes cluck
Chick goes cheep
Pig goes oink
NamedCow goes moo
The NamedCow is known as Chris
NamedCow goes moo
The NamedCow is known as Soos
NamedCow goes moo
The NamedCow is known as Stroos

Testing Methods: 

Cow goes moo
Chick goes cluck
Chick goes cheep
Pig goes oink
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Soos
NamedCow goes moo and is named Stroos

Testing Animal Sounds:

Cow goes moo
Chick goes cluck
Chick goes cluck
Pig goes oink
NamedCow goes moo
The NamedCow is known as Chris
NamedCow goes moo
The NamedCow is known as Soos
NamedCow goes moo
The NamedCow is known as Stroos


Testing Methods: 

Cow goes moo
Chick goes cluck
Chick goes cluck
Pig goes oink
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Moose
NamedCow goes moo and is named Soos
NamedCow goes moo and is named Stroos

Testing Animal Sounds:

Cow goes moo
Chick goes cluck
Chick goes cheep
Pig goes oink
NamedCow goes moo
The NamedCow is known as Chris
NamedCow goes moo
The NamedCow is known as Soos
NamedCow goes moo
The NamedCow is known as Stroos
*/