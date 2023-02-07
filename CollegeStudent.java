/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          12/01/21
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 11.1
 *<BR> Description:  We will be priting out info of different type of people and using inheritance, the super method is used by the child class to get variables and method from the parent class
 *<BR> Cite Sources:  Mr.Eliot taught me what the super method is. Websites I used: https://ap.mreliot.com/LessonA11/Lab-A11-1.html
 */
public class CollegeStudent extends Student
{
    private String MyMajor;
    private int myYear;

    public CollegeStudent(String Name, int age, String Gender, String IdNum, double gpa, int year, String Major)
    {
        super(Name, age, Gender, IdNum, gpa);
        myYear = year;
        MyMajor = Major;
    }

    public String getMajor()
    {
        return MyMajor;
    }

    public int getYear()
    {
        return myYear;
    }

    public void setMajor(String Major)
    {
        MyMajor = Major; 
    }

    public void setYear(int year)
    {
        myYear = year;
    }

    public String toString()
    {
        return super.toString() + ", Year: " + myYear + ", Major: " + MyMajor;
    }

}