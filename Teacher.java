/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          12/01/21
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 11.1
 *<BR> Description:  We will be priting out info of different type of people and using inheritance, the super method is used by the child class to get variables and method from the parent class
 *<BR> Cite Sources:  Mr.Eliot taught me what the super method is. Websites I used: https://ap.mreliot.com/LessonA11/Lab-A11-1.html
 */
public class Teacher extends Person

{
    private String MySubject;
    private String MyEmployeeID;
    private double mySalary;

    public Teacher(String Name, int age, String Gender, String Subject, double salary, String id)
    {
        super(Name, age, Gender);
        MySubject = Subject;
        mySalary = salary;
        MyEmployeeID = id;
    }

    public String getSubject()
    {
        return MySubject;
    }

    public String getEmployeeID()
    {
        return MyEmployeeID;
    }

    public double getSalary()
    {
        return mySalary;
    }

    public void setSubject(String Subject)
    {
        MySubject = Subject;
    }

    public void setEmployeeID(String id)
    {
        MyEmployeeID = id;
    }

    public void setSalary(double salary)
    {
        mySalary = salary;
    }
    public String toString()
    {
        return super.toString() + ", Subject: " + MySubject + ", Salary: " + mySalary + ", Employee ID: " + MyEmployeeID;
    }

}