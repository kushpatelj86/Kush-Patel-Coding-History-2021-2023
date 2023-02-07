public class Accountant extends Employee implements Qualifications, Actions
{
    private int numYearsExperience;
    private String priorExperience;
    private String education;
    private String skillsAndAbilities;
    private String location;
    private String problem;
    private String Question;
    private String Answer;
    private String Greeting;
    private boolean isOnBreak;
    private String name;
    private String respsnibilityAndDuties;
    private String availabilty;

   
   
   
    public Accountant(Accountant OtherAccountant)
    {
        name = OtherAccountant.getName();
        education = OtherAccountant.getEducation();
        skillsAndAbilities = OtherAccountant.getEmployeesSkillsAndAbilities();
        name = OtherAccountant.getName();
        availabilty = OtherAccountant.getEmployeeAvailability();
        location = OtherAccountant.employeeLocation();
        respsnibilityAndDuties = OtherAccountant.getResponsibility();
        priorExperience = OtherAccountant.priorExperience();
        numYearsExperience = OtherAccountant.numYearsExperience();
    }
   
   
    public Accountant()
    {
        name = "Lucas Anderson";
        education =  "Bachelor's Degree in Economics";
        availabilty =  "12:00 PM to 8:00 PM";
        location =  "Palos Verde, Ca";
        skillsAndAbilities =  "Communication Skills, Accounting Skills, Interpersonal Skils, and Financial Literacy Skills";
        respsnibilityAndDuties =  "Counting how much money the company is making";
        priorExperience = "Accountant for a private company";
        numYearsExperience = 2;
    }

    public Accountant(String n, String ed,String avail, String locat,String skill, String resp, int numYearsExp, String prior)
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
    public String toString()
    {
        return super.toString() + " ,Number of Years of Experience :" + numYearsExperience + " ,Prior Experience: " + priorExperience + " ,Has a Day Off : " + isOnBreak;

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
        if(ed.equals("Bachelor's Degree in Finance") || education.equals("Bachelor's Degree in Business Administration")|| education.equals("Bachelor's Degree in Economics") || education.equals("Bachelor's Degree in Accounting") || ed.compareTo("Bachelor's Degree in Business Administration") == 0 || ed.compareTo("Bachelor's Degree in Accounting") == 0 || ed.compareTo("Bachelor's Degree in Finance") == 0 || ed.compareTo("Bachelor's Degree in Economics") == 0)
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
