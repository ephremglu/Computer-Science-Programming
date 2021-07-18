package cscd210Classes;

public class Letter implements Comparable <Letter> 
{
	private java.lang.String toName;
	private Address toAddress;
	
	public Letter(final java.lang.String toName, final java.lang.String toStreet, final java.lang.String toCity, final java.lang.String toState, final int toZip)
	{
		if( toName == null || toStreet == null || toCity == null || toState == null || toName.isEmpty() || toStreet.isEmpty() || toCity.isEmpty() || toState.isEmpty())
				throw new IllegalArgumentException( "Cannot be null or empty");
		this.toName = toName;
		this.toAddress = new Address(toStreet, toCity, toState, toZip);
	}
	
	public Letter(final java.lang.String toName, final Address toAddress)
	{
		if( toName == null || toAddress == null || toName.isEmpty())
			throw new IllegalArgumentException( "Cannot be null or empty");
		this.toName = toName;
		this.toAddress = new Address(toAddress.getStreet(),toAddress.getCity(),toAddress.getFullStateName(), toAddress.getZip());
	}
	
	@Override
	public java.lang.String toString()
	{
		return  toName + "\n" + toAddress;
	}
	
	public int compareTo(final Letter another)
	{
		if( another == null )
			throw new IllegalArgumentException( "Cannot be null");
		int res = this.toAddress.compareTo(another.toAddress);
		if (res != 0)
			return res;
		res = this.toName.compareToIgnoreCase(another.toName);
			return res;
	}

	public Address getAddress() 
	{
		return this.toAddress;
	}
	
	public java.lang.String getName()
	{
		return this.toName;
	}
}
