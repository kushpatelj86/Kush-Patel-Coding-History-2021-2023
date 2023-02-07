public class AeronauticalEngineer extends Employee implements Qualifications, Actions
{
    private int numYearsExperience;
    private String priorExperience;
    private String education;
    private String skillsAndAbilities;
    private String availability;
    private String location;
    private String responsibilty;
    private String problem;
    private String Question;
    private String Answer;
    private String Greeting;
    private boolean isOnBreak;
    private String name;

    public AeronauticalEngineer(AeronauticalEngineer OtherAeronauticalEngineer)
    {
        name = OtherAeronauticalEngineer.getName();
        education = OtherAeronauticalEngineer.getEducation();
        skillsAndAbilities = OtherAeronauticalEngineer.getEmployeesSkillsAndAbilities();
        name = OtherAeronauticalEngineer.getName();
        availability = OtherAeronauticalEngineer.getEmployeeAvailability();
        location = OtherAeronauticalEngineer.employeeLocation();
        responsibilty = OtherAeronauticalEngineer.getResponsibility();
        priorExperience = OtherAeronauticalEngineer.priorExperience();
        numYearsExperience = OtherAeronauticalEngineer.numYearsExperience();
    }
    public AeronauticalEngineer()
    {
        name = "John Lewis";
        education =  "Bachelor's Degree in Aerospace Engineering";
        availability =  "11:00 AM to 4:00 PM";
        location =  "Hawthorne, Ca";
        skillsAndAbilities =  "Jet Propulsion, Dynamics, and Aerodynamics";
        responsibilty =  "Design and fix aircraft";
        numYearsExperience = 1;
        priorExperience = "Graduate Master's Student at Cal State Long Berach";
    }
    public AeronauticalEngineer(String n, String ed,String avail, String locat,String skill, String resp, int numYearsExp, String prior)
    {
        super(n, ed, avail, locat, skill, resp);
        numYearsExperience = numYearsExp;
        priorExperience = prior;
    }

    public String getEducation()
    {
        return education;
    }

    
    public int numYearsExperience()
     {
        return numYearsExperience;
    }

    public void setNumYearsExperience(int num) 
    {
        this.numYearsExperience = num;        
    }

    
    public String priorExperience() 
    {

        return priorExperience;
    }

    public void setPriorExperience(String Exper)
    {
        this.priorExperience  = Exper;         
    }

    
    public String getEmployeesSkillsAndAbilities()
     {
        return skillsAndAbilities;
    }

    public void setEmployeesSkillsAndAbilities(String Ability) 
    {
        this.skillsAndAbilities  =  Ability;
        
    }

    public String getEmployeeAvailability()
     {
        return availability;
    }

    public void setEmployeeAvailability(String Availability) 
    {
        this.availability = Availability;         
    }

    public String employeeLocation() 
    {
        return location;
    }

    public void setLocation(String loc) 
    {
        this.location = loc;        
    }

    public String getResponsibility() 
    {
        return responsibilty;
    }

    public void setResponsibility(String resp) 
    {
        this.responsibilty = resp;        
    }
    public String toString()
    {
        return super.toString() + " ,Number of Years of Experience :" + numYearsExperience + " ,Prior Experience: " + priorExperience + " ,Has a Day Off : " + isOnBreak;

    }
    public boolean isElligible(String ed)
    {
        if(ed.equals("Bachelor's Degree in Aerospace Engineering") || ed.compareTo("Bachelor's Degree in Aerospace Engineering") == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getProblem()
    {
        return problem;
    }
    
    public void problemSolve() 
    {
        
        this.problem = null;
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

    public String getGreeting()
    {
        return Greeting;
    }
    public void setGreeting(String str)
    {
        Greeting = str;
    }
    public void takeABreak(boolean bre)
    {
        isOnBreak = bre;
    }
   
   
   
     public boolean isOnBreak()
    {
        return isOnBreak;
    }

}