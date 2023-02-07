/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-25-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 8.1
 *<BR> Description:   We will be calculating the total value of the receipt
 *<BR> Cite Sources:  Mr Elliot taught me what I was doing wrong and helped me fix my errors. Websites I used:https://ap.mreliot.com/LessonA08/Lab-A8-1.html
 */

public class CheckMailTester
{
    
    public static void main(String[] args)
    {
       CheckMail MyFirstBox = new CheckMail();

       MyFirstBox.printPackageInfo();
       
       


    }



}

/*
RUN OUTPUT:
h:\APCompSci_ICT_Lesson08>cd /D "h:\APCompSci_ICT_Lesson08\" && "C:\Program Files\Java\jdk-11.0.8\bin\javac" -classpath .;"C:\JavaStuff\JARfiles\*"; CheckMailTester.java && "C:\Program Files\Java\jdk-11.0.8\bin\java" -classpath .;"C:\JavaStuff\JARfiles\*"; CheckMailTester
Dimension 1:3.0
Dimension 2:3.0
Dimension 3:4.0
Weight:3.0
The length of myDim1 is 4.0
The length of myDim2 is 3.0
The length of myDim3 is 4.0
Longest Length: 4.0
Girth: 14.0
Weight: 3.0
Size: 18.0
Package is acceptable to the U.S. Postal Service

Dimension 1:2.0
Dimension 2:4.0
Dimension 3:3.0
Weight:76.0
The length of myDim1 is 4.0
The length of myDim2 is 4.0
The length of myDim3 is 3.0
Longest Length: 4.0
Girth: 14.0
Size: 18.0
Weight: 76.0
Package is too heavy

Dimension 1:50.0
Dimension 2:62.0
Dimension 3:68.0
Weight:54.0
The length of myDim1 is 68.0
The length of myDim2 is 62.0
The length of myDim3 is 68.0
Longest Length: 68.0
Girth: 260.0
Weight: 54.0
Size: 328.0
Package is too large

Dimension 1:30.0
Dimension 2:50.0
Dimension 3:30.0
Weight:87.0
The length of myDim1 is 50.0
The length of myDim2 is 50.0
The length of myDim3 is 30.0
Longest Length: 50.0
Girth: 160.0
Weight: 87.0
Size: 210.0
Package is too large and heavy

Dimension 1:7.0
Dimension 2:6.0
Dimension 3:6.0
Weight:76.0
The length of myDim1 is 7.0
The length of myDim2 is 6.0
The length of myDim3 is 6.0
Longest Length: 7.0        
Girth: 24.0
Size: 31.0
Weight: 76.0
Package is too heavy     

Dimension 1:40.0
Dimension 2:35.0
Dimension 3:35.0
Weight:46
The length of myDim1 is 40.0
The length of myDim2 is 35.0
The length of myDim3 is 35.0
Longest Length: 40.0        
Girth: 140.0
Weight: 46.0
Size: 180.0
Package is too large 

Dimension 1:2.0
Dimension 2:5.0
Dimension 3:7.0
Weight:5.0
The length of myDim1 is 7.0
The length of myDim2 is 5.0
The length of myDim3 is 7.0
Longest Length: 7.0
Girth: 24.0
Weight: 5.0
Size: 31.0
Package is acceptable to the U.S. Postal Service
h:\APCompSci_ICT_Lesson08>
*/