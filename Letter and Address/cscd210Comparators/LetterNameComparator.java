package cscd210Comparators;

import java.util.Comparator;
import cscd210Classes.Letter;

public class LetterNameComparator implements Comparator<Letter>
{
	public int compare(final Letter letter1,final Letter letter2)
	{
		if( letter1 == null | letter2 == null)
			throw new IllegalArgumentException("letter1 or letter2 is null");
		String l1 = letter1.getName().toLowerCase();
		String l2 = letter2.getName().toLowerCase();
		int res = l1.compareTo(l2);
		return res;
	}
}