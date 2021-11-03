package MessagesGameState;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class GameState {
	
	private Optional<FullMap> map;
	private Set<PlayerState>players;
	private String gameStateId;
	
	
	public GameState() {
		super();
	}


	public GameState(Set<PlayerState> players, String gameStateId) {
		super();
		this.players = players;
		this.gameStateId = gameStateId;
	}


	public GameState(Optional<FullMap> map, Set<PlayerState> players, String gameStateId) {
		super();
		this.map = map;
		this.players = players;
		this.gameStateId = gameStateId;
	}


	@Override
	public int hashCode() {
		return Objects.hash(gameStateId, map, players);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameState other = (GameState) obj;
		return Objects.equals(gameStateId, other.gameStateId) && Objects.equals(map, other.map)
				&& Objects.equals(players, other.players);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	public Optional<FullMap> getMap() {
		return map;
	}


	public Set<PlayerState> getPlayers() {
		return players;
	}


	public String getGameStateId() {
		return gameStateId;
	}
	
	
	


}
