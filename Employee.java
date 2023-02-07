import java.util.ArrayList;

import javax.print.attribute.standard.MediaSize.NA;

public class Employee implements BasicQualifications
{
    private  String education;
    private String skillsAndAbilities;
    private String name;
    private String availabilty;
    private String location;
    private String respsnibilityAndDuties;
    private String problem;
    private boolean isOnBreak;
    private int numYearsExperience;
    private String Greeting;
    private String Question;
    private String Answer;



    public Employee(Employee OtherEmployee)
    {
        education = OtherEmployee.getEducation();
        skillsAndAbilities = OtherEmployee.getEmployeesSkillsAndAbilities();
        name = OtherEmployee.getName();
        availabilty = OtherEmployee.getEmployeeAvailability();
        location = OtherEmployee.employeeLocation();
        respsnibilityAndDuties = OtherEmployee.getResponsibility();
    }



    public Employee()
    {
        name = "John Calmes";
        education =  "Bachelor's Degree in Computer Science";
        availabilty =  "9:00 AM to 5:00 PM";
        location =  "Tustin, Ca";
        skillsAndAbilities =  "Java, C++, and Python";
        respsnibilityAndDuties =  "Programming the Software";
    }
    
    public Employee(String n, String ed,String avail, String locat,String skill, String resp)
    {
        name = n;
        education =  ed;
        availabilty =  avail;
        location =  locat;
        skillsAndAbilities =  skill;
        respsnibilityAndDuties =  resp;
    }

    
    public String getEmployeeAvailability()
     {
        return availabilty;
    }

    public void setEmployeeAvailability(String Availability) 
    {
        this.availabilty = Availability;         
    }

    public String employeeLocation() 
    {
        return location;
    }
    

    public void setLocation(String loc) 
    {
        this.location = loc;        
    }

    public String getEmployeesSkillsAndAbilities()
    {
       return skillsAndAbilities;
   }

   public void setEmployeesSkillsAndAbilities(String Ability) 
   {
       this.skillsAndAbilities  =  Ability;
       
   }
    public void setEducation(String Education)
    {
      education = Education;
    }

    public String getEducation()
    {
        return education;
    }
    public void setProblem(String prob)
    {
        problem = prob;
    }

    public String getProblem()
    {
        return problem;
    } 
    public void problemSolve() 
    {
        
        problem = null;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public String getName()
    {
        return name;
    }

    public String getResponsibility() 
    {
        return respsnibilityAndDuties;
    }

    public void setResponsibility(String resp) 
    {
        this.respsnibilityAndDuties = resp;        
    }
    public void takeABreak(boolean bre)
    {
        isOnBreak = bre;
    }
    public String getQuestion()
    {
        return Question;
    }

    public void askQuestion(String question)
    {
        this.Question = question;
    }

    public String getAnswer()
    {
        return Answer;
    }

    public void setAnswer(String ans)
    {
        this.Answer = ans;
    }

     public boolean isOnBreak()
    {
        return isOnBreak;
    }
    public String toString()
    {
        return "Name: " + name + ", Education: " + education + ", Skills and Abilties: " + skillsAndAbilities + ", Location: " + location +  ", Availability: " + availabilty + ", Responsibilities and Duties: " + respsnibilityAndDuties;

    }

    public int numYearsExperience()
    {
       return numYearsExperience;
   }

   public void setNumYearsExperience(int num) 
   {
       this.numYearsExperience = num;        
   }

   public String getGreeting()
   {
       return Greeting;
   }
   public void setGreeting(String str)
   {
       this.Greeting = str;
   }




   
}