/**
 * @author Beau Bright
 * @version 1
 * ID: 1212409807
 * CSE 360 Assignment 1
 * Description: Contains OrderedIntList.java file that has code for a class and
 *              methods that create and ordered array of 10 elements that can be
 *              printed
 */

package cse360assign1;

/**
 * A class that provides a way to create an ordered array of integers
 */
public class OrderedIntList
{
	private int[] listArray;
	private int counter = 0;

	/**
	 * Creates an integer array of size 10
	 */
	OrderedIntList()
	{
		listArray = new int[10];
	}

	/**
	 * Inserts an integer into the array in sorted order If array is full, the
	 * largest integer is removed
	 * 
	 * @param newElement New element to be added to array
	 */
	public void insert(int newElement)
	{
		int position = 0;
		boolean duplicate = false;

		for (int index = 0; index < counter; index++)
		{
			if (newElement > listArray[index])
			{
				position++;
			}
			else if (newElement == listArray[index])
			{
				duplicate = true;
			}
		}
		
		if (duplicate == false)
		{
			for (int index2 = counter; index2 > position; index2--)
			{
				/*
				 * if index2 is 10 it is decremented by 1 to get rid of largest
				 * element and prevent out of bounds error
				 */
				if (index2 == 10)
				{
					index2--;
				}
				listArray[index2] = listArray[index2 - 1];
			}

			listArray[position] = newElement;

			if (counter < 10)
			{
				counter++;
			}
		}
	}

	/**
	 * Prints array with tabs between each element Jumps to a new line after 5
	 * elements are printed
	 */
	public void print()
	{
		for (int index = 0; index < counter; index++)
		{
			if (index % 5 == 0)
			{
				System.out.println();
			}
			System.out.print(listArray[index] + "\t");
		}
	}
}
