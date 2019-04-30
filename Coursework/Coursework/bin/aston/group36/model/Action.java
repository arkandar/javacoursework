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

	B {
		public void run(Robot r) {r.act(B);}
	},

	L {
		public void run(Robot r) {r.act(L); }
	},

	R {
		public void run (Robot r) {r.act(R) ; }
	},

	U {
		public void run (Robot r) {r.act(U); }
	},

	W {
		public void run (Robot r) { r.act(W); }
	};

	public abstract void run(Robot r);
	// TODO 
}






