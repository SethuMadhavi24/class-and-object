package playerdetail;

public class Player {
	String playerName;
	String playerPosition;
	public Player(String playerName, String playerPosition) {
		super();
		this.playerName = playerName;
		this.playerPosition = playerPosition;
		System.out.println(playerName+" in the "+playerPosition+" Position.");
	}
	

}
