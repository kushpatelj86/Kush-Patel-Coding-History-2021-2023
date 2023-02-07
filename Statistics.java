/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          02-01-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 16.1
 *<BR> Description:  We will be finding standard deviation, avergae, and mode of a number
 *<BR> Cite Sources:  Mr Elliot discussed psuducode with us, but he never showed us or wrote it for us, we just discuessed it :https:https://www.calculator.net/standard-deviation-calculator.html?numberinputs=10%2C+12%2C+23%2C+23%2C+16%2C+23%2C+21%2C+16&ctype=s&x=65&y=13
*/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Statistics
{
    private int[] data = new int[1000];
    private int[] numItems = new int[101];
    private int sum;
    private int numTimes;

    
    public Statistics()
    {
        sum = 0;
        numTimes = 0;
        readFile("numbers.txt");
    }
    
    private void readFile(String FileName)
    {
        int value = 0;
        int numbers;
        sum = 0;
        numTimes = 0;
        
        try
        {
            File MyFile = new File(FileName);
            Scanner FileReader = new Scanner(MyFile);
            while(FileReader.hasNext())
            {
                numbers = FileReader.nextInt();
                data[numTimes] = numbers;
                numItems[numbers]++;
                sum += numbers;
                numTimes++;
            }
            FileReader.close();
            
            
        }
        catch(IOException error)
        {
            System.out.println();
            System.out.println("Reading File Error: " + error.getMessage());
            System.out.println();
            System.out.println("We can't find the file, please enter new file");
            System.out.println();

        }
    }

    public int getNumItems()
    {
        return numTimes;
    }

    public double average()
    {
        double average;
        average = (double) sum / numTimes;
        return average;

    }

    public double standardDeviation()
    {
        double sumdifference = 0;
        double devided;
        double squareRoot;
        double myAverage = average();
        double difference;
        
        for(int loop = 0; loop < numTimes; loop++)
        {
            difference = data[loop] - myAverage;
            sumdifference += (difference * difference);
            
        }
        
        devided =  (sumdifference) / (double) (numTimes - 1);
        squareRoot = Math.sqrt(devided);

        return squareRoot;
    }

    public String mode()
    {
        int biggest = Integer.MIN_VALUE;
        String ModeString = "";
        for(int loop = 0; loop < numItems.length; loop++)
        {
            if(biggest < numItems[loop])
            {
                biggest = numItems[loop];
                ModeString = "" + loop;
            }
            else if(biggest == numItems[loop])
            {
                ModeString = ModeString + ", " + loop;
            }
        }
        return ModeString;
    }
}