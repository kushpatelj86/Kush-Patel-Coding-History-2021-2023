public class FinanacialAnalyst extends Employee implements Qualifications, Actions
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

    public FinanacialAnalyst(FinanacialAnalyst OtherFinancialAnalyst)
    {
        name = OtherFinancialAnalyst.getName();
        education = OtherFinancialAnalyst.getEducation();
        skillsAndAbilities = OtherFinancialAnalyst.getEmployeesSkillsAndAbilities();
        name = OtherFinancialAnalyst.getName();
        availability = OtherFinancialAnalyst.getEmployeeAvailability();
        location = OtherFinancialAnalyst.employeeLocation();
        responsibilty = OtherFinancialAnalyst.getResponsibility();
        priorExperience = OtherFinancialAnalyst.priorExperience();
        numYearsExperience = OtherFinancialAnalyst.numYearsExperience();
    }
    
    
    public FinanacialAnalyst()
    {
        name = "Tristan Barnes";
        education =  "Bachelor's Degree in Economics";
        availability =  "8:00 AM to 8:00 PM";
        location =  "Brownsvile, Tx";
        skillsAndAbilities =  "Communication Skills, Accounting Skills, Interpersonal Skils, and Financial Literacy Skills";
        responsibilty =  "Check how the company is doing financially";
        numYearsExperience = 3;
        priorExperience = "Financial Advisor at a food company and a Economist Intern for the city ";


    }

    public FinanacialAnalyst(String n, String ed,String avail, String locat,String skill, String resp, int numYearsExp, String prior)
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
        if(ed.equals("Bachelor's Degree in Finance") || education.equals("Bachelor's Degree in Business Administration")|| education.equals("Bachelor's Degree in Economics") || ed.compareTo("Bachelor's Degree in Finance") == 0 || ed.compareTo("Bachelor's Degree in Business Administration") == 0 || ed.compareTo("Bachelor's Degree in Economics") == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String toString()
    {
        return super.toString() + " ,Number of Years of Experience :" + numYearsExperience + " ,Prior Experience: " + priorExperience + " ,Has a Day Off : " + isOnBreak;

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