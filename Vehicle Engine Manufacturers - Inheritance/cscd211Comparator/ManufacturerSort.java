package cscd211Comparator;

import java.util.Comparator;

import cscd211Inheritance.Engine;

public class ManufacturerSort implements Comparator <Engine>
{
	@Override
	public int compare(final Engine e1, final Engine e2) 
	{
		return e1.compareTo(e2);
	}
}