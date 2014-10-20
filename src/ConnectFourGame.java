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
			if(gameBoard.setGameToken(player1, ui.askUser(1, 8)-1) == -1){
				System.out.println("Column full");
			}
			gameBoard.printAnalogGameBoard();
			if(gameBoard.setGameToken(player2, ui.askUser(1, 8)-1) == -1){
				System.out.println("Column full");
			}
			gameBoard.printAnalogGameBoard();
			//gameBoard.setGameToken(player2);
			if(gameBoard.getGameStatus()) System.out.println("Yay");			
		}		
	}
	
	public static void main(String args[]){
		
		ConnectFourGame currentGame = new ConnectFourGame(8,7);
		//currentGame.gameBoard.printAnalogGameBoard();
	}
}