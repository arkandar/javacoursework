/**
 * 
 * Robot is the object the player controls
 * 
 * @author Muhammad Yusuf
 * @version 1.0
 *
 */
public class Robot{

	public Location loc;
	public Player player;
	
	public String text;
	public Robot(){
		text = "robot";
	}
	public void act(Action a) {

	}
	
	public Location getLocation() {
		return loc;

	}

	public void destroy() {

	}

	public void push() {

	}

	public Location getStartingLocation() {
		return null;
	}
	
	public String toString() {
		return text;
	}
}
