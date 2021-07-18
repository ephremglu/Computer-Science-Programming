public abstract class GameCharacter
{
	protected String name;
	protected SoloBehavior solo;
	protected GuitarBehavior guitar;
	
	public void playGuitar()
	{
		guitar.playGuitar(this.name);
	}
	
	public void playSolo()
	{
		solo.playSolo(this.name);
	}
	
	protected GameCharacter(String name, GuitarBehavior guitar, SoloBehavior solo)
	{
			this.name = name;
			this.solo = solo;
			this.guitar = guitar;
	}
	
	public void setSolo(SoloBehavior solo)
	{
		this.solo = solo;
	}
	
	public void setGuitar(GuitarBehavior guitar)
	{
		this.guitar = guitar;
	}
}