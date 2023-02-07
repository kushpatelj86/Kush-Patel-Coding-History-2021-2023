/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          02-01-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 16.2
 *<BR> Description:  We will be moving all the zeros to the end
 *<BR> Cite Sources:  Mr Elliot discussed psuducode with us,but he never wrote it for us or showed us the actual psuedocode, I did the swap method what mr.eliot told us about and when I did a for loop it got me a different numbers and didn't increment one of my local variable because i need one local variable for the new position and another for the old because we need to maintain the non zero the same order, but move the zero to the end and if we don't increment one of ther position variables all the zeros won't go to the end they will be switched again and again so we need to increment both variables, luckily I tried testing a while loop and managed to get it working
*/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class CompactTester
{
    public static void main(String[] args)
    {
        Compact Compacted = new Compact();
        System.out.println("Array Before Compacted: ");
        Compacted.printArray();
        Compacted.compact();
        System.out.println("Array After Compacted: ");
        Compacted.printArray();
        

    }
}

/*
RUN OUTPUT:

Array Before Compacted:
 0 0 6 15 0 0 52 3 0 0 0 99 4 29 21 0 99 0 0 48 5 2 5 2 77 96 0 0 2 0 13 0 5 91 1 22 25 34 0 0 42 0 0 0

Array After Compacted:
 6 15 52 3 99 4 29 21 99 48 5 2 5 2 77 96 2 13 5 91 1 22 25 34 42

Reading File Error: com6pact.txt (The system cannot find the file specified)


The file isn't found, so nothing will be printed in the array, the before and after compacts are empty

Array Before Compacted:


Array After Compacted:
*/