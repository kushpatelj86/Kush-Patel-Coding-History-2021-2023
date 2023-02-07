/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-18-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 6.2
 *<BR> Description:   We will be calculating the number of sides, side length, width, height, area, perimeter, inscribed radius, and circumscribed radius on a polygon.
 *<BR> Cite Sources:  Mr Elliot taught me what I was doing wrong and helped me fix my errors. Websites I used:https://ap.mreliot.com/LessonA06/Lab-A6-2.html
 */

public class RegularPolygonTester
{
    /**
	* main method - there is only one main() method, it runs first, and it executes (tests) all of the other RegularPolygon class methods with 20 different objects!
	* @param args -- A String array of arguments (parameters) sent to the main method.  We don't use this in class, but we **could** send information to the main() method on the command line as String values when we first run the main() from the compiler.
	*/
    public static void main(String[] args)
    {
        //Constructors
        RegularPolygon Triangle1 = new RegularPolygon();
        RegularPolygon Square1 = new RegularPolygon(4, 10.00);
        RegularPolygon Octagon1 = new RegularPolygon(8, 5.75);
        RegularPolygon Enneadecagon1 = new RegularPolygon(19, 2.00);
        RegularPolygon Enneacontakaihenagon1 = new RegularPolygon(91, 0.50);
        RegularPolygon Hexagon1 = new RegularPolygon(6, 3.50);
        RegularPolygon Nonagon1 = new RegularPolygon(9, 7.00);
        RegularPolygon Triangle2 = new RegularPolygon(3, 15.00);
        RegularPolygon Pentagon1 = new RegularPolygon(5, 14.00);
        RegularPolygon Heptagon1 = new RegularPolygon(7, 13.00);
        RegularPolygon Decagon1 = new RegularPolygon(10, 12.00);
        RegularPolygon Triangle3 = new RegularPolygon(Triangle1);
        RegularPolygon Square2 = new RegularPolygon(Square1);
        RegularPolygon Octagon2 = new RegularPolygon(Octagon1);
        RegularPolygon Decagon2 = new RegularPolygon(Decagon1);
        RegularPolygon Dodecagon1 = new RegularPolygon(12, 12.00);
        RegularPolygon Hexagon2 = new RegularPolygon(12, 18.00);
        RegularPolygon Nonagon2 = new RegularPolygon(9, 3.00);
        RegularPolygon Pentagon2 = new RegularPolygon(5, 9.00);
        RegularPolygon Heptagon2 = new RegularPolygon(7, 6.00);
        





        //print method
        Triangle1.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        Square1.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        Octagon1.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        Enneadecagon1.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        Enneacontakaihenagon1.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        Hexagon1.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        Nonagon1.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();

        //// Get Methods
        System.out.println("The number of sides(n) are " + Triangle2.getNumSides());
        System.out.printf("The side length is(s) %.2f", Triangle2.getSideLength());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The vertex is %.2f", Triangle2.vertexAngle());
        System.out.print((char) 176);
        System.out.println();
        System.out.printf("The circumscribed circle radius (R) is %.2f", Triangle2.getR());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The inscribed circle radius (r) is %.2f", Triangle2.getr());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The perimeter is %.2f", Triangle2.perimeter());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The area is %.2f", Triangle2.area());
        System.out.print(" units^2");
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("The number of sides(n) are " + Pentagon1.getNumSides());
        System.out.printf("The side length(s) is %.2f", Pentagon1.getSideLength());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The vertex is %.2f", Pentagon1.vertexAngle());
        System.out.print((char) 176);
        System.out.println();
        System.out.printf("The circumscribed circle radius (R) is %.2f", Pentagon1.getR());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The inscribed circle radius (r) is %.2f", Pentagon1.getr());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The perimeter is %.2f", Pentagon1.perimeter());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The area is %.2f", Pentagon1.area());
        System.out.print(" units^2");
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("The number of sides(n) are " + Heptagon1.getNumSides());
        System.out.printf("The side length(s) is %.2f", Heptagon1.getSideLength());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The vertex is %.2f", Heptagon1.vertexAngle());
        System.out.print((char) 176);
        System.out.println();
        System.out.printf("The circumscribed circle radius (R) is %.2f", Heptagon1.getR());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The inscribed circle radius (r) is %.2f", Heptagon1.getr());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The perimeter is %.2f", Heptagon1.perimeter());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The area is %.2f", Heptagon1.area());
        System.out.print(" units^2");
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("The number of sides(n) are " + Decagon1.getNumSides());
        System.out.printf("The side length(s) is %.2f", Decagon1.getSideLength());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The vertex is %.2f", Decagon1.vertexAngle());
        System.out.print((char) 176);
        System.out.println();
        System.out.printf("The circumscribed circle radius (R) is %.2f", Decagon1.getR());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The inscribed circle radius (r) is %.2f", Decagon1.getr());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The perimeter is %.2f", Decagon1.perimeter());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The area is %.2f", Decagon1.area());
        System.out.print(" units^2");
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("The number of sides(n) are " + Triangle3.getNumSides());
        System.out.printf("The side length(s) is %.2f", Triangle3.getSideLength());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The vertex is %.2f", Triangle3.vertexAngle());
        System.out.print((char) 176);
        System.out.println();
        System.out.printf("The circumscribed circle radius (R) is %.2f", Triangle3.getR());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The inscribed circle radius (r) is %.2f", Triangle3.getr());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The perimeter is %.2f", Triangle3.perimeter());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The area is %.2f", Triangle3.area());
        System.out.print(" units^2");
        System.out.println();
        System.out.println();
        System.out.println();

        

        /// print method
        Square2.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        Octagon2.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        Dodecagon1.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();

        Hexagon2.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();

        Nonagon2.printPolygon();
        System.out.println();
        System.out.println();
        System.out.println();

        /// get methods
        System.out.println("The number of sides(n) are " + Decagon2.getNumSides());
        System.out.printf("The side length(s) is %.2f", Decagon2.getSideLength());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The vertex is %.2f", Decagon2.vertexAngle());
        System.out.print((char) 176);
        System.out.println();
        System.out.printf("The circumscribed circle radius (R) is %.2f", Decagon2.getR());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The inscribed circle radius (r) is %.2f", Decagon2.getr());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The perimeter is %.2f", Decagon2.perimeter());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The area is %.2f", Decagon2.area());
        System.out.print(" units^2");
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("The number of sides(n) are " + Pentagon2.getNumSides());
        System.out.printf("The side length(s) is %.2f", Pentagon2.getSideLength());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The vertex is %.2f", Pentagon2.vertexAngle());
        System.out.print((char) 176);
        System.out.println();
        System.out.printf("The circumscribed circle radius (R) is %.2f", Pentagon2.getR());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The inscribed circle radius (r) is %.2f", Pentagon2.getr());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The perimeter is %.2f", Pentagon2.perimeter());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The area is %.2f", Pentagon2.area());
        System.out.print(" units^2");
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("The number of sides(n) are " + Heptagon2.getNumSides());
        System.out.printf("The side length(s) is %.2f", Heptagon2.getSideLength());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The vertex is %.2f", Heptagon2.vertexAngle());
        System.out.print((char) 176);
        System.out.println();
        System.out.printf("The circumscribed circle radius (R) is %.2f", Heptagon2.getR());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The inscribed circle radius (r) is %.2f", Heptagon2.getr());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The perimeter is %.2f", Heptagon2.perimeter());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The area is %.2f", Heptagon2.area());
        System.out.print(" units^2");
        System.out.println();
        System.out.println();
        System.out.println();

        
    }
}

