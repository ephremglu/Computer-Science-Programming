package cscd211Inheritance;

public class CarEngine extends Engine
{
	public CarEngine(final java.lang.String manufacturer, final int horsePower)
	{
		super(manufacturer, horsePower);
	}
	
	public CarEngine(final int horsePower, final java.lang.String manufacturer)
	{
		super(manufacturer, horsePower);
	}
	
	@Override
	public java.lang.String toString()
	{
		return "Car Engine" + " - " + "Manufacturer:" + " " + super.toString();
	}
	
	public int calcOutput()
	{
		return super.calcOutput()/12;
	}
}