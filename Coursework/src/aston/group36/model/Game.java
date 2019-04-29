package aston.group36.model;
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
		// TODO 
	}
	
	public void placePlayer(Player p){
		// TODO 
	}
	
	public void incrementRound(){
		round++;
	}
	
	public void startGame(){
		// TODO 
	}
	
	public void winGame(Player p){
		// TODO 
	}
}
