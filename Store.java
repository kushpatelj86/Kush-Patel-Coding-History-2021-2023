
/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          03-03-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 19
 *<BR> Description:   We will sort everything and check how much inventory it is
 *<BR> Cite Sources:  Mr.Eliot taught me how to search binary and format properly
 */

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.MidiChannel;

import java.io.File;
import java.io.IOException;

public class Store
{
	//ArrayList of ITEM Objects in this store!
	private ArrayList <Item> MyStore;

	public Store()
	{
		MyStore = new ArrayList <Item>();
		loadFile("file60.txt");
	}
	
	public Store(String FileName)
	{
		MyStore = new ArrayList <Item>();
		loadFile(FileName);
		
	}
	private void loadFile(String FileName)
	{
		int tempId, tempInv;
		Scanner InFile;

		try
		{
			InFile = new Scanner(new File(FileName));

			while(InFile.hasNext())
			{
				tempId = InFile.nextInt();
				tempInv = InFile.nextInt();
				//call Item constructor to create EACH item in the ArrayList
				MyStore.add(new Item(tempId, tempInv));
			}
			InFile.close();

		}
		catch (IOException E)
		{
			System.out.println("Error: File Read Error");
		}
	}

	public void displayStore()
	{
		
		System.out.println("Store: ");
		String Result = String.format("%4s%9s%8s","#","Id" ,"Inv");
		System.out.println(Result);
		System.out.print(toString());
	}

	
	public String toString()
	{
		String Result = "";
		int count = 1;
		for(int i = 0; i < MyStore.size();i++)
		{
			Result += String.format("%4s", i + 1) + ":" + String.format("%8s\r\n", MyStore.get(i).toString()) ;
			if(count % 10 == 0)
			{
				Result += "\n\r";
			}
			count++;
		}
		return Result;
	}

	public void doSort()
	{
		quickSort(MyStore, 0, MyStore.size() - 1);
	}

	//SUGGESTION:  Use QuickSort method from last assignment,
	//making modifications from Integer Objects to Item Objects.
	private void quickSort(ArrayList <Item> List, int first, int last)
	{
		int a = first;
		int z = last;
		int mid = (first + last) / 2;
		Item devided = List.get(mid);
		
		do
		{
			while(List.get(a).compareTo(devided) < 0)
			{
				a++;
			}
			while(List.get(z).compareTo(devided) > 0)
			{
				z--;
			}
			if(a <= z)
			{
				swap(List, a, z);
				a++;
				z--;
			}
		}
		while(a < z);
		
		if(z > first)
		{
			quickSort(List, first, z);
		}
		if(a < last)
		{
			quickSort(List, a, last);
		}
	}

	//Test method for Non-Recursive Binary Search L19.2
	public void testSearch()
	{
		int idToFind;
		int index;
		Scanner In = new Scanner(System.in);

		do
		{
			System.out.println();
			System.out.print("Enter ID value to search for (-1 to quit) ---> ");
			idToFind = In.nextInt();
			if(idToFind >= 0)
			{
				//set quantity to zero when creating Item, since we
				//aren't concerned about quantity when searching...
				index = bSearch(new Item(idToFind, 0));
				System.out.print("Id #" + idToFind + ":  ");
				if (index < 0)
				{
					System.out.println("No such part in stock");
					
				}
				else
				{
					System.out.println("Inventory = " + MyStore.get(index).getInv());
				}
			}
		} 
		while (idToFind >= 0);
	}
	
	//Non-Recursive Binary Search L19.2
	//POST-CONDITION:  
	//Method returns position where Item is found,
	//OR a negative value if the Item is not found.
	private int bSearch(Item SearchItem)
	{
		int highestValue = MyStore.size();
		int lowestValue = 0;
		boolean quitLoop = false;
		int value = -1; //if value is not found

		
		

		while(lowestValue <= highestValue && quitLoop == false)
		{
				int middleValue = (highestValue + lowestValue) / 2;
				Item FindingItem;
				FindingItem = MyStore.get(middleValue);
				if(SearchItem.equals(FindingItem))
				{
					value = middleValue;
					quitLoop = true;
				}
				else if(SearchItem.compareTo(FindingItem) < middleValue)
				{
					highestValue = middleValue - 1;
				}
				else 
				{
					lowestValue = middleValue + 1;
				}
			
		}
		
		return value;

	}
	private int recursiveBinary(Item SearchItem, int lowestValue,int highestValue)
	{
				
		int value = -1;
		if(lowestValue <= highestValue && lowestValue <= MyStore.size() - 1)
		{
			int middleValue = (highestValue + lowestValue) / 2;

			Item FindingItem = MyStore.get(middleValue);
		
			if(SearchItem.equals(FindingItem))
			{
				value = middleValue;
			}
			else if(SearchItem.compareTo(FindingItem) < middleValue)
			{
				value = recursiveBinary(SearchItem, lowestValue, middleValue - 1);
			}
			else 
			{
				value = recursiveBinary(SearchItem, middleValue + 1, highestValue);
			}
		}
		return value;

	}

	public void testSearch2()
	{
		int idToFind;
		int index;
		Scanner In = new Scanner(System.in);

		do
		{
			System.out.println();
			System.out.print("Enter ID value to search for (-1 to quit) ---> ");
			idToFind = In.nextInt();
			if(idToFind >= 0)
			{
				//set quantity to zero when creating Item, since we
				//aren't concerned about quantity when searching...
				int lowestValue = 0;
				int highestValue = MyStore.size() - 1;

				index = recursiveBinary(new Item(idToFind, 0),lowestValue, highestValue);
				System.out.print("Id #" + idToFind + ":  ");
				if (index < 0)
				{
					System.out.println("No such part in stock");
				}
				else
				{
					System.out.println("Inventory = " + MyStore.get(index).getInv());
				}
			}
		} 
		while (idToFind >= 0);
	}

	//SUGGESTION:  Use Swap method from last assignment,
	//making modifications from Integer Objects to Item Objects.
	private void swap(ArrayList <Item> List, int a, int b)
	{
		Item Temp;
		Temp = List.get(a);
		List.set(a, List.get(b));
		List.set(b,Temp);
	}
}