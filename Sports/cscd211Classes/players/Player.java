package cscd211Classes.players;

public abstract class Player extends java.lang.Object implements java.lang.Cloneable
{
	protected java.lang.String name;
	protected java.lang.String ssn;
	protected java.lang.String position;
	protected int salary;

	protected Player(final java.lang.String name, final java.lang.String ssn, final int salary, final java.lang.String position)
	{
		if(name == null || name.isEmpty() || ssn == null || ssn.isEmpty() || position == null || position.isEmpty())
			throw new IllegalArgumentException("the strings are null or empty");
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
		this.position = position;
	}

	public int getSalary()
	{
		return this.salary;
	}

	public java.lang.String getPosition()
	{
		return this.position;
	}

	public java.lang.String getName()
	{
		return this.name;
	}

	public java.lang.String getSSN()
	{
		return this.ssn;
	}

	@Override
	public java.lang.String toString()
	{
		return this.name + "         " + this.ssn + "         " + this.salary + "         " + this.position;
	}

	@Override
	public Player clone() throws CloneNotSupportedException
	{
		return (Player)super.clone();
	}
}