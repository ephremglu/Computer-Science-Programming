package cscd210Classes;

public class Player implements Comparable<Player>
{
	private java.lang.String name;
	private int number;
	private java.lang.String position;
	
	public Player(final java.lang.String name, final int number, final java.lang.String position)
	{
		if(name == null || name.isEmpty() || position == null || position.isEmpty() || number < 0)
			throw new IllegalArgumentException("The name or position are null or emtpy or if the number is less than 0");
		this.name = name;
		this.number = number;
		this.position = position;
	}
	
	@Override
	public java.lang.String toString()
	{
		String res = this.name + " - " + this.position + " - " + this.number;
		return res;
	}
	
	public int compareTo(final Player another)
	{
		if(another == null)
			throw new IllegalArgumentException("Another is null");
		int res = this.number - another.number;
		return res;
	}

	public java.lang.String getName() 
	{
		String res = this.name;
		return res;
	}

	public int getNumber() 
	{
		int res = this.number;
		return res;
	}

	public java.lang.String getPosition() 
	{
		String res = this.position;
		return res;
	}
}