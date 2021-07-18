package cscd210Comparators;
import java.util.Comparator;
import cscd210Classes.Letter;

public class LetterNameComparatory implements Comparator<Letter>
{
	public int compare(final Letter letter1,final Letter letter2)
	{
		if( letter1 == null | letter2 == null)
			throw new IllegalArgumentException( "o1 or o2 is null");
		
			return letter1.getName().compareToIgnoreCase(letter2.getName());
	}

}
