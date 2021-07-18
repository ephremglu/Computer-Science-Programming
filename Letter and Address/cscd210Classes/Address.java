package cscd210Classes;

import cscd210Enums.State;

public class Address implements Comparable <Address>
{
	private java.lang.String street;
	private java.lang.String city;
	private int zip;
	private State state;
	
	public Address(final java.lang.String street, final java.lang.String city, final java.lang.String state, final int zip)
	{
		if(street == null || street.isEmpty()|| city == null || city.isEmpty()|| state == null || state.isEmpty())
			throw new IllegalArgumentException("String is null or empty");
		this.street = street;
		this.city = city;
		this.state = State.stateLookup(state);
		this.zip = zip;
	}

	@Override
	public java.lang.String toString()
	{
		String res = "";
		res = res + this.street + "\n" + this.city + ", " + this.state + " " + this.zip;
		return res;
	}

	public java.lang.String getStreet() 
	{
		return street;
	}

	public java.lang.String getCity() 
	{
		return city;
	}

	public int getZip() 
	{
		return zip;
	}
	
	public java.lang.String getFullStateName()
	{
		String res = state.getFullStateName();
		return res;
	}
	
	public int compareTo(final Address another)
	{
		if( another == null)
			throw new IllegalArgumentException("address is null");
		int res = this.state.compareTo(another.state);
		if (res != 0)
			return res;
		res = this.city.compareToIgnoreCase(another.city);
		if (res != 0)
			return res;
		res = this.street.compareToIgnoreCase(another.street);
			return res;
	}
}