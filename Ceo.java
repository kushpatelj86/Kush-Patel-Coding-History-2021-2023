public class Ceo extends Employee implements Actions
{
    private String problem;
    private String Question;
    private String Answer;
    private String Greeting;
    private boolean isOnBreak;
    private String name;
    private String education;
    private String availabilty;
    private String location;
    private String respsnibilityAndDuties;
    private String skillsAndAbilities;
    private String Lecture;
    
    
    
    
    
    public Ceo(Ceo OtherCeo)
    {
        name = OtherCeo.getName();
        education = OtherCeo.getEducation();
        skillsAndAbilities = OtherCeo.getEmployeesSkillsAndAbilities();
        name = OtherCeo.getName();
        availabilty = OtherCeo.getEmployeeAvailability();
        location = OtherCeo.employeeLocation();
        respsnibilityAndDuties = OtherCeo.getResponsibility();
        
    }
    
    public Ceo()
    {
        name = "Elon Musk";
        education =  "Bachelor's Degree in Economics";
        availabilty =  "9:00 AM to 5:00 PM";
        location =  "Brownsvile, Tx";
        skillsAndAbilities =  "Entreprenuership";
        respsnibilityAndDuties =  "Oversee the operations of SpaceX";
    }
    
    
    public Ceo(String n, String ed,String avail, String locat, String skill, String resp)
    {
        super(n, ed, avail, locat, skill, resp);
    }

    public String getProblem()
    {
        return problem;
    }
    public void setProblem(String prob)
    {
        problem = prob;
    }

    public String getQuestion()
    {
        return Question;
    }

    public void askQuestion(String question)
    {
        Question = question;
    }

    public String getAnswer()
    {
        return Answer;
    }

    public void setAnswer(String ans)
    {
        Answer = ans;
    }


    public String getGreeting()
    {
        return Greeting;
    }
    public void setGreeting(String str)
    {
        Greeting = str;
    }

    public void setLecture(String lec)
    {
        Lecture = lec;
    }

    public String getLecture()
    {
        return Lecture;
    }



    public String toString()
    {
        return super.toString();

    }

    public void problemSolve() 
    {
        
        problem = null;
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


}