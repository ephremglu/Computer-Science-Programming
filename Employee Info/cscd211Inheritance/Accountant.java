package cscd211Inheritance;

public class Accountant extends Employee 
{
	private double parkingStipend;
	public Accountant(final String name, final double basePayrate, final double additionalPayrate, final double parkingStipend)
	{
		super(name, basePayrate, additionalPayrate);
		if(parkingStipend < 1.00)
			throw new IllegalArgumentException("parking stipend is less than 1.00");
		this.parkingStipend = parkingStipend;
	}
	public double getParkingStipend()
	{
		return this.parkingStipend;
	}
	public void report()
	{
		System.out.println("I am an accountant. I make " + super.getSalary() + " plus a parking stipend of " + parkingStipend);
	}
	public String toString()
	{
		return "Accountant: " + super.toString();
	}
}