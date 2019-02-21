package cse360assign1;

import java.util.Scanner;

public class TesterAssign1
{
	public static void main(String[] args)
	{
		int eleInput;
		int choice = 0;
		Scanner in = new Scanner(System.in);
		OrderedIntList list = new OrderedIntList();
		
		while(choice != 3)
		{
			System.out.println("Enter 1 to input another number\nEnter 2 to print array\nEnter 3 to quit");
			choice = in.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Enter new element: ");
				eleInput = in.nextInt();
				list.insert(eleInput);
			}
			else if(choice == 2)
			{
				list.print();
			}
			
			System.out.println();
		}
	}
}
