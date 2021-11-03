package MessagesGameState;

public enum EPlayerPostionState {

	BothPlayerPosition("BothPlayerPostion"),
	EnemyPlayerPosition("EnemyPlayerPostion"),
	MyPlayerPostion("MyPlayerPosition"),
	NoPlayerPresent("NoPlayerPresent");
	
	private String name;

	private EPlayerPostionState(String name) {
		this.name = name;
	}
	
	boolean	representsMyPlayer() {
		
		return false;
	}
	
	
}
