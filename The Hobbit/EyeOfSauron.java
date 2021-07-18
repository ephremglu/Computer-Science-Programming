import java.util.Observable;

public class EyeOfSauron extends Observable 
{
	private GoodGuys goodGuys;

	public void setEnemies(int hobbitNum, int elfNum, int dwarfNum, int menNum) 
	{
		this.goodGuys = new GoodGuys(hobbitNum, elfNum, dwarfNum, menNum);
		this.setChanged();
		this.notifyObservers();
		this.clearChanged();
	}

	public GoodGuys getGoodGuys() 
	{
		return this.goodGuys;
	}
}