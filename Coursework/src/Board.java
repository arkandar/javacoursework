/**
 * 
 * Stores an 2D Object Array with methods to fill the board and print it to console
 * 
 * @author Muhammad Yusuf, Iqbal Miah, Asaa Umar 
 * @version 1.0
 *
 */
public class Board {

	public Object[][] grid;

	public Board(int x, int y){
		grid = new Object[x][y];


		
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = new Pit();
            }
        }
        
		Entity gear1 = new Gear();
		this.place(gear1, 2, 3);

		Entity gear2 = new Gear();
		this.place(gear2, 1, 3);

		Robot robot = new Robot();
		this.place(robot, 3, 0);

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col].toString() + "\t");
			}
			System.out.println();
		}
	}

	public void activate(){
	}

	public void place(Object o,int x,int y){
		grid[x][y] = o;
	}
	public Location getAdjacentLocation() {
		return null;
	}

}