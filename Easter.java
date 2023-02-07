/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-01-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT L03
 *<BR> Description:   I am writing a program and three sample runs to calculate the date of easter in a specific year
 *<BR> Cite Sources:  Mr.Elliot taught me how to write the final statement, how to return 9 dates in 3 different sample runs. Websites I used:http://dates.gmarts.org/data/westbydate.htm and  https://ap.mreliot.com/LessonA03/Lab-A3-1.html, and  
 */

 public class Easter
 {
     private int myYear;

     public Easter(int year)
     {
         myYear = year;   
     }

     public void calculate()
     {
         //declare identifiers (variables)
         int a;
         int b;
         int c;
         int d;
         int e;
         int f;
         int g;
         int h;
         int i;
         int k;
         int r;
         int m;
         int n;
         int p;

         //calculate values
         a = myYear % 19;
         b = myYear / 100;
         c = myYear % 100;
         d = b / 4;
         e = b % 4;
         f = (b + 8) / 25;
         g = (b - f + 1) / 3;
         h = (19 * a + b - d - g + 15) % 30;
         i = c / 4;
         k = c % 4;
         r = (32 + 2 * e + 2 * i - h - k) % 7;
         m = (a + 11 * h + 22 * r) / 451;
         n = (h + r -7 * m + 114) / 31;
         p = (h + r -7 * m + 114) % 31;
         

        //print results
         System.out.println("a = " + a);
         System.out.println("b = " + b);
         System.out.println("c = " + c);
         System.out.println("d = " + d);
         System.out.println("e = " + e);
         System.out.println("f = " + f);
         System.out.println("g = " + g);
         System.out.println("h = " + h);
         System.out.println("i = " + i);
         System.out.println("k = " + k);
         System.out.println("r = " + r);
         System.out.println("m = " + m);
         System.out.println("n = " + n);
         System.out.println("p = " + p);
         System.out.println("Easter in " + myYear + " falls on " + n + "/" + (p + 1));
     }
     
 }