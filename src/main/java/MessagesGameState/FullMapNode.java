package MessagesGameState;

import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

import MessagesBase.ETerrain;

public class FullMapNode {
	
	private EFortState fortState;
	private EPlayerPositionState playerPositionState;
	private ETerrain terrain;
	private ETreasureState treasureState;
	
	@Positive
	@Min(0L)
	@Max(15L)
	private final int X;
	
	@Positive
	@Min(0L)
	@Max(7L)
	private final int Y;

	public FullMapNode() {
		this.terrain = null;
	    this.X = 0;
	    this.Y = 0;
	    this.playerPositionState = null;
	    this.treasureState = null;
	    this.fortState = null;
	}

	public FullMapNode(EPlayerPositionState playerPositionState, ETerrain terrain, ETreasureState treasureState,
			@Positive @Min(0) @Max(15) int x, @Positive @Min(0) @Max(7) int y) {
		super();
		this.playerPositionState = playerPositionState;
		this.terrain = terrain;
		this.treasureState = treasureState;
		X = x;
		Y = y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(X, Y, fortState, playerPositionState, terrain, treasureState);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FullMapNode other = (FullMapNode) obj;
		return X == other.X && Y == other.Y && fortState == other.fortState
				&& playerPositionState == other.playerPositionState && terrain == other.terrain
				&& treasureState == other.treasureState;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public EFortState getFortState() {
		return fortState;
	}

	public EPlayerPositionState getPlayerPositionState() {
		return playerPositionState;
	}

	public ETerrain getTerrain() {
		return terrain;
	}

	public ETreasureState getTreasureState() {
		return treasureState;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}
	
	
	

}
