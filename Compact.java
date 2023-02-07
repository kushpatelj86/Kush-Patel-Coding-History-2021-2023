/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          02-01-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 16.2
 *<BR> Description:  We will be moving all the zeros to the end
 *<BR> Cite Sources:  Mr Elliot discussed psuducode with us,but he never wrote it for us or showed us the actual psuedocode, I did the swap method what mr.eliot told us about and when I did a for newPos it got me a different numbers and didn't increment one of my local variable because i need one local variable for the new position and another for the old because we need to maintain the non zero the same order, but move the zero to the end and if we don't increment one of ther position variables all the zeros won't go to the end they will be switched again and again so we need to increment both variables, luckily I tried testing a while newPos and managed to get it working
*/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Compact
{
    private int[] data = new int[100];
    private int[] numItems = new int[101];
    private int sum;
    private int numTimes;
    
    public Compact()
    {
        sum = 0;
        numTimes = 0;
        readFile("compact.txt");
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
            System.out.println("Reading File Error: " + error.getMessage());
            System.out.println();
            System.out.println();
            System.out.println("The file isn't found, so nothing will be printed in the array, the before and after compacts are empty");
            System.out.println();
        }
    }

    

    public void compact()
    {  
        int temp;
        int swapPos = 0;

        for(int pos = 0; pos < numTimes; pos++)
        {          
            if(data[pos] > 0)
            {       
                temp = data[swapPos];
                data[swapPos] = data[pos];
                data[pos] = temp;
                swapPos++;
            }
        }
        numTimes = swapPos;

    }
    public void printArray()
    {
        
        for(int i = 0; i < numTimes; i++)
        {
           
             System.out.print(" " + data[i]);
            
        }
        System.out.println();
        System.out.println();   
    }


}