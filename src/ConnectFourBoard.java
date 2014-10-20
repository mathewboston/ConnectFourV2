
public class ConnectFourBoard {

	private int sizeX;
	private int sizeY;
	private Token[][] gameBoard;
	private GameBoardStatus gameBoardStatus;
	private DrawGameBoard drawAnalogGameBoard;

	public ConnectFourBoard() {

		sizeX = sizeY = 0;
		gameBoardStatus = new GameBoardStatus();
		drawAnalogGameBoard = new DrawGameBoard();
	}

	public ConnectFourBoard(int x, int y) {

		sizeX = x;
		sizeY = y;
		gameBoardStatus = new GameBoardStatus();
		drawAnalogGameBoard = new DrawGameBoard();
		gameBoard = new Token[sizeY][sizeX];
		setGameBoard();
	}
	
	public void setGameToken(Player turn){ //debug
		
		if(turn.getTokenType()==1){
			gameBoard[0][1] = turn.getToken();
			int[] temp = {1,0,0};
			System.out.println(getGameStatus(temp,turn.getTokenType()));
		}
		else{ gameBoard[1][2] = turn.getToken();
		gameBoard[1][3] = turn.getToken();
		gameBoard[1][4] = turn.getToken();
		gameBoard[1][5] = turn.getToken();
		int[] temp = {2,1,0};
		System.out.println(getGameStatus(temp,turn.getTokenType()));
		}
	}
	
	public int getGameStatus(int[] tokenLocation, int tokenType){
		
		return gameBoardStatus.getGameStatus(gameBoard, tokenLocation, tokenType);
	}
	
	public boolean getGameStatus(){
		
		return gameBoardStatus.getGameStatus();
	}
	
	public void printAnalogGameBoard(){
		
		drawAnalogGameBoard.printAnalogGameBoard(gameBoard);
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

		for(int y = 0; y < sizeY; y++){
			for(int x = 0; x < sizeX; x++){
				gameBoard[y][x] = new Token();
			}
		}
	}

	public Token[][] getGameBoard() {

		return gameBoard;
	}
}