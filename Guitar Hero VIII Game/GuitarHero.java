public class GuitarHero {
	public static void main(String[] args) 
	{
		GameCharacter player1 = new Slash(new GibsonFlyingV(), new PutTheGuitarOnFire());
		GameCharacter player2 = new JimiHendrix(new FenderTelecaster(), new JumpOffStage());
		player1.playGuitar(); 
		player2.playGuitar(); 
		player1.playSolo(); 
		player2.playSolo();
		player1.setSolo(new JumpOffStage());
		player1.playSolo();
		player1.setGuitar(new FenderTelecaster());
		player1.playGuitar();
	}
}