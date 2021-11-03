package MessagesBase;

import java.io.Serializable;
import java.lang.Comparable;

public enum ERequestState implements Comparable<ERequestState> {
	Okay("Okay"), 
	Error("Error");

	private String name;
	
	ERequestState() {
		
	}

	
	ERequestState(String name) {
		this.name = name;
	}

	
}
