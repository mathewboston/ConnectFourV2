public class ConnectFourGame {
	
	private Player player1;
	private Player player2;
	private int playerTurnBoard;
	private ConnectFourBoard gameBoard;
	private UserInteraction ui;

	public ConnectFourGame() {

		player1 = new Player();
		player2 = new Player();
		gameBoard = new ConnectFourBoard();
		ui = new UserInteraction();
	}
	
	public ConnectFourGame(int x, int y) {

		playerTurnBoard = 1;
		player1 = new Player();
		player2 = new Player();
		player1.setTokenType(true);
		player2.setTokenType(false);
		gameBoard = new ConnectFourBoard(8,7);
		ui = new UserInteraction();
		mainGame();
	}
	
	public void playerTurn(){
		
		if(playerTurnBoard==1) --playerTurnBoard;
		else ++playerTurnBoard;
	}
	
	public Player playerTurn(int player){
		
		return (player==1) ? player1 : player2;
	}	
	
	public void mainGame(){
		
		gameBoard.printAnalogGameBoardClean();
		while(!gameBoard.getGameStatus()){
			if(gameBoard.setGameToken(playerTurn(playerTurnBoard), ui.askUser(1, 8)-1) == -1)
				System.out.println("Column full");
			playerTurn();
			gameBoard.printAnalogGameBoard(); //debug
			if(gameBoard.getGameStatus()) System.out.println("Yay"); //debug			
		}		
	}
	
	public static void main(String args[]){
		
		/*ConnectFourGame currentGame =*/ new ConnectFourGame(8,7);
	}
}