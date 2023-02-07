/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          12/01/21
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 11.1
 *<BR> Description:  We will be priting out info of different type of people and using inheritance, the super method is used by the child class to get variables and method from the parent class
 *<BR> Cite Sources:  Mr.Eliot taught me what the super method is. Websites I used: https://ap.mreliot.com/LessonA11/Lab-A11-1.html
 */
public class Student extends Person
{
    private String MyIdNum; // Student ID Number
    private double myGPA;      // grade point average

     // constructor
    public Student(String Name, int age, String Gender, String IdNum, double gpa)
    {
        // use the super class constructor
        super(Name, age, Gender);

        ///initialize what is new for a Student
        MyIdNum = IdNum;
        myGPA = gpa;
    }

    public String getIdNum()
    {
        return MyIdNum;
    }

    public double getGPA()
    {
        return myGPA;
    }
    
    public void setIdNum(String IdNum)
    {
        MyIdNum = IdNum;
    }

    public void setGPA(double gpa)
    {
        myGPA = gpa;
    }
   
    // overrides the .toString() method from the parent class
    public String toString()
    {
        return super.toString() + ", Student ID: " + MyIdNum + ", GPA: " + myGPA;
    }
}