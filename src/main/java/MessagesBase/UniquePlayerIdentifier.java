package MessagesBase;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UniquePlayerIdentifier {
	
	@NotNull
	@Size(min=1)
	private String uniquePlayerID;

	public UniquePlayerIdentifier() {
		super();
	}

	public UniquePlayerIdentifier(String uniquePlayerID) {
		super();
		this.uniquePlayerID = uniquePlayerID;
	}
	
	public UniquePlayerIdentifier(UniquePlayerIdentifier uniquePlayerID) {
		super();
		
	}
	
	public boolean isDefined() {
		
		return false;
	}
	
	static boolean isDefined(UniquePlayerIdentifier identifier) {
		
		return false;
	}
	
	static UniquePlayerIdentifier of​(String uniquePlayerID) {
		
		
		return null;
	}
	
	static UniquePlayerIdentifier random() {
		
		return null;
	}
	

	public String getUniquePlayerID() {
		return uniquePlayerID;
	}

	public void setUniquePlayerID(String uniquePlayerID) {
		this.uniquePlayerID = uniquePlayerID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(uniquePlayerID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniquePlayerIdentifier other = (UniquePlayerIdentifier) obj;
		return Objects.equals(uniquePlayerID, other.uniquePlayerID);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
