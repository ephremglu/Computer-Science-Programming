package cscd211Methods;

import java.io.*;
import java.util.*;

import cscd211Classes.Player;
import cscd211Enums.NFLTeam;
import cscd211Utils.FileUtils;
import cscd211Utils.SearchUtils;

/**
 * The methods you will mostly need to write to complete Lab 1
 * <br> NOTE: All parameters will be final and all preconditions will be checked
 */
public class CSCD211Lab1Methods
{
	/**
	 * Don't write this it is free
	 */
	public CSCD211Lab1Methods() {}
	
	/**
	 * Provided by me
	 * @param kb Representing the open keyboard
	 * @return String the name of the file for output
	 * @throws IllegalArgumentException if kb is null
	 */
	public static String readFilename(final Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("Bad Scanner in readFilename");
		
		String name = null;
		do
		{
			System.out.print("Please enter the name of the output file ");
			name = kb.nextLine();
			
		}while(name == null || name.isEmpty());
		
		return name;
	}
	

	/**
	 * Provided by me
	 * @param kb Representing the open keyboard
	 * @return int The menu choice
	 * @throws IllegalArgumentException if kb is null
	 */
	public static int menu(Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("Bad Scanner in menu");
		
		/*
		1.	Print all Players to the screen
		2.	Print all Players to the User Specified file
		3.	Sort the Players by Natural Order
		4.	Sort the Players by Team and print to the screen
		5.	Sort the Players by Position and print to the screen
		6.	Sort the Players by Games Played and print to the screen
		7.  Print a entire team and only that team to a user specified file
		8.	Remove a player
		9.	Quit
		*/
		
		int choice;
		
		do
		{
			System.out.println("1) Print all Players to the screen");
			System.out.println("2) Print all Players to the User Specified file");
			System.out.println("3) Sort the Players by Natural Order");
			System.out.println("4) Sort the Players by Team and print to the screen");
			System.out.println("5) Sort the Players by Position and print to the screen");
			System.out.println("6) Sort the Players by Games Played and print to the screen");
			System.out.println("7) Print a entire team and only that team to a user specified file");
			System.out.println("8) Remove a player");
			System.out.println("9) Quit");
			System.out.print("Choice --> ");
			
			choice = Integer.parseInt(kb.nextLine());
			
		}while(choice < 1 || choice > 9);
		
		System.out.println();

		return choice;

	}// end menu
	
	public static java.io.File[] determineDirectoryFileNames(final java.lang.String directory)
	{
		if(directory == null || directory.isEmpty())
			throw new IllegalArgumentException("directory is null or empty");
		File newDirectory = new File(directory);
		File[] files = newDirectory.listFiles();
		return files;
	}
	
	public static int determineTotalPlayers(final java.io.File[] inFileNames) throws java.lang.Exception
	{
		if(inFileNames == null || inFileNames.length == 0)
			throw new IllegalArgumentException("the array is null or length is 0");
		int counter = 0;
		for(int x = 0; x < inFileNames.length; x++)
		{
			Scanner pos = new Scanner(inFileNames[x]);
			counter += FileUtils.countRecords(pos) - 1;
			pos.close();
		}
		return counter;
	}
	
	public static void fillArray(final java.io.File[] inFileNames, final Player[] nflPlayers) throws java.lang.Exception
	{
		int index = 0;
		for(int x = 0; x < inFileNames.length; x++)
		{
			Scanner of = new Scanner(inFileNames[x]);
			of.nextLine();
			while(of.hasNextLine())
			{
				String line = of.nextLine();
				String[] stuff = line.split(",");
				String name = stuff[0].trim();
				String tc = stuff[1].trim();
				String gp = stuff[2].trim();				
				String filename = inFileNames[x].getName().substring(0,2).toUpperCase();
				Player newNflPlayers = new Player(name, tc, gp, filename);
				nflPlayers[index] = newNflPlayers;
				index++;
			}
			of.close();
		}	
	}
	
	public static java.lang.String readTeamCode(final java.util.Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("kb is null");
		Boolean ok = true;
		NFLTeam[] array = NFLTeam.values();
		do
		{
			System.out.println("Please enter 3 letter team code: ");
			String threeCode = kb.nextLine();
			
			for(int x = 0; x < array.length; x++)
				if(array[x].name().equals(threeCode.trim().toUpperCase()))
					return array[x].name();
		}while(ok);
		return null;
	}

	public static void printArray(final Player[] nflPlayers, final java.io.PrintStream fout, final java.lang.String teamCode)
	{
		if(nflPlayers == null || nflPlayers.length == 0 || fout == null || teamCode == null || teamCode.isEmpty())
			throw new IllegalArgumentException("the array is null or length is 0, print stream object is null or the string is null or empty");
		for(int x = 0; x < nflPlayers.length; x++)
			if(nflPlayers[x].getTeam().equals(teamCode.trim().toUpperCase()))
				fout.println(nflPlayers[x]);
	}
	
	public static Player readPlayer(final java.util.Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("kb is null");
		System.out.println("Please enter players first name: ");
		String first = kb.nextLine();
		System.out.println("Please enter players last name: ");
		String last = kb.nextLine();
		System.out.println("Please enter 3 letter team code: ");
		String threeCode = kb.nextLine();
		return new Player(first, last, threeCode);
	}
	
	public static Player[] removePlayer(final Player target, final Player[] nflPlayers)
	{
		if(target == null || nflPlayers == null || nflPlayers.length == 0)
			throw new IllegalArgumentException("target is null, the array is null or length is 0");
		int index = SearchUtils.linearSearch(nflPlayers, target);
		Player[] copy = new Player[nflPlayers.length - 1];
		
		for(int x = 0; x < index; x++)
			copy[x] = nflPlayers[x];
		for(int x = index + 1; x < copy.length; x++)
			copy[x] = nflPlayers[x];
		
		return copy;
	}
}// end class