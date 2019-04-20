import java.util.ArrayList;
/**
 * 
 * Stores the board and has a basic TUI
 * 
 * @author Iqbal Miah
 * @version 1.0
 *
 */
public class Game {
	
	protected Board board;
	private int numPlayers;
	protected ArrayList<Player> players;
	protected boolean gameWon;
	private int round;
	
	public Game(){

	}
	
	public void placePlayer(Player p){
		
	}
	
	public void incrementRound(){
		round++;
	}
	
	public void startGame(){

	}
	public static void main(String[] args){
		Board b = new Board(4, 4);
	}
	
	public void winGame(Player p){
		
	}
}
