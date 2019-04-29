package aston.group36.model;
/**
 * 
 * Action's are the various types of actions players can perform
 * 
 * @author Iqbal Miah
 * @version 1.0
 *
 */
public enum Action {
	FORWARD {
		public void run(Robot r) { r.act(FORWARD); }
	},

	BACKWARD {},

	LEFT {},

	ROTATE {},

	UTURN {},

	WAIT {};

	public abstract void run(Robot r);
	// TODO 
}
