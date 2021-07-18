package cscd211Classes.players;

public class FootballPlayer extends Player implements java.lang.Cloneable
{
	protected int td;
	protected int jerseyNumber;
	
	public FootballPlayer(final java.lang.String name, final java.lang.String ssn, final int salary, final java.lang.String position, final int td, final int jerseyNumber)
	{
		super(name, ssn, salary, position);
		if(td < 0)
			throw new IllegalArgumentException("touchdowns are less than 0");
		if(jerseyNumber < 0)
			throw new IllegalArgumentException("jersey number is less than 0");
		this.jerseyNumber = jerseyNumber;
		this.td = td;
	}
	
	@Override
	public java.lang.String toString()
	{
		return super.toString() + "       Touchdowns: " + this.td + "         " + this.jerseyNumber;
	}
	
	@Override
	public FootballPlayer clone() throws CloneNotSupportedException
	{
		return (FootballPlayer)super.clone();
	}
}