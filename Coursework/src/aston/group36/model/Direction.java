package aston.group36.model;
/**
 * An enum type for Directions that {@link #aston.group36.mode.Robot} may be facing
 * and allows rotation for using {@link #turnClockwise()} and {@link #turnCounterClockwise()}.
 * 
 * @author Iqbal Miah
 */
public enum Direction {
	N{
		public Direction turnClockwise() { 
			return E;
		}
		public Direction turnCounterClockwise() { 
			return W;
		}
	},
	E{		
		public Direction turnClockwise() { 
			return S;
		}
		public Direction turnCounterClockwise() { 
			return N;
		}
	},
	S{
		public Direction turnClockwise() { 
			return W;
		}
		public Direction turnCounterClockwise() { 
			return E;
		}
	},
	W{
		public Direction turnClockwise() { 
			return N;
		}
		public Direction turnCounterClockwise() { 
			return S;
		}
	};
	public abstract Direction turnClockwise();
	public abstract Direction turnCounterClockwise();
}
