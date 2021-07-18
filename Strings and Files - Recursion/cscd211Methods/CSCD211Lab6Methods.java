package cscd211Methods;

public class CSCD211Lab6Methods 
{
	public static void reverseFile(final java.util.Scanner fin)
	{
		if(fin == null)
			throw new IllegalArgumentException("Fin is null");
		String res = null;
		if(!(fin.hasNext())){}
		else
		{
			res = fin.nextLine();
			reverseFile(fin);
			System.out.println(res);
		}
	}
	
	public static void doBoth(final java.util.Scanner fin)
	{
		if(fin == null)
			throw new IllegalArgumentException("Fin is null");
		if(!(fin.hasNext())) {}
		else
		{
			String str = null;
			str = fin.nextLine();
			doBoth(fin);
			System.out.println(reverseString(str));
		}
	}
	
	public static java.lang.String reverseString(final java.lang.String str)
	{
		if(str == null)
			throw new IllegalArgumentException("str is null");
		if(str.isEmpty())
		{
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}
	
	public static int menu(final java.util.Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("Bad Scanner fillTeamsArray");
		int choice;
		do
		{
			System.out.println("1. reverse the string");
			System.out.println("2. reverse the file");
			System.out.println("3. do both");
			System.out.println("4. quit");
			System.out.print("Choice --> ");
			choice = Integer.parseInt(kb.nextLine());
			if(choice < 1 || choice > 4)
				System.out.println("Invalid Choice -- TRY AGAIN");
		}while(choice < 1 || choice > 4);
		return choice;
	}
	
	public static java.lang.String readString(final java.util.Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("kb is null");
		System.out.print("Please enter a string: ");
		String str = kb.nextLine();
		while(str.isEmpty())
		{
			System.out.print("Please enter a string: ");
			str = kb.nextLine();
		}
		return str;
	}
}