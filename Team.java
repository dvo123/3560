import java.util.ArrayList;
import java.util.List;

public class Team {
	private int code;
	private List<Player> listPlayers;

	/**
		Default Constructor.
	 */

	public Team () {
		code = 0;
		listPlayers = new ArrayList<Player>();
	}
	@Override
	public String toString() {
		return String.valueOf(code);
	}
}
