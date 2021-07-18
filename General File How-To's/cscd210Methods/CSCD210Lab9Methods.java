package cscd210Methods;

import java.lang.reflect.Array;

public class CSCD210Lab9Methods 
{
	public static java.lang.String[] fillArray(final java.util.Scanner fin, final int total)
	{
		if(fin == null)
			throw new IllegalArgumentException("Scanner object is null");
		if(total <= 0)
			throw new IllegalArgumentException("Total is less than or equal to 0");
		String[] words = new String[total];
		for(int x = 0; x < total; x++)
			  words[x] = fin.nextLine();
		return words;
	}
	
	public static void printArray(final java.lang.String[] words, final java.io.PrintStream fout)
	{
		if(words == null || words.length <= 0 || fout == null)
			throw new IllegalArgumentException("Array is null or is less than or equal to 0");
		for(String w: words)
			fout.println(w);
	}
}