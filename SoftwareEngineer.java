public class SoftwareEngineer extends Employee implements Qualifications, Actions
{
    private int numYearsExperience;
    private String priorExperience;
    private String education;
    private  String skillsAndAbilities;
    private String location;
    private String problem;
    private String Question;
    private String Answer;
    private String Greeting;
    private boolean isOnBreak;
    private String name;
    private String availabilty;
    private String respsnibilityAndDuties;

    
    
    public SoftwareEngineer(SoftwareEngineer OtherSoftwareEngineer)
    {
        name = OtherSoftwareEngineer.getName();
        education = OtherSoftwareEngineer.getEducation();
        skillsAndAbilities = OtherSoftwareEngineer.getEmployeesSkillsAndAbilities();
        name = OtherSoftwareEngineer.getName();
        availabilty = OtherSoftwareEngineer.getEmployeeAvailability();
        location = OtherSoftwareEngineer.employeeLocation();
        respsnibilityAndDuties = OtherSoftwareEngineer.getResponsibility();
        priorExperience = OtherSoftwareEngineer.priorExperience();
        numYearsExperience = OtherSoftwareEngineer.numYearsExperience();
    }
    
    
    
    public SoftwareEngineer()
    {
        name = "James Olsen";
        education =  "Bachelor's Degree in Computer Science";
        availabilty =  "9:00 AM to 9:00 PM";
        location =  "Tustin, Ca";
        skillsAndAbilities =  "Java, C++, R, Swift and Python";
        respsnibilityAndDuties =  "Programming the Software";
        numYearsExperience = 6;
        priorExperience = "Software Engineer at Unigo";
    }

    public SoftwareEngineer(String n, String ed,String avail, String locat,String skill, String resp, int numYearsExp, String prior)
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

    public String getResponsibility() 
    {
        return respsnibilityAndDuties;
    }

    public void setResponsibility(String resp) 
    {
        this.respsnibilityAndDuties = resp;        
    }
    

    public boolean isElligible(String ed)
    {
        if(ed.equals("Bachelor's Degree in Computer Science") || ed.equals("Bachelor's Degree in Software Engineering") || ed.equals("Bachelor's Degree in Data Science") || ed.equals("Bachelor's Degree in Computer Engineering") || ed.compareTo("Bachelor's Degree in Computer Science") == 0 || ed.compareTo("Bachelor's Degree in Software Engineering") == 0 || ed.compareTo("Bachelor's Degree in Data Science") == 0 || ed.compareTo("Bachelor's Degree in Computer Engineering") == 0)
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

    public String getLocation()
    {
        return location;
    }

    

    public String toString()
    {
        return super.toString() + " ,Number of Years of Experience :" + numYearsExperience + " ,Prior Experience: " + priorExperience + " ,Has a Day Off : " + isOnBreak;

    }
}