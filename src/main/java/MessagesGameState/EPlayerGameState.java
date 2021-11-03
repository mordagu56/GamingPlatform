package MessagesGameState;

public enum EPlayerGameState {
	Lost("Lost"),
	MustAct("MustAct"),
	MustWait("MustWait"),
	Won("Won");
	
	private String name;

	private EPlayerGameState(String name) {
		this.name = name;
	}
	

}
