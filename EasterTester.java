/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-01-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT L03
 *<BR> Description:   I am writing a program and three sample runs to calculate the date of easter in a specific year
 *<BR> Cite Sources:  Mr.Elliot taught me how to write the final statement, how to return 9 dates in 3 different sample runs. Websites I used:http://dates.gmarts.org/data/westbydate.htm and  https://ap.mreliot.com/LessonA03/Lab-A3-1.html, and  
 */

public class EasterTester
{
	public static void main(String[] args)
	{
		/// sample run one
		
		Easter MyEaster01a = new Easter(2003);
		Easter MyEaster02a = new Easter(2685);
		Easter MyEaster03a = new Easter(3356);
		
		/// sample run two
		
		Easter MyEaster01b = new Easter(1608);
	    Easter MyEaster02b = new Easter(2285);
		Easter MyEaster03b = new Easter(2896);
		
		/// sample run three
		
		Easter MyEaster01c = new Easter(1798);
		Easter MyEaster02c = new Easter(2399);
		Easter MyEaster03c = new Easter(3000);
		
		
		
		MyEaster01a.calculate();
		System.out.println();
		MyEaster02a.calculate();
		System.out.println();
		MyEaster03a.calculate();
		
		MyEaster01b.calculate();
		System.out.println();
		MyEaster02b.calculate();
		System.out.println();
		MyEaster03b.calculate();
		
		MyEaster01c.calculate();
		System.out.println();
		MyEaster02c.calculate();
		System.out.println();
		MyEaster03c.calculate();
		
		
		


	}
}

/*
RUN OUTPUT:

*/