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

public class Sorts
{
	private long steps;		//long integer up to 9,223,372,036,854,775,807

	public Sorts()
	{
		steps = 0;
	}

	public void bubbleSort(ArrayList <Integer> List)
	{
		int outer;
		int inner;
		Integer Temp;
		
		for (outer = 0; outer < List.size() - 1; outer++)
		{
			for (inner = 0; inner < List.size() - outer - 1; inner++)
			{
				steps += 3; // counts two .get(), one .compareTo()

				if (List.get(inner).compareTo(List.get(inner + 1)) > 0)
				{
					//swap
					steps += 4; //counted two .set() methods and two .get() methods
					Temp = List.get(inner);
					List.set(inner, List.get(inner + 1));
					List.set(inner + 1, Temp);
				}

			}
		}
	}

	public void selectionSort(ArrayList <Integer> List)
	{
		int outer;
		int inner;
		int min;
		Integer Temp;

		for (outer = 0; outer < List.size() - 1; outer++)
		{
			min = outer;
			for (inner = outer + 1; inner < List.size(); inner++)
			{
				steps += 3; // counts two .get(), one .compareTo()

				if (List.get(inner).compareTo(List.get(min)) < 0) 
				{
					min = inner; // a new smallest item is found
				}
			}
			//swap
			steps += 4; //counted two .set() methods and two .get() methods
			Temp = List.get(outer);
			List.set(outer, List.get(min));
			List.set(min, Temp);
		}
	}

	public void insertionSort(ArrayList <Integer> List)
	{
		int outer;
		int inner;
		int position;
		Integer key;
		
		for (outer = 1; outer < List.size(); outer++)
		{
			position = outer;
			steps += 1; //counted one .get() methods
			key = List.get(position);
			steps += 2; //counted one .get() and one .compareTo() methods if while loop condition is false
			while (position > 0 && List.get(position - 1).compareTo(key) > 0)
			{
				steps += 2; //counted one .get() and one .compareTo() methods if while loop condition is true
				steps += 2; //counted one .set() and one .get() methods 
				List.set(position, List.get(position - 1));
				position--;
			}
			steps += 1; //counted one .set() methods
			List.set(position, key);
		}
	}

	private void merge(ArrayList <Integer> List, int first, int mid, int last)
	{
		int PositionA = first;
		int PositionB = mid + 1;
		int PositionTemp = first;
		int total = last - first + 1;
		int loop;
		boolean doneA = false;
		boolean doneB = false;
		
		//Use Copy Constructor to make "Temp" a **COPY** of "List"
		ArrayList<Integer> Temp = new ArrayList<Integer>(List);

		//merge two sub-arrays together into Temp array
		for (loop = 1; loop <= total; loop++)
		{
			if (doneA)
			{
				steps += 2; //counted one .set() and one .get() methods 
				Temp.set(PositionTemp, List.get(PositionB));
				PositionB++;
			}
			else if (doneB)
			{
				steps += 2; //counted one .set() and one .get() methods 
				Temp.set(PositionTemp, List.get(PositionA));
				PositionA++;
			}
			else if (List.get(PositionA).compareTo(List.get(PositionB)) < 0)
			{
				steps += 3; //counted two .get() and one .compareTo() methods if if conditional true
				steps += 2; //counted one .get() and one .set() methods 
				Temp.set(PositionTemp, List.get(PositionA));
				PositionA++;
			}
			else	//List[PositionA] >= List[PositionB]
			{
				steps += 3; //counted two .get() and one .compareTo() methods if else if conditional is false
				steps += 2; //counted one .get() and one .set() methods 
				Temp.set(PositionTemp, List.get(PositionB));
				PositionB++;
			}

			PositionTemp++;

			if (PositionA > mid)
			{
				doneA = true;
			}
			if (PositionB > last)
			{
				doneB = true;
			}
		}

		// copy Temporary array into original array
		for (loop = first; loop <= last; loop++)
		{
			steps += 2; //counted one .get() and one .set() methods 
			List.set(loop, Temp.get(loop));
		}
	}

	public void mergeSort(ArrayList <Integer> List, int first, int last)
	{
		int mid;
		int Temp;

		if (first == last)
		{
			// 1 value, do nothing
		}
		else
		{
			if (first + 1 == last)
			{
				// 2 values, swap if necessary
				steps += 3; //counted two .get() and one .compareTo() methods when the if statement is false

				if (List.get(first).compareTo(List.get(last)) > 0)
				{
					steps += 3; //counted two .get() and one .compareTo() methods when the if statement is true
					swap(List, first, last);	//**SWAP METHOD**
				}
			}
			else
			{
				// more than 2 values, split List again
				mid = (first + last) / 2;
				mergeSort(List, first, mid);
				mergeSort(List, mid + 1, last);
				merge(List, first, mid, last);
			}
		}
	}
	
	public void quickSort (ArrayList <Integer> List, int first, int last)
	{
		int g = first, h = last;
		int midIndex = (first + last) / 2;
		steps += 1; //counted one .get() method 
		Integer dividingValue = List.get(midIndex);
		do
		{
			steps += 2; //counted one .get() and one .compareTo() methods if loop condition is false
			while (List.get(g).compareTo(dividingValue) < 0) 
			{
				steps += 2; //counted one .get() and one .compareTo() methods if loop conditon is true
				g++;
			}
			
			steps += 2; //counted one .get() and one .compareTo() methods if loop condition is false
			while (List.get(h).compareTo(dividingValue) > 0)
			{
				steps += 2; //counted one .get() and one .compareTo() methods if loop conditon is true
				h--;
			}

			if (g <= h)
			{
				//swap(List[g], List[h]);
				swap(List, g, h);		//**SWAP METHOD**
				g++;
				h--;
			}
		}
		while (g < h);
		
		if (h > first)
		{
			quickSort (List, first, h);
		}
		
		if (g < last)
		{		
			quickSort (List, g, last);
		}
	}

	public long getStepCount()
	{
		return steps;
	}

	public void setStepCount(long stepCount)
	{
		steps = stepCount;
	}

	private void swap(ArrayList <Integer> List, int a, int b)
	{
		Integer Temp;
		steps += 4; //counted two .get() and two .set() methods 
		Temp = List.get(a);
		List.set(a, List.get(b));
		List.set(b, Temp);
	}
}