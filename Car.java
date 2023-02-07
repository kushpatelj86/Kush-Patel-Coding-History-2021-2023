/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-05-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 4.1
 *<BR> Description:   In this assignment we will be testing and calculation the miles per gallon for 3 differnt cars at 4 different Filling Station Visit
 *<BR> Cite Sources:  Mr.Elliot taught me what to put in the contructor methods, Websites I used:https://www.youtube.com/watch?v=OwutNVAINOs and https://www.guinnessworldrecords.com/world-records/highest-vehicle-mileage
 */


public class Car
{
	// private instance variables
	private int myStartMiles;      // Starting odometer reading
	private int myEndMiles;        // Ending odometer reading
	private double myGallonsUsed;  // Gallons of gas used
	
	//"default" constructor
	public Car()
	{
		myStartMiles = 0;
		myEndMiles = 0;
		myGallonsUsed = 0.0;
	}

	//"normal" constructor
	public Car(int odometerReading)
	{
		myStartMiles = odometerReading;
		myEndMiles = odometerReading;
		myGallonsUsed = 0.0;
	}
	
	//"copy" constructor
	public Car(Car OtherCar)
	{
		myStartMiles = OtherCar.getStartMiles();
		myEndMiles = OtherCar.getEndMiles();
		myGallonsUsed = OtherCar.getGallonsUsed();
	}
	
	//the car has just been filled up, set values accordingly
	public void fillUp(int odometerReading, double gals)
	{
		myStartMiles = myEndMiles;
		myEndMiles = odometerReading;
		myGallonsUsed = gals;
	}
	
	//use private values to calculate MPG
	public double calculateMPG()
	{
		double calculateMPG;
		calculateMPG = (myEndMiles - myStartMiles) / myGallonsUsed;
		return calculateMPG;
	}
	
	//if anybody asks, tell them what myStartMiles is
	public int getStartMiles()
	{
		return myStartMiles; 
	}
	
	//if anybody asks, tell them what myEndMiles is
	public int getEndMiles()
	{
		return myEndMiles; 
	}
	
	//if anybody asks, tell them what myGallonsUsed is
	public double getGallonsUsed()
	{
		return myGallonsUsed; 
	}
}

