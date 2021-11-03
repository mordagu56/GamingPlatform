package MessagesBase;

import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import MessagesGameState.EFortState;
import MessagesGameState.EPlayerPositionState;
import MessagesGameState.ETreasureState;

public class HalfMapNode extends java.lang.Object {
	
	private boolean fortPresent;
	
	@NotNull 
	private ETerrain terrain;
	
	@Positive
	@Min(0L)
	@Max(7L)
	private final int X;
	
	@Positive
	@Min(0L)
	@Max(3L)
	private final int Y;
	
	public HalfMapNode() {
		this.X = 0;
		this.Y = 0;
	}
	
	public HalfMapNode(int x, int y,  ETerrain terrain) {
		this.X = x;
		this.Y = y;
		this.terrain = terrain;
		
	}
	
	public HalfMapNode(int x, int y,  boolean fortPresent, ETerrain terrain) {
		this.X = x;
		this.Y = y;
		this.fortPresent = fortPresent;
		this.terrain = terrain;
		
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(X, Y, fortPresent, terrain);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HalfMapNode other = (HalfMapNode) obj;
		return X == other.X && Y == other.Y && fortPresent == other.fortPresent && terrain == other.terrain;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public boolean isFortpresent() {
		return fortPresent;
	}

	public void setFortpresent(boolean fortpresent) {
		this.fortPresent = fortpresent;
	}

	public ETerrain getTerrain() {
		return terrain;
	}

	public void setTerrain(ETerrain terrain) {
		this.terrain = terrain;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}
}
