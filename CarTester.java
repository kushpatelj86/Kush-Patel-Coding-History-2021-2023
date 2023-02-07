/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-05-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 4.1
 *<BR> Description:   In this assignment we will be testing and calculation the miles per gallon for 3 differnt cars at 4 different Filling Station Visit
 *<BR> Cite Sources:  Mr.Elliot taught me what to put in the contructor methods, Websites I used:https://www.youtube.com/watch?v=OwutNVAINOs and https://www.guinnessworldrecords.com/world-records/highest-vehicle-mileage
 */



public class CarTester
{
    public static void main(String[] args)
    {
        Car SubaruOutback = new Car();
        Car ToyotaCamry = new Car(15);
        Car ChevroletCamaro = new Car(60);
        Car HondaPilot = new Car(SubaruOutback);

        //Subaru 

        System.out.println("Car initial odometer reading is: " + SubaruOutback.getStartMiles());

        System.out.println("Filling Station Visit #1");
        System.out.println("odometer reading 150");
        System.out.println("gallons to fill tank 8.0");
        SubaruOutback.fillUp(150, 8.0);
        System.out.println("Miles per gallon: " + SubaruOutback.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #2");
        System.out.println("odometer reading 350");
        System.out.println("gallons to fill tank 10.0");
        SubaruOutback.fillUp(350, 10.0);
        System.out.println("Miles per gallon: " + SubaruOutback.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #3");
        System.out.println("odometer reading 450");
        System.out.println("gallons to fill tank 20.0");
        SubaruOutback.fillUp(450, 20.0);
        System.out.println("Miles per gallon: " + SubaruOutback.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #4");
        System.out.println("odometer reading 603");
        System.out.println("gallons to fill tank 25.5");
        SubaruOutback.fillUp(603, 25.5);
        System.out.println("Miles per gallon: " + SubaruOutback.calculateMPG());
        System.out.println();
        
        // toyota

        System.out.println("Car initial odometer reading is: " + ToyotaCamry.getStartMiles());

        System.out.println("Filling Station Visit #1");
        System.out.println("odometer reading 170");
        System.out.println("gallons to fill tank 6.0");
        ToyotaCamry.fillUp(170, 6.0);
        System.out.println("Miles per gallon: " + ToyotaCamry.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #2");
        System.out.println("odometer reading 370");
        System.out.println("gallons to fill tank 12.0");
        ToyotaCamry.fillUp(370, 12.0);
        System.out.println("Miles per gallon: " + ToyotaCamry.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #3");
        System.out.println("odometer reading 510");
        System.out.println("gallons to fill tank 18.0");
        ToyotaCamry.fillUp(510, 18.0);
        System.out.println("Miles per gallon: " + ToyotaCamry.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #4");
        System.out.println("odometer reading 643");
        System.out.println("gallons to fill tank 29.5");
        ToyotaCamry.fillUp(643, 29.5);
        System.out.println("Miles per gallon: " + ToyotaCamry.calculateMPG());
        System.out.println();
       
        //chevy
        System.out.println("Car initial odometer reading is: " + ChevroletCamaro.getStartMiles());

        System.out.println("Filling Station Visit #1");
        System.out.println("odometer reading 178");
        System.out.println("gallons to fill tank 6.6");
        ChevroletCamaro.fillUp(178, 6.6);
        System.out.println("Miles per gallon: " + ChevroletCamaro.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #2");
        System.out.println("odometer reading 380");
        System.out.println("gallons to fill tank 12.8");
        ChevroletCamaro.fillUp(380, 12.8);
        System.out.println("Miles per gallon: " + ChevroletCamaro.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #3");
        System.out.println("odometer reading 570");
        System.out.println("gallons to fill tank 19.0");
        ChevroletCamaro.fillUp(570, 19.0);
        System.out.println("Miles per gallon: " + ChevroletCamaro.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #4");
        System.out.println("odometer reading 747");
        System.out.println("gallons to fill tank 30.5");
        ChevroletCamaro.fillUp(747, 30.5);
        System.out.println("Miles per gallon: " + ChevroletCamaro.calculateMPG());
        System.out.println();

        //honda
        
        System.out.println("Car initial odometer reading is: " + HondaPilot.getStartMiles());

        System.out.println("Filling Station Visit #1");
        System.out.println("odometer reading 275");
        System.out.println("gallons to fill tank 4.0");
        HondaPilot.fillUp(275, 4.0);
        System.out.println("Miles per gallon: " + HondaPilot.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #2");
        System.out.println("odometer reading 690");
        System.out.println("gallons to fill tank 11.0");
        HondaPilot.fillUp(690, 11.0);
        System.out.println("Miles per gallon: " + HondaPilot.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #3");
        System.out.println("odometer reading 990");
        System.out.println("gallons to fill tank 23.0");
        HondaPilot.fillUp(990, 23.0);
        System.out.println("Miles per gallon: " + HondaPilot.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #4");
        System.out.println("odometer reading 1245");
        System.out.println("gallons to fill tank 31.5");
        HondaPilot.fillUp(1245, 31.5);
        System.out.println("Miles per gallon: " + HondaPilot.calculateMPG());
        System.out.println();

        
        
        }
}




 


 
