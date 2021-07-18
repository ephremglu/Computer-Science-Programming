package cscd211Comparators;

import cscd211Classes.Player;

public class PositionComparator implements java.util.Comparator<Player>
{
	public int compare(final Player p1, final Player p2)
	{
		int res = p2.getPosition().compareTo(p1.getPosition());
		return res;
	}
}