package cscd211Enums;

public enum Position 
{
	WR("wide reciever"), TE("tight end"), RB("running back"), QB("quarterback"), KI("kicker");
	
	private java.lang.String type;
	
	private Position(final String type)
	{
		this.type = type;
	}
	
	public java.lang.String toString()
	{
		String[] position = this.type.split(" ");
		String res = "";
		
		for(int x = 0; x < position.length; x++)
		{
			res += (position[x].substring(0,1).toUpperCase() + position[x].substring(1) + " ");
		}
		return res;
	}
	
	public static Position lookupPosition(final java.lang.String position)
	{
		if(position == null || position.isEmpty())
			throw new IllegalArgumentException("string is null or empty or doesn't exist");
		return Position.valueOf(position.trim().toUpperCase());
	}
}
