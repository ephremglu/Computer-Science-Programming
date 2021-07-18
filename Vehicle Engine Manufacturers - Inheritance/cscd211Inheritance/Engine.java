package cscd211Inheritance;

public class Engine implements java.lang.Comparable<Engine>
{
	protected int horsePower;
	private String manufacturer;
	public Engine(final java.lang.String manufacturer, final int horsePower)
	{
		if(manufacturer == null || manufacturer.isEmpty() || horsePower <= 0)
			throw new IllegalArgumentException("manufacturer is null or empty and if horsePower is less than or equal to 0");
		 this.manufacturer = manufacturer;
		 this.horsePower = horsePower;
	}
	
	@Override
	public java.lang.String toString()
	{
		return this.manufacturer + " with HP of " + this.horsePower;
	}
	
	public int calcOutput()
	{
		return (this.horsePower*5);
	}
	
	public java.lang.String getManufacturer()
	{
		return this.manufacturer;
	}
	
	public int compareTo(final Engine pi)
	{
		int x = this.horsePower - pi.horsePower;
		if(x == 0)
			return x;
		else
			return this.manufacturer.compareTo(pi.manufacturer);
	}
}