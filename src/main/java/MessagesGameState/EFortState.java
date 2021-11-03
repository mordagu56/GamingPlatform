package MessagesGameState;

public enum EFortState {
	ENEMYfORTPRESENT("enemyFortPresent"),
	MYFORTPRESENT("myFortPresent"),
	NOORUNKNOWNFORTSTATE("noOrUnknowFortState");
	
	private String name;

	private EFortState(String name) {
		this.name = name;
	}

}
