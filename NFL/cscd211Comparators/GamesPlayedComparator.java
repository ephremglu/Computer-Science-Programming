package cscd211Comparators;

import cscd211Classes.Player;

public class GamesPlayedComparator implements java.util.Comparator<Player>
{
	public int compare(final Player p1, final Player p2)
	{
		int res = p1.getGamesPlayed() - p2.getGamesPlayed();
		return res;
	}
}