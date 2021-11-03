package MessagesBase;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UniqueGameIdentifier extends Object {

	private int GAME_ID_LENGTH;
	
	@NotNull
	@Size(min=5, max=5)
	private String uniqueGameID;

	public UniqueGameIdentifier() {
		super();
	}

	public UniqueGameIdentifier(@NotNull @Size(min = 5, max = 5) String uniqueGameID) {
		super();
		this.uniqueGameID = uniqueGameID;
	}

	public String getUniqueGameID() {
		return uniqueGameID;
	}

	public void setUniqueGameID(String uniqueGameID) {
		this.uniqueGameID = uniqueGameID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(GAME_ID_LENGTH, uniqueGameID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniqueGameIdentifier other = (UniqueGameIdentifier) obj;
		return GAME_ID_LENGTH == other.GAME_ID_LENGTH && Objects.equals(uniqueGameID, other.uniqueGameID);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}
