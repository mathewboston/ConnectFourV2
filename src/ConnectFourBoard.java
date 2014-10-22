
public class ConnectFourBoard {

	private int sizeX;
	private int sizeY;
	private Token[][] gameBoard;
	private int[] position;
	private GameBoardStatus gameBoardStatus;
	private DrawGameBoard drawGameBoard;

	public ConnectFourBoard() {

		sizeX = sizeY = 0;
		gameBoardStatus = new GameBoardStatus();
		drawGameBoard = new DrawGameBoard();
	}

	public ConnectFourBoard(int x, int y) {

		sizeX = x;
		sizeY = y;
		gameBoardStatus = new GameBoardStatus();
		drawGameBoard = new DrawGameBoard();
		gameBoard = new Token[sizeY][sizeX];
		position = new int[sizeX];
		setGameBoard();
	}
	
	public boolean getGameForfeit() {

		return gameBoardStatus.getGameForfeit();
	}
	
	public boolean getGameWin() {

		return gameBoardStatus.getGameWin();
	}
	
	public boolean getGameTie() {

		return gameBoardStatus.getGameTie();
	}
	
	public void setGameForfeit() {

		gameBoardStatus.setGameForfeit();
	}

	public int setGameToken(Player turn, int placement){ //debug

		int input = position[placement];
		if(input == -1) return-1;
		gameBoard[input][placement] = turn.getToken();
		int[] temp = {placement,input,0};
		int tmp = getGameStatus(temp,turn.getTokenType());
		position[placement] = --position[placement];
		return (tmp == 0) ? 0: (tmp == 1) ? 1:2;
	}

	public int getGameStatus(int[] tokenLocation, int tokenType){

		return gameBoardStatus.getGameStatus(gameBoard, tokenLocation, tokenType);
	}

	public boolean getGameStatus(){

		return gameBoardStatus.getGameStatus();
	}
	
	public void loadGameBordGui(ConnectFourGame gameData) throws Exception{
		
		drawGameBoard.displayGUI(gameData);
	}

	public void printAnalogGameBoard(){

		drawGameBoard.printAnalogGameBoard(gameBoard);
	}
	
	public void printAnalogGameBoardClean(){

		drawGameBoard.printAnalogGameBoardClean(gameBoard);
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

		for(int y = 0; y < sizeY; y++)
			for(int x = 0; x < sizeX; x++){
				gameBoard[y][x] = new Token();
				position[x] = sizeY-1;
			}
	}

	public Token[][] getGameBoard() {

		return gameBoard;
	}
}