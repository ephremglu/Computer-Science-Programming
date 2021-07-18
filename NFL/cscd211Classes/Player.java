package cscd211Classes;

import cscd211Enums.Position;

public class Player implements Comparable<Player>
{
	private java.lang.String first;
	private java.lang.String last;
	private Team team;
	private Position position;
	private int gamesPlayed;
	
	public Player(final java.lang.String name, final java.lang.String teamCode, final java.lang.String gamesPlayed, final java.lang.String position)
	{
		if(name == null || name.isEmpty() || teamCode == null || teamCode.isEmpty() || position == null || position.isEmpty() || gamesPlayed == null || gamesPlayed.isEmpty())
			throw new IllegalArgumentException("name, teamCode, gamesPlayed, position is null or empty");
		String nT = name.trim();
		String[] nS = name.split(" ");
		String fName = nS[0].trim();
		String lName = nS[1].trim();
		this.first = fName;
		this.last = lName;
		this.team = new Team(teamCode);
		this.gamesPlayed = Integer.parseInt(gamesPlayed);
		this.position = Position.lookupPosition(position);
	}
	
	public Player(final java.lang.String first, final java.lang.String last, final java.lang.String teamCode)
	{
		if(first == null || first.isEmpty() || teamCode == null || teamCode.isEmpty() || last == null || last.isEmpty())
			throw new IllegalArgumentException("name, teamCode, gamesPlayed, position is null or empty");
		this.first = first;
		this.last = last;
		this.team = new Team(teamCode);
	}
	
	public int compareTo(final Player another)
	{
		if(another == null)
			throw new IllegalArgumentException("another is null");
		int res = this.last.compareTo(another.last);
		if(res != 0)
			return res;
		res = this.first.compareTo(another.first);
		return res;
	}
	
	@Override
	public java.lang.String toString()
	{
		String res = this.last + ", " + this.first + ", " + this.position + ", " + this.team;
		return res;
	}
	
	public int getGamesPlayed()
	{
		return this.gamesPlayed;
	}
	
	public java.lang.String getTeam()
	{
		return this.team.toString();
	}
	
	public Position getPosition()
	{
		return this.position;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + gamesPlayed;
		result = prime * result + ((last == null) ? 0 : last.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((team == null) ? 0 : team.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Player))
			return false;
		Player other = (Player) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (last == null) {
			if (other.last != null)
				return false;
		} else if (!last.equals(other.last))
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		return true;
	}
}