package cscd210Comparators;

import java.util.Comparator;

import cscd210Classes.Team;

public class TeamCountryComparator implements Comparator<Team>
{
	public int compare(final Team o1, final Team o2)
	{
		if(o1 == null || o2 == null)
			throw new IllegalArgumentException("o1 or o2 are null");
		int res =  o1.getCountry().compareTo(o2.getCountry());
		return res;
	}
}