package cscd211Inheritance;

public class Lawyer extends Employee
{
	private int stockOptions;
	public Lawyer(final String name, final double basePayrate, final double additionalPayrate, final int stockOptions)
	{
		super(name, basePayrate, additionalPayrate);
		if(stockOptions < 1)
			throw new IllegalArgumentException("parking stipend is less than 1");
		this.stockOptions = stockOptions;
	}
	public int getStockOptions()
	{
		return this.stockOptions;
	}
	public void report()
	{		
		System.out.println("I am a lawyer.  I get " + super.getSalary() + " and I have " + stockOptions + " shares of stock.");
	}
	public String toString()
	{
		return "Lawyer: " + super.toString();
	}
}