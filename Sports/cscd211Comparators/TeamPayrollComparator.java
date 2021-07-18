package cscd211Comparators;

import cscd211Classes.teams.Team;

public class TeamPayrollComparator extends java.lang.Object implements java.util.Comparator<Team>
{
	public int compare(final Team t1, final Team t2)
	{
		if(t1 == null || t2 == null)
			throw new IllegalArgumentException("teams are null");
		return t1.getPayroll() - t2.getPayroll();
	}
}