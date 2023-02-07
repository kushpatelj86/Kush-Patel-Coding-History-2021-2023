/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          12/01/21
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 11.1
 *<BR> Description:  We will be priting out info of different type of people and using inheritance, the super method is used by the child class to get variables and method from the parent class
 *<BR> Cite Sources:  Mr.Eliot taught me what the super method is. Websites I used: https://ap.mreliot.com/LessonA11/Lab-A11-1.html
 */

public class Person
{
   private String MyName; // Name of the person
   private int myAge;  // person's age in years
   private String MyGender; // "M" for male, "F" for female

 // constructor

   public Person(String Name, int age, String Gender)
   {
       MyName = Name;
       myAge = age;
       MyGender = Gender;
   }

   public String getName()
   {
       return MyName;
   }
   

   public int getAge()
   {
       return myAge;
   }

   public String getGender()
   {
       return MyGender;
   }

   public void setName(String Name)
   {
       MyName = Name;
   }

   public void setAge(int age)
   {
       myAge = age;
   }

   public void setGender(String Gender)
   {
       MyGender = Gender;
   }

   public String toString()
   {
       return "Name: " + MyName + ", Age: " + myAge + ", Gender: " + MyGender;    
   }
}