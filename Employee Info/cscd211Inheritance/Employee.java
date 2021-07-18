package cscd211Inheritance;

public abstract class Employee extends Object implements Comparable <Employee>
{
	private double BASE;
	private String name; 
	protected double salary; 
	public Employee(final String name, final double basePayrate,final double additionalPayrate)
	{
		if (name.isEmpty() || name == null || basePayrate < 0 || additionalPayrate < 0)
			throw new IllegalArgumentException("the strings are empty or the doubles are less than 0");
		this.name = name;
		this.BASE = basePayrate;
		this.salary = basePayrate + additionalPayrate;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public double getBaseSalary()
	{
		return this.BASE;
	}
	public String getName()
	{
		return this.name;
	}
	public String getType()
	{
		return getClass().getSimpleName();
	}
	public String toString()
	{
		return name;
	}
	public int compareTo(final Employee another)
	{	
		if (another == null)
			throw new IllegalArgumentException("another is null");
		int res = this.getType().compareTo(another.getType());
		if (res != 0)
			return res;
		res = (int)((this.getSalary() - another.getSalary()) * 100);
			return res;
	}
	public abstract void report();
}