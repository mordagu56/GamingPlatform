package MessagesBase;

public class PlayerMove {
	
	private EMove move;
	
     PlayerMove() {
		
		
	}
	
	private PlayerMove (String uniquePlayerID, EMove move) {
		
		
	}
	
	private	PlayerMove(UniquePlayerIdentifier uniquePlayerID, EMove move) {
		
		
	}

	public EMove getMove() {
		return move;
	}

	public void setMove(EMove move) {
		this.move = move;
	}
	
	static PlayerMove of​(String uniquePlayerID, EMove move) {
		
		
		return null;
	}

	static PlayerMove of​(UniquePlayerIdentifier uniquePlayerID, EMove move) {
		
		
		return null;
	
	}
	
}
