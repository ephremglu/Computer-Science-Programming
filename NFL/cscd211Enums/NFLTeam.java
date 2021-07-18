package cscd211Enums;

public enum NFLTeam 
{
	PIT("Pittsburgh Steelers"), SFO("San Francisco 49ers"), BAL("Baltimore Ravens,"), 
	HOU("Houston Texans"), CLE("Cleveland Browns"), MIA("Miami Dolphins"), SEA("Seattle Seahawks"),
	TEN("Tennessee Titans"), CIN("Cincinnati Bengals"), PHI("Philadelphia Eagles"), JAC("Jacksonville Jaguars"),
	KAN("Kansas City Chiefs"), NOR("New Orleans Saints"), CHI("Chicago Bears"), NWE("New England Patriots"),
	DAL("Dallas Cowboys"), ARI("Arizona Cardinals"), ATL("Atlanta Falcons"), GNB("Green Bay Packers"),
	NYJ("New York Jets"), WAS("Washington Redskins"), SDG("Los Angeles Chargers"), DET("Detroit Lions"),
	DEN("Denver Broncos"), NYG("New York Giants"), STL("L.A. Rams"), CAR("Carolina Panthers"), IND("Indianapolis Colts"),
	OAK("Oakland Raiders"), BUF("Buffalo Bills"), MIN("Minnesota Vikings"), TAM("Tampa Bay Buccaneers");
	 
	private final java.lang.String teamName;
	
	private NFLTeam(final String teamName)
	{
		this.teamName = teamName;
	}
	
	public java.lang.String toString()
	{
		return this.teamName;
	}
	
	public static NFLTeam lookupTeamCode(final java.lang.String teamCode)
	{
		if(teamCode == null || teamCode.isEmpty())
			throw new IllegalArgumentException("teamCode is null or empty");
		return NFLTeam.valueOf(teamCode.trim().toUpperCase());
	}
}
