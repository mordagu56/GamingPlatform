package MessagesGameState;

import MessagesBase.UniquePlayerIdentifier;

public class PlayerState extends UniquePlayerIdentifier{

	
	private String firstName;
	private String lastName;
	private String studentID;
	private EPlayerGameState state;
	private boolean collectedTreasure;
	
	public PlayerState() {
		super();
	}

	public PlayerState(String firstName, String lastName, String studentID, EPlayerGameState state, 
			UniquePlayerIdentifier identifier, boolean collectedTreasure) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.state = state;
		this.collectedTreasure = collectedTreasure;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public EPlayerGameState getState() {
		return state;
	}

	public void setState(EPlayerGameState state) {
		this.state = state;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	boolean hasCollectedTreasure() {
		
		return false;
	}
	
	
}
