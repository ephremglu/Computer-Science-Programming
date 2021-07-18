import java.util.Observable;

public class GoodGuys 
{
	private int hobbitNum;
	private int elfNum;
	private int dwarfNum;
	private int menNum;

	public GoodGuys(int hobbitNum, int elfNum, int dwarfNum, int menNum) 
	{
		this.hobbitNum = hobbitNum;
		this.elfNum = elfNum;
		this.dwarfNum = dwarfNum;
		this.menNum = menNum;
	}

	public int getHobbitNum() 
	{
		return hobbitNum;
	}

	public void setHobbitNum(int hobbitNum) 
	{
		this.hobbitNum = hobbitNum;
	}

	public int getElfNum() 
	{
		return elfNum;
	}

	public void setElfNum(int elfNum) 
	{
		this.elfNum = elfNum;
	}

	public int getDwarfNum() 
	{
		return dwarfNum;
	}

	public void setDwarfNum(int dwarfNum) 
	{
		this.dwarfNum = dwarfNum;
	}

	public int getMenNum() 
	{
		return menNum;
	}

	public void setMenNum(int menNum) 
	{
		this.menNum = menNum;
	}
}