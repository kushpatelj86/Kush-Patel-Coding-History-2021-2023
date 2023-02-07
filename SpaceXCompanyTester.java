import java.util.ArrayList;
import java.util.Scanner;

public class SpaceXCompanyTester
{
    public static void main(String[] args) 
    {
        String[][] problems;
        problems = new String[7][5];
        System.out.println("This week agenda before problems arise: ");
        System.out.println("Null = No problems ");
        System.out.println();
        for(int row = 0; row < problems.length; row++)
        {
            for(int col = 0; col < problems[0].length; col++)
            {
                System.out.print("Day: " + (row + 1) + " Problem #" + (col + 1) + problems[row][col] + " ");
            }
            System.out.println();
        }
        Ceo ElonMusk = new Ceo("Elon Musk", "Bachelor's Degree in Economics", "9:00 AM to 5:00 PM", "Brownsvile Texas", "Management", "Oversee and Control SpaceX Operations");
        ElonMusk.setProblem("Machines are not working properly");
        ArrayList<SpaceXEmployees> roster = new ArrayList<SpaceXEmployees>();
        roster.add(new MechanicalEngineer("Shane Willaims","Bachelor's Degree in Mechanical Engineering", "6:00 AM to 2:00 PM", "Cerritos Ca", "Java, CAD Design, Problem Solving, Manufacturing and Project Analysis", "Designing the mechanical spacecraft systems", 2, "Operations Engineer at Northtrop Grunman"));
        roster.add(new SoftwareEngineer("John Duncan","Bachelor's Degree in Computer Science", "8:00 AM to 2:00 PM", "Baldwin Park Ca", "Java, C++, Problem Solving, Python, and C#", "Programming, reasearching, and designing the Software", 1, "Software Engineering Intern at Garmin"));
        
        boolean problem;
        Scanner ProblemChecker = new Scanner(System.in);
        System.out.print("Is there a problem in the company: ");
         problem = ProblemChecker.nextBoolean();
         if(problem == true)
         {
           
            int num;
            Scanner numProblems = new Scanner(System.in);
            System.out.print("How many problems are there?  ");
            num = numProblems.nextInt();
    
           
           int i = 0;
           while(i < num)
           {
                String prob;
                Scanner Problem = new Scanner(System.in);
                System.out.print("What is the problem?: ");
                prob = Problem.next();
                
                ElonMusk.setProblem(prob); 
                System.out.println();
            
            
                int day;
                Scanner ProblemDate = new Scanner(System.in);
                System.out.print("Day: ");
                day = ProblemDate.nextInt();
        
                int problemNumber;
                System.out.print("Problem #: ");
                problemNumber = ProblemDate.nextInt();
        
        
                
                problems[day][problemNumber] = ElonMusk.getProblem();
        
                
                i++;
           }            
            

           System.out.println("This week agenda when problems arise: ");
           System.out.println("Null = No problems ");
           System.out.println();
           for(int row = 0; row < problems.length; row++)
           {
               for(int col = 0; col < problems[0].length; col++)
               {
                   System.out.print("Day: " + (row + 1) + " Problem # " + (col + 1) + "   " + problems[row][col] + " ");
               }
               System.out.println();
           }
            
           
           
           
           for(int row = 0; row < problems.length; row++)
            {
                for(int col = 0; col < problems[0].length; col++)
                {
                    for(int k = 0; i < problems[row][col].length() - 6; i++)
                    {
                        if(problems[row][col].substring(k,k + 5).equals("Machine") || problems[row][col].substring(k,k + 5).equals("machine"))
                        {
                            roster.get(0).problemSolve();
                            problems[row][col] = roster.get(0).getProblem();
                        }
                    }
                }
            }












             for(int row = 0; row < problems.length; row++)
             {
                 for(int col = 0; col < problems[0].length; col++)
                 {
                     if(problems[row][col] != null) /// null means problem is fixed or there is no problem
                     {
                         problem = true;
                     }
                     
                 }
             }
            

         }
         

       
    }

    
}