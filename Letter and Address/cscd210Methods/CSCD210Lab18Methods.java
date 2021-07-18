package cscd210Methods;

import cscd210Classes.Address;
import cscd210Classes.Letter;

public class CSCD210Lab18Methods 
{
	public static Letter[] createAndFillArray(final int total, final java.util.Scanner fin)
	{
		if(total < 1 || fin == null)
			throw new IllegalArgumentException("total < 1 or fin is null");
		Letter myArray[] = new Letter[total];
		for(int x = 0; x < myArray.length; x++)
		{
			String location = fin.nextLine();
			String[] split = location.split(",");
			String name = split[0].trim();
			String street = split[1].trim();
			String city = split[2].trim();
			String temp = split[split.length - 1];
			String[] cityPlusZip = temp.split(" ");
			int zip = Integer.parseInt(cityPlusZip[cityPlusZip.length - 1].trim());
			String state = "";
			for(int y = 0; y < cityPlusZip.length - 1; y++)
				state += cityPlusZip[y] + " ";
			Letter all = new Letter(name, street, city, state.trim(), zip);
			myArray[x] = all;
		}
		return myArray;
	}
	
	public static int menu(final java.util.Scanner kb)
	{
		 if(kb == null)
			   throw new IllegalArgumentException("Bad Param menu");
		   int choice;
		   do
		   {
			   System.out.println("Please choose from the following");
			   System.out.println("1) Print all Letters to the screen");
			   System.out.println("2) Add a new Letter to the array");
			   System.out.println("3) Organize the Letters based on zip");
			   System.out.println("4) Organize the Letters based on the to name");
			   System.out.println("5) Quit");
			   System.out.print("Choice --> ");
			   choice = Integer.parseInt(kb.nextLine());
		   }while(choice < 1 || choice > 5);
		   return choice;
	}
	
	public static Letter[] addLetter(final Letter[] myLetters, final java.lang.String toName, final Address toAddress)
	{
		if( myLetters == null || toName == null || toName.isEmpty() || toAddress == null)
			   throw new IllegalArgumentException("myLetters is null, toName is null or empty and toAddress is null");  
		   Letter[] newArray = new Letter[myLetters.length + 1];
		   int x = 0;
		   for(x = 0; x < myLetters.length; x++)
			   newArray [x] = myLetters [x];
			   newArray [x] = new Letter(toName, toAddress);
		   return newArray;
	}
	
	public static Address createAddress(final java.util.Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("kb is null");
		System.out.println("Please enter name of city: ");
		String city = kb.nextLine();
		System.out.println("Please enter the street name: ");
		String street = kb.nextLine();
		System.out.println("Please enter the state name: ");
		String state = kb.nextLine();
		System.out.println("Please enter the zipcode: ");
		int zipcode = Integer.parseInt(kb.nextLine());
		Address something = new Address(street, city, state, zipcode);
		return something;
	}
	
	public static java.lang.String readName(final java.util.Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("kb is null");
		System.out.println("Please enter the name of a person: ");
		String toName = kb.nextLine();
		return toName;
	}
}
