package cscd210Comparators;

import java.util.Comparator;

import cscd210Classes.Player;

public class PlayerPositionComparator implements Comparator<Player>
{
	public int compare(final Player o1, final Player o2)
	{
		if(o1 == null || o2 == null)
			throw new IllegalArgumentException("o1 or o2 are null");
		int res = o1.getPosition().compareTo(o2.getPosition());
		return res;
	}
}