package cscd210Utils;

import java.io.File;

public class FileUtils 
{
	public static int countRecords(final java.util.Scanner fin, final int linesPer)
	{
		if(fin == null)
			throw new IllegalArgumentException("Scanner object is null");
		if(linesPer <= 0)
			throw new IllegalArgumentException("linesPer less than equal to 0");
		int total = 0;
		int count = 0;
		while(fin.hasNext())
		{
			fin.nextLine();
			count++;
		}
		if(count == 0)
			throw new RuntimeException("Count equal to zero");
		else
			total = count / linesPer;
			return total;
	}
	
	public static java.io.File openInputFile(final java.util.Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("Scanner object is null");
		String file = null;
		File inf = null;
		do
		{
			System.out.println("Please enter the filename: ");
			file = kb.nextLine();
			inf = new File(file);
		}while(!inf.exists());
		return inf;
	}
	
	public static java.io.File openInputFile(final java.lang.String filename)
	{
		if(filename == null)
			throw new IllegalArgumentException("filename is null");
		if(filename.isEmpty())
			throw new IllegalArgumentException("String is empty");
		java.io.File inf = new java.io.File(filename);
		if(!inf.exists())
			throw new RuntimeException("File could not be opened");
		return inf;
	}
}