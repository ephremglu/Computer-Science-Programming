package cscd211Classes.players;

public class BaseballPlayer extends Player implements java.lang.Cloneable
{
	protected double batAvg;
	public BaseballPlayer(final java.lang.String name, final java.lang.String ssn, final int salary, final java.lang.String position, final double batAvg)
	{
		super(name, ssn, salary, position);
		if(batAvg < 0)
			throw new IllegalArgumentException("batting average is less than 0");
		this.batAvg = batAvg;
	}
	
	@Override
	public java.lang.String toString()
	{
		return super.toString() + "      Batting Avg: " + this.batAvg;
	}
	
	@Override
	public BaseballPlayer clone() throws CloneNotSupportedException
	{
		return (BaseballPlayer)super.clone();
	}
}