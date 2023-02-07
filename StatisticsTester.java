/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          02-01-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 16.1
 *<BR> Description:  We will be finding standard deviation, avergae, and mode of a number
 *<BR> Cite Sources:  Mr Elliot discussed psuducode with us, but he never showed us or wrote it for us, we just discuessed it :https:https://www.calculator.net/standard-deviation-calculator.html?numberinputs=10%2C+12%2C+23%2C+23%2C+16%2C+23%2C+21%2C+16&ctype=s&x=65&y=13
*/
public class StatisticsTester
{
    
    public static void main(String[] args) 
    {
        Statistics stats1 = new Statistics();
        if(stats1.getNumItems() > 0)
        {
            System.out.printf("Average is %.2f",stats1.average());
            System.out.println();
            System.out.println();
            System.out.printf("Standard deviation is %.2f",stats1.standardDeviation());
            System.out.println();
            System.out.println();
            System.out.println("The mode(s) is(are) " + stats1.mode());
            System.out.println();
            System.out.println();

    
        }
        else
        {
            System.out.println(stats1);
        }
        
        
    }
}

/*
RUN OUTPUT:

Average is 54.83

Standard deviation is 33.44

The mode(s) is(are) 0, 10, 33, 70, 81, 86, 99, 100


Reading File Error: numghgfbers.txt (The system cannot find the file specified)

We can't find the file, please enter new file

Statistics@198e2867

*/