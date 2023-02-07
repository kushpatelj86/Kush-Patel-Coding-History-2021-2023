/**  
 *<BR> Name:          Kush Patel
 *<BR> Date:          2-22-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICY Lesson 17, 18, 25, 26
 *<BR> Description:   We will be ciounting the steps for each sort
 *<BR> Cite Sources:  Mr.Elliot explained where we had to count steps
 *<BR> Sort Code by:  Jason Quesenberry, Nancy Quesenberry, Mr. Eliot
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SortStep
{
	private Scanner Console;
	private ArrayList <Integer> MyList;
	private Sorts MySorts;

	public SortStep()
	{
		Console = new Scanner(System.in);
		MySorts = new Sorts();
	}

	public void sortMenu()
	{
		String Choice;

		do
		{
			System.out.println();
			System.out.println("Sorting algorithm menu");
			System.out.println();
			System.out.println("(1) Bubble sort");
			System.out.println("(2) Selection sort");
			System.out.println("(3) Insertion sort");
			System.out.println("(4) Recursive MergeSort");
			System.out.println("(5) Recursive QuickSort");
			System.out.println("(Q) Quit");
			System.out.println();
			System.out.print("Choice ---> ");
			Choice = Console.next() + " ";
			if (Choice.charAt(0) >= '1' && Choice.charAt(0) <= '5')
			{
				System.out.println();

				MySorts.setStepCount(0);

				switch (Choice.charAt(0))
				{
					case '1':
						resetArray();
						MySorts.bubbleSort(MyList);
						break;
					case '2':
						resetArray();
						MySorts.selectionSort(MyList);
						break;
					case '3':
						resetArray();
						MySorts.insertionSort(MyList);
						break;
					case '4':
						resetArray();
						MySorts.mergeSort(MyList, 0, MyList.size() - 1);
						break;
					case '5':
						resetArray();
						MySorts.quickSort(MyList, 0, MyList.size() - 1);
						break;
				}
				
				if (Choice.charAt(0) >= '1' && Choice.charAt(0) <= '5')
				{
					System.out.println();
					System.out.println("ArrayList sorted to:");
					screenOutput();
					System.out.println();
					System.out.printf("Number of steps = %,d", MySorts.getStepCount());
					System.out.println();
					System.out.println();
				}
			}
		} while (Choice.charAt(0) != 'Q' && Choice.charAt(0) != 'q');
	}
	
	private void resetArray()
	{
		fillArraylistWithInts();
		System.out.println();
		System.out.println("ArrayList reset to:");
		screenOutput();
	}

	private void fillArraylistWithInts()
	{
		int numInts;
		int largestInt;
		int loop;
				
		MyList = new ArrayList <Integer>();

		System.out.println("NOTE: For sample runs, please sort 500 numbers or less.");
		System.out.println("NOTE: For sample runs, please make the highest number 100.");
		System.out.println();
		System.out.print("How MANY numbers would you like to generate? ");
		numInts = Console.nextInt();
		System.out.print("What is the LARGEST number you would like to generate? ");
		largestInt = Console.nextInt();

		for (loop = 0; loop < numInts; loop++)
		{
			int random = (int) (Math.random() * largestInt + 1);	//range of 1 to largestInt
			MyList.add(random);										//autoboxing of int into Integer object
		}
	}

	private void screenOutput()
	{
		for (int loop = 0; loop < MyList.size(); loop++)
		{
			System.out.printf("%,8d", MyList.get(loop));
			if (loop % 10 == 0)
			{
				System.out.println();
				if(loop % 100 == 0)
				{
					System.out.println();
				}
			}
		}
		System.out.println();
	}
}
