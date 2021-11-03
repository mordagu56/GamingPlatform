package MessagesGameState;

import java.util.Set;
import java.util.stream.Stream;

public class FullMap {
	
	private final Set<FullMapNode> mapNodes;

	public FullMap() {
		this.mapNodes = null;
		
	}

	public FullMap(Set<FullMapNode> mapNodes) {
		super();
		this.mapNodes = mapNodes;
	}

	public Set<FullMapNode> getMapNodes() {
		return mapNodes;
	}

	
	public Stream<FullMapNode> stream(){
		
		return null;
	}
	

}
