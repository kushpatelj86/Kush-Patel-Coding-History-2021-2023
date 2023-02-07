import java.util.ArrayList;

public class SpaceXEmployees implements BasicQualifications
{
    private static String education;
    private String skillsAndAbilities;
    private String name;
    private String availabilty;
    private String location;
    private String respsnibilityAndDuties;
    private String problem;

    public SpaceXEmployees(String n, String ed,String avail, String locat,String skill, String resp)
    {
        name = n;
        education =  ed;
        availabilty =  avail;
        location =  locat;
        skillsAndAbilities =  skill;
        respsnibilityAndDuties =  resp;
    }

    public static boolean isElligble()
    {
        if(education.equals("Bachelor's Degree in Computer Science") || education.equals("Bachelor's Degree in Business Administration") || education.equals("Bachelor's Degree in Mechanical Engineering") || education.equals("Bachelor's Degree in Aerospace Engineering") || education.equals("Bachelor's Degree in Electrical Engineering") || education.equals("Bachelor's Degree in Computer Engineering") || education.equals("Bachelor's Degree in Industrial Engineering") || education.equals("Bachelor's Degree in Manufacturing Engineering") || education.equals("Bachelor's Degree in General Engineering") || education.equals("Bachelor's Degree in Physics") || education.equals("Bachelor's Degree in Economics") || education.equals("Bachelor's Degree in Accounting") || education.equals("Bachelor's Degree in Finance"))
        {
            return true;
        }
        else
        {
            return false;
        }
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
        
        this.problem = null;
    }
    public String toString()
    {
        return "Name:" + name + "\n Education: " + education + "\n Skills and Abilties: " + skillsAndAbilities + "\n Location: " + location + "\n Education: " + education + "\n Availability: " + availabilty + "\n Responsibilities and Duties:" + respsnibilityAndDuties;

    }



   /* public static ArrayList<SpaceXEmployees> Members()
    {
        ArrayList<SpaceXEmployees> roster = new ArrayList<SpaceXEmployees>();
        if(isElligble() == true)
        {
            roster.add(new SpaceXEmployees("Shane Willaims","Bachelor's Degree in Mechanical Engineering", "6:00 AM to 2:00 PM", "Cerritos Ca", "Java, CAD Design, Problem Solving, Manufacturing and Project Analysis", "Designing the mechanical spacecraft systems"));
        }

        for(int i = 0; i < roster.size(); i++)
        {
            System.out.println(roster.get(i));
        }

        return roster;
    }*/
}