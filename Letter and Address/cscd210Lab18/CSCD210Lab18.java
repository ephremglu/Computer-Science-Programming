package cscd210Lab18;

import java.io.*;
import cscd210Utils.*;
import java.util.Arrays;
import java.util.Scanner;
import cscd210Classes.Letter;
import cscd210Classes.Address;
import cscd210Methods.CSCD210Lab18Methods;
import cscd210Comparators.LetterNameComparator;
import cscd210Comparators.LetterAddressZipComparator;

/**
 * The class that contains main.  All parameters will be final and all preconditions will be enforced
 * @NOTE The API is provided for all the classes in cscd210Utils; however the code is not written by you it
 * is in the jar named cscd210Utils.jar
 */
public class CSCD210Lab18
{
	/**
	 * The main method that will utilize a command line argument for the name of the input file
	 * @param args The command line arguments
	 * @throws Exception To quiet the compiler for the Scanner and File objects
	 */
	public static void main(String [] args)throws Exception
	{
      File inf = null;
		int total = 0, choice;
		Letter [] myLetters = null;
		Scanner kb = null, fin = null;
      
		if(args.length < 1)
			   throw new IllegalArgumentException("You must pass a filename at the command line");
	    	  
		inf = FileUtils.openInputFile(args[0]);
		
		fin = new Scanner(inf);
		total = FileUtils.countRecords(fin, 1);
		fin.close();
		
		fin = new Scanner(inf);
		myLetters = CSCD210Lab18Methods.createAndFillArray(total, fin);
		fin.close();
		
		ArrayUtils.printArray(myLetters, System.out);
		SortUtils.selectionSort(myLetters);  // uses the compareTo
		
		kb = new Scanner(System.in);

		// Display a menu until user chooses to quit
		do
		{
			System.out.println();
			choice = CSCD210Lab18Methods.menu(kb);

			if(choice == 1) 
				ArrayUtils.printArray(myLetters, System.out);

			else if(choice == 2)
			{
				Address add = CSCD210Lab18Methods.createAddress(kb);
				String name = CSCD210Lab18Methods.readName(kb);
				myLetters = CSCD210Lab18Methods.addLetter(myLetters, name, add);
			}
			else if(choice == 3) 
			{
				Arrays.sort(myLetters, new LetterAddressZipComparator());
				ArrayUtils.printArray(myLetters, System.out);
			}
			
			else if(choice == 4) 
			{
				Arrays.sort(myLetters, new LetterNameComparator());
				ArrayUtils.printArray(myLetters, System.out);
				
			}
			
		}while(choice != 5);
		
		System.out.println("Program Ending");
		kb.close();

	}//end main	
	

}// end class
