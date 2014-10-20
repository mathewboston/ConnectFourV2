public class ConnectFourGame {
	
	private Player player1;
	private Player player2;
	private ConnectFourBoard gameBoard;
	private UserInteraction ui;

	public ConnectFourGame() {

		player1 = new Player();
		player2 = new Player();
		gameBoard = new ConnectFourBoard();
		ui = new UserInteraction();
	}
	
	public ConnectFourGame(int x, int y) {

		player1 = new Player();
		player2 = new Player();
		player1.setTokenType(true);
		player2.setTokenType(false);
		gameBoard = new ConnectFourBoard(8,7);
		ui = new UserInteraction();
		mainGame();
	}
	
	public void mainGame(){
		
		while(!gameBoard.getGameStatus()){
			gameBoard.setGameToken(player1);
			gameBoard.setGameToken(player2);
			break;
		}
		gameBoard.printAnalogGameBoard();
		if(gameBoard.getGameStatus()) System.out.println("Yay");
	}
	
	public static void main(String args[]){
		
		ConnectFourGame currentGame = new ConnectFourGame(8,7);
		//currentGame.gameBoard.printAnalogGameBoard();
	}
}