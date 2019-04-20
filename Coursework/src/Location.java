/**
 * 
 * Keeps track of the x and y of elements
 * 
 * @author Khawaja Ahmad
 * @version 1.0
 *
 */
public class Location {

	public int x;
	public int y;
	
	
	public Location(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
		
	}
	public int getY() {
		return y;		
	}
	
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
