package cscd211Inheritance;

public class Programmer extends Employee 
{
	private boolean busPass;
	public Programmer(final String name, final double basePayrate, final double additionalPayrate, final boolean busPass)
	{
		super(name, basePayrate, additionalPayrate);
		this.busPass = busPass;
	}
	public boolean getBusPass()
	{
		return this.busPass;
	}
	public void report()
	{
		if(this.busPass == true)
			System.out.println("I am a Programmer. I get " + super.getSalary() + " and I get a bus pass.");
		else
			System.out.println("I am a Programmer. I get " + super.getSalary() + " and I do not get a bus pass.");
	}
	public String toString()
	{
		return "Programmer: " + super.toString();
	}
}