package cscd211Methods;

public class LinkedListMethods 
{
	public static int menu(final java.util.Scanner kb)
	{
		 if(kb == null)
			   throw new IllegalArgumentException("Bad Param menu");
		   int choice;
		   do
		   {
			   System.out.println("Please choose from the following");
			   System.out.println("1) Print the List"); 
			   System.out.println("2) Create a BoxCar and addFirst");
			   System.out.println("3) Create a BoxCar and addLast");
			   System.out.println("4) Create a BoxCar, read and index and add -- at the index");
			   System.out.println("5) Create a BoxCar, check the list to see if the list contains the BoxCar"); 
			   System.out.println("6) Create a BoxCar, find the indexOf that BoxCar"); 
			   System.out.println("7) removeFirst"); 
			   System.out.println("8) removeLast"); 
			   System.out.println("9) Read index remove Node at that index");
			   System.out.println("10) Create a BoxCar and removeFirstOccurrence of that BoxCar"); 
			   System.out.println("11) Create a BoxCar and removeLastOccurrence of that BoxCar"); 
			   System.out.println("12) clear the list"); 
			   System.out.println("13) Print the size of the list"); 
			   System.out.println("14) Quit"); 
			   System.out.print("Choice --> ");
			   choice = Integer.parseInt(kb.nextLine());
		   }while(choice < 1 || choice > 14);
		   return choice;
	}
	
	public static java.lang.String buildAString(final java.util.Scanner kb)
	{
		if(kb == null)
			   throw new IllegalArgumentException("Bad Param menu");
		System.out.println("Please enter a string: ");
		String str = kb.nextLine();
		return str;
	}
	
	public static int readIndex(final java.util.Scanner kb)
	{
		if(kb == null)
			   throw new IllegalArgumentException("Bad Param menu");
		System.out.println("Please enter an index number: ");
		int index = Integer.parseInt(kb.nextLine());
		
		while(index < 0)
		{
			System.out.println("Please enter a number greater than -1: ");
			index = Integer.parseInt(kb.nextLine());
		}
		return index;
	}
}