/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-25-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 8.1
 *<BR> Description:   We will be calculating the total value of the receipt
 *<BR> Cite Sources:  Mr Elliot taught me what I was doing wrong and helped me fix my errors. Websites I used:https://ap.mreliot.com/LessonA08/Lab-A8-1.html
 */

import java.util.Scanner;



public class CheckMail
{
	
    // get dimensions
    private double myDim1;
    private double myDim2;
    private double myDim3;
    private double myWeight;

    //get calculations
    private double myLength;
    private double myGirth;


    //constructors
    public CheckMail()
    {
        getDimensions();
        myLength = 0.0;
        myGirth = 0.0;
    }


    

    private void getDimensions()
    {
        Scanner MyInput = new Scanner(System.in);

        System.out.print("Dimension 1:");
        myDim1 = MyInput.nextDouble();

        System.out.print("Dimension 2:");
        myDim2 = MyInput.nextDouble();

        System.out.print("Dimension 3:");
        myDim3 = MyInput.nextDouble();

        System.out.print("Weight:");
        myWeight = MyInput.nextDouble();

    }

    private void determineLongestSideCalculateGirth()
    {
    double temp;

        if(myDim2 > myDim1)
        {
            temp = myDim1;
            myDim1 = myDim2;
            myDim2 = myDim1;
            
            if(myDim3 > myDim1)
            {
                temp = myDim1;    //// nested if statement
                myDim1 = myDim3;
                myDim3 = myDim1;
                
            }        
        }
    myLength = myDim1;
    myGirth = (2 * myDim2) + (2 * myDim3);      
    }


    
    

    public void printPackageInfo()
    {
    determineLongestSideCalculateGirth();

        if(myWeight > 70.0 && (myLength + myGirth) > 100.00)
        {
            
            System.out.println("The length of myDim1 is " + myDim1);
            System.out.println("The length of myDim2 is " + myDim2);
            System.out.println("The length of myDim3 is " + myDim3);
            System.out.println("Longest Length: " + myLength);
            System.out.println("Girth: " + myGirth);
            System.out.println("Weight: " + myWeight);
            System.out.println("Size: " + (myGirth + myLength));


            System.out.println("Package is too large and heavy");
        }    
        
        else if( (myLength + myGirth) > 100.00 && myWeight < 70.0 )
        {
            
            System.out.println("The length of myDim1 is " + myDim1);
            System.out.println("The length of myDim2 is " + myDim2);
            System.out.println("The length of myDim3 is " + myDim3);
            System.out.println("Longest Length: " + myLength);
            System.out.println("Girth: " + myGirth);
            System.out.println("Weight: " + myWeight);
            System.out.println("Size: " + (myGirth + myLength));


            System.out.println("Package is too large");
        }

        else if(myWeight > 70.0 && myLength + myGirth < 100.00)
        {
            System.out.println("The length of myDim1 is " + myDim1);
            System.out.println("The length of myDim2 is " + myDim2);
            System.out.println("The length of myDim3 is " + myDim3);
            System.out.println("Longest Length: " + myLength);
            System.out.println("Girth: " + myGirth);
            System.out.println("Size: " + (myGirth + myLength));
            System.out.println("Weight: " + myWeight);

            System.out.println("Package is too heavy");
        }



        else 
        {
            System.out.println("The length of myDim1 is " + myDim1);
            System.out.println("The length of myDim2 is " + myDim2);
            System.out.println("The length of myDim3 is " + myDim3);
            System.out.println("Longest Length: " + myLength);
            System.out.println("Girth: " + myGirth);
            System.out.println("Weight: " + myWeight);
            System.out.println("Size: " + (myGirth + myLength));
            
            System.out.println("Package is acceptable to the U.S. Postal Service");
        }
    }
}