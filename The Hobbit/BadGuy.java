import java.util.Observable;
import java.util.Observer;

public class BadGuy implements Observer 
{
	private String name;
	private EyeOfSauron eye;

	public BadGuy(EyeOfSauron eye, String name) 
	{
		this.eye = eye;
		this.name = name;
		this.eye.addObserver(this);
	}

	public void defeated() 
	{
		this.eye.deleteObserver(this);
		System.out.println(this.name + " was defeated.");
	}

	public void update(Observable o, Object obj) 
	{
		System.out.println(this.name + " and I, know about " + this.eye.getGoodGuys().getHobbitNum() + " Hotbit(s), "
				+ this.eye.getGoodGuys().getElfNum() + " Elf(s), " + this.eye.getGoodGuys().getDwarfNum()
				+ " Dwarf(s), and " + this.eye.getGoodGuys().getMenNum() + " Men.");
	}

}