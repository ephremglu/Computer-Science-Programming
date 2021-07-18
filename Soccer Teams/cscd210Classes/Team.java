package cscd210Classes;

public class Team implements Comparable<Team>
{
	private java.lang.String code;
	private java.lang.String country;
	private Player[] squad;
	
	public Team(final java.lang.String code, final java.lang.String country, final Player[] squad)
	{
		if(code == null || code.isEmpty() || country == null || country.isEmpty() || squad == null)
			throw new IllegalArgumentException("code, country and squad are null of if code and country are empty");
		this.code = code;
		this.country = country;
		this.squad = new Player[squad.length];
		for(int x = 0; x < squad.length; x++)
			{
				this.squad[x] = new Player(squad[x].getName(), squad[x].getNumber(), squad[x].getPosition()); 
			}
	}
	
	@Override
	public java.lang.String toString()
	{
		String out = "";
		for(int x = 0; x < squad.length-1;  x++)
		{
			out += squad[x]+ "\n";
		}
		out += squad[squad.length - 1];
		return "Country: " + country + "\n" + out;
	}
	
	public int compareTo(final Team another)
	{
		if(another == null)
			throw new IllegalArgumentException("Another is null");
		int res = this.code.compareTo(another.code);
		return res;
	}

	public java.lang.String getCode() 
	{
		String res = this.code;
		return res;
	}

	public java.lang.String getCountry() 
	{
		String res = this.country;
		return res;
	}
	
	public Player[] getPlayers()
	{
		return this.squad;
	}
	
	public void setPlayers(Player[] squad)
	{
		if(squad == null)
			throw new IllegalArgumentException("Squad is null");
		this.squad = new Player[squad.length];
		for(int x = 0; x < squad.length; x++)
			{
			this.squad[x] = new Player(squad[x].getName(), squad[x].getNumber(), squad[x].getPosition()); 
			}
	}
}