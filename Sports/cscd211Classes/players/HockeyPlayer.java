package cscd211Classes.players;

public class HockeyPlayer extends Player implements java.lang.Cloneable
{
	protected int jerseyNumber;
	
	public HockeyPlayer(final java.lang.String name, final java.lang.String ssn, final int salary, final java.lang.String position, final int jerseyNumber)
	{
		super(name, ssn, salary, position);
		if(jerseyNumber < 0)
			throw new IllegalArgumentException("jersey number is less than 0");
		this.jerseyNumber = jerseyNumber;
	}
	
	@Override
	public java.lang.String toString()
	{
		return super.toString() + "                               " + this.jerseyNumber;
	}
	
	@Override
	public HockeyPlayer clone() throws CloneNotSupportedException
	{
		return (HockeyPlayer)super.clone();
	}
}