/*
RUN OUTPUT:
Microsoft Windows [Version 10.0.17763.2114]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\812221>











cd /D "h:\APCompSci_ICT_Lesson06\" && "C:\Program Files\Java\jdk-11.0.8\bin\javac" -classpath .;"C:\JavaStuff\JARfiles\*"; RegularPolygonTester.java && "C:\Program Files\Java\jdk-11.0.8\bin\java" -classpath .;"C:\JavaStuff\JARfiles\*"; RegularPolygonTester
The number of sides(n) are 3
Microsoft Windows [Version 10.0.17763.2114]
(c) 2018 Microsoft Corporation. All rights reserved.


The number of sides(n) are 3
The side length(s) is 7.00 units
The vertex is 60.00°
The circumscribed circle radius (R) is 4.04 units
The inscribed circle radius (r) is 2.02 units
The perimeter is 21.00 units
The area is 21.22 units^2






The number of sides(n) are 4
The side length(s) is 10.00 units
The vertex is 90.00°
The circumscribed circle radius (R) is 7.07 units
The inscribed circle radius (r) is 5.00 units
The perimeter is 40.00 units
The area is 100.00 units^2






The number of sides(n) are 8
The side length(s) is 5.75 units
The vertex is 135.00°
The circumscribed circle radius (R) is 7.51 units
The inscribed circle radius (r) is 6.94 units
The perimeter is 46.00 units
The area is 159.64 units^2






The number of sides(n) are 19
The side length(s) is 2.00 units
The vertex is 161.05°
The circumscribed circle radius (R) is 6.08 units
The inscribed circle radius (r) is 5.99 units
The perimeter is 38.00 units
The area is 113.86 units^2






The number of sides(n) are 91
The side length(s) is 0.50 units
The vertex is 176.04°
The circumscribed circle radius (R) is 7.24 units
The inscribed circle radius (r) is 7.24 units
The perimeter is 45.50 units
The area is 164.68 units^2






The number of sides(n) are 6
The side length(s) is 3.50 units
The vertex is 120.00°
The circumscribed circle radius (R) is 3.50 units
The inscribed circle radius (r) is 3.03 units
The perimeter is 21.00 units
The area is 31.83 units^2






The number of sides(n) are 9
The side length(s) is 7.00 units
The vertex is 140.00°
The circumscribed circle radius (R) is 10.23 units
The inscribed circle radius (r) is 9.62 units
The perimeter is 63.00 units
The area is 302.91 units^2





The number of sides(n) are 3
The side length is(s) 15.00 units
The vertex is 60.00°
The circumscribed circle radius (R) is 8.66 units
The inscribed circle radius (r) is 4.33 units
The perimeter is 45.00 units
The area is 97.43 units^2


The number of sides(n) are 5
The side length(s) is 14.00 units
The vertex is 108.00°
The circumscribed circle radius (R) is 11.91 units
The inscribed circle radius (r) is 9.63 units
The perimeter is 70.00 units
The area is 337.21 units^2


The number of sides(n) are 7
The side length(s) is 13.00 units
The vertex is 128.57°
The circumscribed circle radius (R) is 14.98 units
The inscribed circle radius (r) is 13.50 units
The perimeter is 91.00 units
The area is 614.13 units^2


The number of sides(n) are 10
The side length(s) is 12.00 units
The vertex is 144.00°
The circumscribed circle radius (R) is 19.42 units
The inscribed circle radius (r) is 18.47 units
The perimeter is 120.00 units
The area is 1107.97 units^2


The number of sides(n) are 3
The side length(s) is 7.00 units
The vertex is 60.00°
The circumscribed circle radius (R) is 4.04 units
The inscribed circle radius (r) is 2.02 units
The perimeter is 21.00 units
The area is 21.22 units^2


The number of sides(n) are 4
The side length(s) is 10.00 units
The vertex is 90.00°
The circumscribed circle radius (R) is 7.07 units
The inscribed circle radius (r) is 5.00 units
The perimeter is 40.00 units
The area is 100.00 units^2






The number of sides(n) are 8
The side length(s) is 5.75 units
The vertex is 135.00°
The circumscribed circle radius (R) is 7.51 units
The inscribed circle radius (r) is 6.94 units
The perimeter is 46.00 units
The area is 159.64 units^2






The number of sides(n) are 12
The side length(s) is 12.00 units
The vertex is 150.00°
The circumscribed circle radius (R) is 23.18 units
The inscribed circle radius (r) is 22.39 units
The perimeter is 144.00 units
The area is 1612.25 units^2





The number of sides(n) are 12
The side length(s) is 18.00 units
The vertex is 150.00°
The circumscribed circle radius (R) is 34.77 units
The inscribed circle radius (r) is 33.59 units
The perimeter is 216.00 units
The area is 3627.55 units^2





The number of sides(n) are 9
The side length(s) is 3.00 units
The vertex is 140.00°
The circumscribed circle radius (R) is 4.39 units
The inscribed circle radius (r) is 4.12 units
The perimeter is 27.00 units
The area is 55.64 units^2





The number of sides(n) are 10
The side length(s) is 12.00 units
The vertex is 144.00°
The circumscribed circle radius (R) is 19.42 units
The inscribed circle radius (r) is 18.47 units
The perimeter is 120.00 units
The area is 1107.97 units^2


The number of sides(n) are 5
The side length(s) is 9.00 units
The vertex is 108.00°
The circumscribed circle radius (R) is 7.66 units
The inscribed circle radius (r) is 6.19 units
The perimeter is 45.00 units
The area is 139.36 units^2


The number of sides(n) are 7
The side length(s) is 6.00 units
The vertex is 128.57°
The circumscribed circle radius (R) is 6.91 units
The inscribed circle radius (r) is 6.23 units
The perimeter is 42.00 units
The area is 130.82 units^2



h:\APCompSci_ICT_Lesson06>
*/