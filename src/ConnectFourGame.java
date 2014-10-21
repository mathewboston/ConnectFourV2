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
		
		if(playerTurnBoard==2) --playerTurnBoard;
		else ++playerTurnBoard;
	}
	
	public Player playerTurn(int player){
		
		return (player==1) ? player1 : player2;
	}
	
	public int getPLayerTurn(){
		
		return playerTurnBoard;
	}
	
	public void setPlayer(int n, String s){
		
		if(n==1) player1.setPLayer(s);
		if(n==2) player2.setPLayer(s);
	}
	
	public String getPLayer(int n){
		
		if(n==1) return player1.getPlayer();
		if(n==2) return player2.getPlayer();
		return "NOPLAYERERROR";
	}
	
	public boolean setGameToken(int n){
		
		gameBoard.setGameToken(playerTurn(playerTurnBoard), n);
		gameBoard.printAnalogGameBoard(); //debug
		if(gameBoard.getGameStatus()) return true;
		return false;
	}
	
//	public void guiMainGame(){
//		
//		while(!gameBoard.getGameStatus()){
//			if(gameBoard.setGameToken(playerTurn(playerTurnBoard), ui.askUser(1, 8)-1) == -1);
//				//System.out.println("Column full"); //debug
//			//playerTurn();
//			//gameBoard.printAnalogGameBoard(); //debug
//			//if(gameBoard.getGameStatus()) System.out.println("Yay"); //debug			
//		}		
//	}
	
	private void mainGame(){
		
		//gameBoard.printAnalogGameBoardClean(); //debug
		gameBoard.loadGameBordGui(this);
		//player1.setPLayer(gameBoard.grabHolderString());
	}
	
	public static void main(String args[]){
		
		/*ConnectFourGame currentGame =*/ new ConnectFourGame(8,7);
	}
}