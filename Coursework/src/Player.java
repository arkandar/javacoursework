/**
 * 
 * Class for what Players will need
 * 
 * @author Iqbal Miah
 * @version 1.0
 *
 */
public class Player {
	private Robot r;
	private boolean won = false;
	private int score = 0;
	
	public Player(){
		r = new Robot();
	}
	
	public Robot getRobot(){
		return r;
	}
	
	public int getScore(){
		return score;
	}
	
}
