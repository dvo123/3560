
public class Player {
	private String name;
	private Boolean expert;
	
	/**
		Constructor
		@param name The name of the player.
		@param expert Expert carries the value True or False.

	 */
	
	public Player (String name, Boolean expert) {
		this.name = name;
		this.expert = expert;
	}
	@Override
	public String toString() {
		return name + ", " + String.valueOf(expert);
	}
}
