package cscd211Inheritance;

public class TruckEngine extends Engine
{
	private boolean diesel;
	public TruckEngine(final java.lang.String manufacturer, final int horsePower, final boolean diesel)
	{
		super(manufacturer, horsePower);
		this.diesel = diesel;
	}

	@Override
	public java.lang.String toString()
	{
		if(diesel == true)
			return "Truck Engine" + " - " + "Manufacturer: " + super.toString() + " is a diesel engine";
		else
		{
			return "Truck Engine" + " - " + "Manufacturer: " + super.toString() + " is NOT a diesel engine";
		}
	}
	
	@Override
	public int calcOutput()
	{
		super.calcOutput();
		if(this.diesel == true)
		{
			return (super.calcOutput()/18);
		}
		else
		{
			return (super.calcOutput()/8);
		}
	}
}