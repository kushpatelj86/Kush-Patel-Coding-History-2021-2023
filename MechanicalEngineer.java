public class MechanicalEngineer extends Employee implements Qualifications,Actions
{
    private int numYearsExperience;
    private String priorExperience;
    private String education;
    private  String skillsAndAbilities;
    private String availability;
    private String location;
    private String responsibilty;
    private String problem;
    private String Question;
    private String Answer;
    private String Greeting;
    private boolean isOnBreak;
    private String name;


    public MechanicalEngineer(MechanicalEngineer OtherMechanicalEngineer)
    {
        name = OtherMechanicalEngineer.getName();
        education = OtherMechanicalEngineer.getEducation();
        skillsAndAbilities = OtherMechanicalEngineer.getEmployeesSkillsAndAbilities();
        name = OtherMechanicalEngineer.getName();
        availability = OtherMechanicalEngineer.getEmployeeAvailability();
        location = OtherMechanicalEngineer.employeeLocation();
        responsibilty = OtherMechanicalEngineer.getResponsibility();
        priorExperience = OtherMechanicalEngineer.priorExperience();
        numYearsExperience = OtherMechanicalEngineer.numYearsExperience();
    }




    public MechanicalEngineer()
    {
        name = "Eric Williams";
        education =  "Bachelor's Degree in Mechanical Engineering";
        availability =  "11:00 AM to 9:00 PM";
        location =  "Fullerton, Ca";
        skillsAndAbilities =  "Mechanics, Dynamics, and Good Physics skills";
        responsibilty =  "Designing the machinery";
        numYearsExperience = 0;
        priorExperience = "Recent graduate from Cal State Fullerton";
    }
    public MechanicalEngineer(String n, String ed,String avail, String locat,String skill, String resp, int numYearsExp, String prior)
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

    public boolean isElligible(String ed)
    {
        if(ed.equals("Bachelor's Degree in Mechanical Engineering")  || ed.compareTo("Bachelor's Degree in Mechanical Engineering") == 0)
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
        
        problem = null;
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


    public String toString()
    {
        return super.toString() + " ,Number of Years of Experience :" + numYearsExperience + " ,Prior Experience: " + priorExperience + " ,Has a Day Off : " + isOnBreak;

    }



}