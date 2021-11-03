package MessagesBase;

public enum ETerrain {
	GRASS("grass"),
	MOUNTAIN("mountain"),
	WATER("water");
	
	private String name;

	private ETerrain() {
		
		
	}
	
	private ETerrain(String name) {
		this.name = name;
	}
	
	

}
