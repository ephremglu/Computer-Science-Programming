package cscd210Comparators;

import java.util.Comparator;
import cscd210Classes.Letter;

public class LetterAddressZipComparator implements Comparator<Letter>
{
	public int compare(final Letter letter1,final Letter letter2)
	{
		if( letter1 == null | letter2 == null)
			throw new IllegalArgumentException("letter1 or letter2 is null");
		return letter1.getAddress().getZip() - letter2.getAddress().getZip();
	}
}