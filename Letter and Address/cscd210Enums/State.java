package cscd210Enums;

public enum State
{
	AL("Alabama"), AK("Alaska"), AZ("Arizona"), AR("Arkansas"), CA("California"), 
	CO("Colorado"), CT("Connecticut"), DE("Deleware"), DC("District of Columbia"), FL("Florida"), 
	GA("Georgia"), HI("Hawaii"), ID("Idaho"), IL("Illinois"), IN("Indiana"),
	IA("Iowa"), KS("Kansas"), KY("Kentucky"), LA("Louisiana"), ME("Maine"),
	MT("Montana"), NE("Nebraska"), NV("Nevada"), NH("New Hampshire"), NJ("New Jersey"),
	NM("New Mexico"), NY("New YOrk"), NC("North Carolina"), ND("North Dakota"), OH("Ohio"),
	OK("Oklahoma"), OR("Oregon"), MD("Maryland"), MA("Massachusetts"), MI("Michigan"),
	MN("Minnesota"), MS("Mississippi"), MO("Missouri"), PA("Pennsylvania"), RI("Rhode Island"),
	SC("South Carolina"), SD("South Dakota"), TN("Tennessee"), TX("Texas"), UT("Utah"),
	VT("Vermont"), VA("Virgina"), WA("Washington"), WV("West Virgina"), WI("Wisconsin"),
	WY("Wyoming");

	private final java.lang.String name;
	
	private State(final String name)
	{
		this.name = name;
	}
	
	public static State stateLookup(final java.lang.String name)
	{
		if(name == null || name.isEmpty())
			throw new IllegalArgumentException("Name is null or empty");
		State[] newArray = State.values();
		for(int x = 0; x < newArray.length; x++)
		{
			if(newArray[x].name.equalsIgnoreCase(name))
				return newArray[x];
		}
		throw new IllegalArgumentException("Cannot be null or empty");
	}
	
	public java.lang.String toString()
	{
		return this.name();
	}
	
	public java.lang.String getFullStateName()
	{
		String res = this.name;
		return res;
	}
}
