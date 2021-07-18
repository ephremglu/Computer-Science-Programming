package cscd211Comparators;

import cscd211Classes.Player;

public class TeamComparator implements java.util.Comparator<Player>
{
	public int compare(final Player p1, final Player p2)
	{
		int res = p1.getTeam().compareTo(p2.getTeam());
		return res;
	}
}