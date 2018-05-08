package function;
public class Player extends Sim{
	
	public Player(String pn1, String cc1, int r) {
		Sim.playerName = pn1;
		this.characterClass = cc1.toLowerCase();
		this.rank = r;
	}

	
}
