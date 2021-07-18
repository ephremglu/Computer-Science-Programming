package cscd211Classes.teams;

import java.util.ArrayList;
import java.util.Iterator;
import cscd211Classes.players.Player;
import cscd211Interfaces.Payroll;
import cscd211Interfaces.Taxable;

public class Team extends java.lang.Object implements Taxable, Payroll, Comparable<Team> 
{
	protected java.lang.String city;
	protected java.lang.String teamName;
	protected int payroll;
	protected java.util.ArrayList<Player> players;
	
	public Team(final java.lang.String city, final java.lang.String teamName, final Player[] players) throws CloneNotSupportedException
    {
		if(city == null || teamName == null || city.isEmpty() || teamName.isEmpty() || players == null || players.length <= 0)
			throw new IllegalArgumentException("the Strings are null or empty and players array is null or the length is <= 0");
		this.city = city;
		this.teamName = teamName;
		ArrayList<Player> person = new ArrayList<Player>();
		Player temp;
		for(int x = 0; x < players.length; x++)
		{
			temp = players[x].clone();
			person.add(temp);
		}
		this.players = person;
		this.payroll = calculatePayroll();
    }
	
	public java.lang.String getTeamName()
	{
		return this.teamName;
	}
	
	public java.util.ArrayList<Player> getPlayers()
	{
		return this.players;
	}
	
	public java.lang.String getCity()
	{
		return this.city;
	}
	
	public int getPayroll()
	{
		return this.payroll;
	}
	
	@Override
	public java.lang.String toString()
	{
		String temp = this.city + " - " + this.teamName + "\nPayroll: " + this.payroll + " \nTaxes: " + this.calculateTaxes() 
		+ "\nPlayer Name              SSN             SALARY            POSITION           STATS            NUMBER" + "\n"
		+ "-------------------------------------------------------------------------------------------------------" + "\n";
		Iterator<Player> person = this.players.iterator();
		while(person.hasNext())
		{
			temp += person.next().toString() + "\n";
		}
		return temp + "\n\n";
	}
	
	public double calculateTaxes()
	{
		double sum = 0.0;
		double temp = 0.0;
		Iterator<Player> person = this.players.iterator();
		while(person.hasNext())
		{
			temp = person.next().getSalary();
			if(temp > 250000)
			{
				temp = temp * BASE_TAX_RATE;
				sum += temp;
			}
			else
			{
				temp = temp * (BASE_TAX_RATE - 0.1);
				sum += temp;
			}
		}
		return sum;
	}
	
	public int calculatePayroll()
	{
		int sum = 0;
		Iterator<Player> person = this.players.iterator();
		while(person.hasNext())
		{
			sum += person.next().getSalary();
		}
		return sum;
	}
	
	@Override
	public int compareTo(final Team pi)
	{
		if(pi == null)
			throw new IllegalArgumentException("pi is null");
		int temp = this.city.compareTo(pi.city);
		if(temp != 0)
			return temp;
		else
			return this.teamName.compareTo(pi.teamName);
	}
}
