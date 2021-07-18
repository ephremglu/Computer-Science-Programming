package cscd211Classes;

import cscd211Enums.NFLTeam;

public class Team implements Comparable<Team>
{
	private NFLTeam teamCode;
	
	public Team(final java.lang.String teamCode)
	{
		if(teamCode == null || teamCode.isEmpty())
			throw new IllegalArgumentException("teamCode is null or empty");
		this.teamCode = NFLTeam.lookupTeamCode(teamCode);
	}
	
	@Override
	public java.lang.String toString()
	{
		String res = this.teamCode.name() + " - " + this.teamCode;
		return res;
	}
	
	public int compareTo(final Team another)
	{
		if(another == null)
			throw new IllegalArgumentException("another is null");
		int res = this.teamCode.compareTo(another.teamCode);
		return res;
	}
	
	public NFLTeam getTeamCode()
	{
		return this.teamCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teamCode == null) ? 0 : teamCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Team))
			return false;
		Team other = (Team) obj;
		if (teamCode != other.teamCode)
			return false;
		return true;
	}
}