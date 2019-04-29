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
	F {
		public void run(Robot r) { r.act(F); }
	},

	B {},

	L {},

	R {},

	U {},

	W {};

	public abstract void run(Robot r);
	// TODO 
}
