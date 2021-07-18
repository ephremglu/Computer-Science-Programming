package cscd210Methods;

import java.io.*;
import java.util.Scanner;

public class CSCD210Lab10Methods 
{
	private static java.lang.String readString(final java.util.Scanner fin) throws FileNotFoundException
	{
		if(fin == null)
			throw new IllegalArgumentException("Scanner object is null"); 
		String origString = fin.nextLine();
		return origString;
	}
	
	private static int readAmountToShift(java.util.Scanner fin)
	{
		if(fin == null)
			throw new IllegalArgumentException("Scanner object is null");
		int amount = Integer.parseInt(fin.nextLine());
		return amount;
	}
	
	private static java.lang.String readDirection(java.util.Scanner fin)
	{
		if(fin == null)
			throw new IllegalArgumentException("Scanner object is null");
		String dir = fin.nextLine();
		return dir;
	}
	
	private static java.lang.String encryptString(java.lang.String origString, int amount, java.lang.String direction)
	{
		if(origString == null || origString.isEmpty() || direction == null || direction.isEmpty() || amount <= 0)
			throw new IllegalArgumentException("origString or direction are null or empty or if amount is <= 0");
		String shift;
		if(direction.equals("rt"))
		{
			shift = (origString.substring((0), (origString.length()- amount)));
		}
		if(direction.equals("lt"))
		{
			shift = (origString.substring((amount),(origString.length())));
		}
		//return shift;
		return null;
	}
	
	public static void encrypt(java.util.Scanner fin, java.io.PrintStream fout, int total) throws FileNotFoundException
	{
		String str = readString(fin);
		String dir = readDirection(fin);
		int num = readAmountToShift(fin);
		String res = encryptString(str, num, dir);
		String phase = dir + num;
		if (dir.equals("rt"))
		phase = "left";
		else
		phase = "right";
		phase = phase + num;
		display(phase, res, fout);
	}
	
	public static void decrypt(java.util.Scanner fin, java.io.PrintStream fout)
	{
		
	}
	
	public static int menu(java.util.Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("Scanner in menu is null");
		int choice;
		do
		{
			System.out.println("Please choose from the following");
			System.out.println("1) Encrypt a file writing the results to a different file ");
			System.out.println("2) Decrypt a file writing the results to a different file");
			System.out.println("3) Decrypt a file writing the results to the screen");
			System.out.println("4) Quit");
			System.out.print("Choice --> ");
			choice = Integer.valueOf(kb.nextLine());
		}while(choice < 1 || choice > 4);
		System.out.println();
		return choice;
	}
	
	private static java.lang.String determineDirection(java.lang.String encryptedString)
	{
		return null;
	}
	
	private static int amountShifted(final java.lang.String encryptedString)
	{
		return 0;
	}
	
	private static java.lang.String decryptString(java.lang.String encryptedString, int amount, java.lang.String direction)
	{
		return null;
	}
	
	private static void display(java.lang.String dir, int number, java.lang.String str, java.io.PrintStream fout)
	{
		
	}
	
	private static void display(java.lang.String phrase, java.lang.String str, java.io.PrintStream fout)
	{
		
	}
	
	public static java.lang.String readFilename(final java.util.Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("Scanner object is null");
		return null;
	}
}