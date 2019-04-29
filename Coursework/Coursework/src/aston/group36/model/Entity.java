package aston.group36.model;
/**
 * 
 * Abstract class that other parts on board like Pit and Gear use
 * 
 * @author Enamul Rahman
 * @version 1.0
 *
 */
abstract public class Entity {
	public Location location;
	
	abstract public void react(Robot r);
	
	public Location getLocation(){
		return location;
	}
	public String toString(){
		// TODO 
		return null;
	}
}
	
	


