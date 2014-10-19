
public class ConnectFourBoard {

	private int sizeX;
	private int sizeY;
	private int[][] gameBoard;
	
	public ConnectFourBoard() {
		
		sizeX = sizeY = 0;
	}
	
	public ConnectFourBoard(int x, int y) {
		
		sizeX = x;
		sizeY = y;
	}
	
	public int getSizeX() {
		
		return sizeX;
	}
	
	public void setSizeX(int x) {
		
		sizeX = x;
	}
	
	public int getSizeY() {
		
		return sizeY;
	}
	
	public void setSizeY(int y) {
		
		sizeY = y;
	}
	
	public void setGameBoard(){
		
		for(int x = 0; x<=sizeX; x++)
			for(int y = 0; y <+ sizeY; y++)
				gameBoard[x][y] = 0;
	}
	
	public int[][] getGameBoard() {
		
		return gameBoard;
	}
}