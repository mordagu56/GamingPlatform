package MessagesGameState;

public enum ETreasureState {

	MyTreasureIsPresent("MyTreasureIsPresent"),
	NoOrUnknownTreasureState("NoOrUnknownTreasureState");
	
	private String name;

	private ETreasureState(String name) {
		this.name = name;
	}
	
	
}
