import java.util.ArrayList;
import java.util.Scanner;

public class CompanyTester
{
    public static void main(String[] args) 
    {
        System.out.println("SpaceX Company");
        
        System.out.println("Normal Consturctors: ");
        Ceo ElonMusk = new Ceo("Elon Musk", "Bachelor's Degree in Economics", "9:00 AM to 5:00 PM", "Brownsvile Texas", "Management", "Oversee and Control SpaceX Operations");
        Employee Shane = new MechanicalEngineer("Shane Willaims","Bachelor's Degree in Mechanical Engineering", "6:00 AM to 2:00 PM", "Cerritos Ca", "Java, CAD Design, Problem Solving, Manufacturing and Project Analysis", "Designing the mechanical spacecraft systems", 2, "Operations Engineer at Northtrop Grunman");
        Employee John = new SoftwareEngineer("John Duncan","Bachelor's Degree in Computer Science", "8:00 AM to 2:00 PM", "Baldwin Park Ca", "Java, C++, Problem Solving, Python, and C#", "Programming, reasearching, and designing the Software", 1, "Software Engineering Intern at Garmin");
        Employee William = new Manager("William Shefield","Bachelor's Degree in Business Administration", "10:00 AM to 4:00 PM", "Burbank, Ca", "Good commuication skills, good at organization meetings, and leading groups", "Overseeing and Controlling operations within the company of SpaceX ", 1, "Subway Food Manager");
        Employee James = new AeronauticalEngineer("James Wiegman","Bachelor's Degree in Aerospace Engineering", "6:00 AM to 4:00 PM", "San Benito, Tx", "Orbital Mechanics,Propulsion Systems, Python,Material Science, and Turbomachienry  ", "Designing the aircraft and propulsion systems at SpaceX ", 0, "Recent Graduate from California Polytechnic University");
        Employee Craig = new HardwareEngineer("Craig Hoffman","Bachelor's Degree in Electrical Engineering", "6:00 AM to 8:00 PM", "Inglewood, Ca", "C++, Java, Circuit Design and Electromagnetic Fields ", "Designing the power systems needed in the space craft and the hardware needed for the space craft ", 5, "Electrical Engineer at Garmin");
        Employee Ethan = new FinanacialAnalyst("Ethan Chang","Bachelor's Degree in Finance", "6:00 AM to 1:00 PM", "Seattle, Wa", "Analyticial Thinking ", "Analyzing the Financial data and create Financial forcasts", 2, "Finance Intern at Bank of America");
        Employee Peter = new Accountant("Peter Shah","Bachelor's Degree in Accounting", "9:00 AM to 1:00 PM", "Redmond, Wa", "Analyticial Thinking, Strong Math and Calculus Skills ", "Counting all the money the company is making", 5, "Accountant for a small business"); 
       System.out.println();
       System.out.println();

       System.out.println();

       System.out.println();
       System.out.println();
       System.out.println();


        MechanicalEngineer Eric = new MechanicalEngineer();
        SoftwareEngineer James2 = new SoftwareEngineer();
        Manager Jeff = new Manager();
        AeronauticalEngineer JohnL = new AeronauticalEngineer();
        HardwareEngineer Chase = new HardwareEngineer();
        FinanacialAnalyst Tristan = new FinanacialAnalyst();
        Accountant Lucas = new Accountant();
        System.out.println();

        
        Employee Chris = new Employee(Lucas);
        Chris.setEmployeeAvailability("8:00 AM to 2:00 PM");
        Chris.setEmployeesSkillsAndAbilities("Problem Solving");
        Chris.setLocation("Long Beach, Ca");
        Chris.setNumYearsExperience(3);
        Chris.setName("Chris Cardona");
        Chris.setResponsibility("Counting the money the company is making right now");

        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println();
        System.out.println("Background Info: ");
        System.out.println();
        System.out.println("Normal Consturctors: ");

        System.out.println(ElonMusk);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(Shane);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(John);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(William);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(James);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(Craig);
        System.out.println();
        System.out.println();
        System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();

        System.out.println(Ethan);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
       System.out.println();

        System.out.println(Peter);       
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Default Consturctors: ");


        System.out.println(James2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(Jeff);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(JohnL);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
       System.out.println();

        System.out.println(Chase);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
       System.out.println();

        System.out.println(Tristan);
        System.out.println();
        System.out.println();
       System.out.println();
       System.out.println();

        System.out.println(Lucas);
        System.out.println();
        System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println("Copy Consturctors: ");


        System.out.println(Chris);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

       
        System.out.println();
        System.out.println("Testing Availability Info: ");
        Shane.setEmployeeAvailability("6:00 AM to 8:00 PM");
        System.out.println("Shane Williams: " + Shane.getEmployeeAvailability());
        
       
       
       
        
        System.out.println();
        System.out.println("Testing Skills and Abilities: ");
        Shane.setEmployeesSkillsAndAbilities("Python, R, C#, Java, C++, and Artifical Intelligence");
        System.out.println("Shane Williams: " + Shane.getEmployeesSkillsAndAbilities());
       
        System.out.println();
        System.out.println("Testing Responsibilities and Duties: ");
        Shane.setResponsibility("Coding everything");
        System.out.println("Shane Williams: " + Shane.getResponsibility());
        
        System.out.println();
        System.out.println("Testing Prior Experience: ");
        ((MechanicalEngineer) Shane).setPriorExperience("Reaerch Assitantnt at UCI");
        System.out.println("Shane Williams: " + ((MechanicalEngineer) Shane).priorExperience());
       


        System.out.println();
        System.out.println("Testing Number of Years of Experience: ");
        Shane.setNumYearsExperience(12);
        System.out.println("Shane Williams: " + Shane.numYearsExperience());
        
        

       
       
       System.out.println();
       
        ArrayList<Employee> problemSolvingRoster = new ArrayList<Employee>();
        problemSolvingRoster.add(Shane);
        problemSolvingRoster.add(John);
        problemSolvingRoster.add(William);
        problemSolvingRoster.add(James);
        problemSolvingRoster.add(Craig);
        problemSolvingRoster.add(Ethan);
        problemSolvingRoster.add(Peter);
        problemSolvingRoster.add(Eric);
        problemSolvingRoster.add(James2);
        problemSolvingRoster.add(Jeff);
        problemSolvingRoster.add(JohnL);
        problemSolvingRoster.add(Chase);
        problemSolvingRoster.add(Tristan);
        problemSolvingRoster.add(Lucas);


        ElonMusk.setGreeting("Hello Everyone how you all doing?"); 
        System.out.println(ElonMusk.getGreeting());
        problemSolvingRoster.get(0).setGreeting("Good");
        System.out.println(problemSolvingRoster.get(0).getGreeting());
        problemSolvingRoster.get(1).setGreeting("Very Well");
        System.out.println(problemSolvingRoster.get(1).getGreeting());
        problemSolvingRoster.get(2).setGreeting("Excellent");
        System.out.println(problemSolvingRoster.get(2).getGreeting());
        problemSolvingRoster.get(3).setGreeting("Ok");
        System.out.println(problemSolvingRoster.get(3).getGreeting());
        problemSolvingRoster.get(7).setGreeting("Alright");
        System.out.println(problemSolvingRoster.get(7).getGreeting());
        problemSolvingRoster.get(5).setGreeting("Eh");
        System.out.println(problemSolvingRoster.get(5).getGreeting());

        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("People currently on break: "); 
        problemSolvingRoster.get(0).takeABreak(true);
        System.out.println("" + problemSolvingRoster.get(0).getName());
        problemSolvingRoster.get(2).takeABreak(true);
        System.out.println("" + problemSolvingRoster.get(2).getName());
        problemSolvingRoster.get(4).takeABreak(true);
        System.out.println("" + problemSolvingRoster.get(4).getName());
        problemSolvingRoster.get(8).takeABreak(true);
        System.out.println("" + problemSolvingRoster.get(8).getName());
        
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        ElonMusk.askQuestion("Any questions?");
        System.out.println(ElonMusk.getQuestion());
        problemSolvingRoster.get(2).askQuestion("May I please go to the restroom?");
        System.out.println(problemSolvingRoster.get(2).getQuestion());
        ElonMusk.setAnswer("" + problemSolvingRoster.get(2).getName() + " after I explain what will we be doing today");
        System.out.println(ElonMusk.getAnswer());
        problemSolvingRoster.get(6).askQuestion("Is there any guest speakers coming?");
        ElonMusk.setAnswer("" + problemSolvingRoster.get(6).getName() + " Sadly, no, maybe next time");
        System.out.println(ElonMusk.getAnswer());
        ElonMusk.setLecture("Today you guys will be assigned so work to do within the company depending on which department you work in and what problems you guys need to solve");
        System.out.println(ElonMusk.getLecture());
        problemSolvingRoster.get(1).askQuestion("What are the problems?");
        ElonMusk.setAnswer("" + problemSolvingRoster.get(1).getName() + " You'll find out when I give you guys your tasks");
        System.out.println(ElonMusk.getAnswer());



        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println();

        System.out.println();

        
        
        
        
        
        String[][] problems;
        problems = new String[7][5];
        System.out.println("This week agenda before problems arise: ");
        System.out.println("Null = No problems ");
        for(int row = 0; row < problems.length; row++)
        {
            for(int col = 0; col < problems[0].length; col++)
            {
                System.out.println("Day: " + (row + 1) + " Problem #" + (col + 1) + " " + problems[row][col]);
            }
        }
        
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
            if(num <= 35 && num > 0)
            {
               
            
            
           
                int i = 0;
                while(i < num)
                {
                        String prob;
                        Scanner Problem = new Scanner(System.in);
                        System.out.print("What is the problem located?: ");
                        prob = Problem.nextLine();
                        
                        ElonMusk.setProblem(prob); 
                        System.out.println();
                    
                    
                        int day;
                        System.out.println("0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday");
                        Scanner ProblemDate = new Scanner(System.in);
                        System.out.print("Day: ");
                        day = ProblemDate.nextInt();
                        System.out.println("Problem # are labeled 0-4");
                        int problemNumber;
                        System.out.print("Problem #: ");
                        problemNumber = ProblemDate.nextInt();
                
                
                        
                        problems[day][problemNumber] = ElonMusk.getProblem();
                
                        
                        i++;
                }            
                

                System.out.println("This week agenda when problems arise and where they are: ");
                System.out.println("Null = No problems ");
                System.out.println("Day 1 = Monday, Day 2 = Tuesday, Day 3 = Wednesday, Day 4 = Thursday, Day 5 = Friday, Day 6 = Saturday ");

                System.out.println();
                for(int row = 0; row < problems.length; row++)
                {
                    for(int col = 0; col < problems[0].length; col++)
                    {
                        System.out.println("Day: " + (row + 1) + " Problem # " + (col + 1) + "   " + problems[row][col]);
                    }
                    
                }
                
            
            
                for(int row = 0; row < problems.length; row++)
                {
                    for(int col = 0; col < problems[0].length; col++)
                    {
                        
                        if(problems[row][col] != null)
                        {
                            
                            int rnd =(int) Math.random() * (problemSolvingRoster.size() - 1)  +  0;
                            if(problemSolvingRoster.get(rnd).isOnBreak() == false)
                            {
                                problemSolvingRoster.get(rnd).problemSolve();
                                problems[row][col] =  problemSolvingRoster.get(rnd).getProblem();     
                            }
                                
                        }    
                        
                            
                        
                            
                    }
                    
                }
            



                System.out.println("This week agenda when all the problems are solved where they are: ");
                System.out.println("Null = No problems ");
                System.out.println("Day 1 = Monday, Day 2 = Tuesday, Day 3 = Wednesday, Day 4 = Thursday, Day 5 = Friday, Day 6 = Saturday ");

                System.out.println();
                for(int row = 0; row < problems.length; row++)
                {
                    for(int col = 0; col < problems[0].length; col++)
                    {
                        System.out.println("Day: " + (row + 1) + " Problem # " + (col + 1) + "   " + problems[row][col]);
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
                else
                {
                    System.out.println("Sorry you can't have more than 35 problerms and less than 1 problem, please close the terminal and test it again with a number greater than 0 and less than 36");
                }
         }
         
         

       
    }

    
}