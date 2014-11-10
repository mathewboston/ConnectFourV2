public class ConnectFourGame extends GameTimer{
	
	private Player player1;
	private Player player2;
	private int playerTurnBoard;
	private ConnectFourBoard gameBoard;
	public GameTimer gameTime;
	private GameStatusLogger gameLogger;
	//private UserInteraction ui; //Analog debu
	
	public ConnectFourGame() {

		player1 = new Player();
		player2 = new Player();
		gameBoard = new ConnectFourBoard();
		gameLogger = new GameStatusLogger();
		//ui = new UserInteraction();
	}
	
	public ConnectFourGame(int x, int y) throws Exception {

		playerTurnBoard = 1;
		player1 = new Player();
		player2 = new Player();
		player1.setTokenType(true);
		player2.setTokenType(false);
		gameLogger = new GameStatusLogger();
		gameBoard = new ConnectFourBoard(8,7);
		//ui = new UserInteraction();
		mainGame();
	}
	
	public void setGameForfeit() {

		gameBoard.setGameForfeit();
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
	
	public void newGameBoard(){
		
		gameBoard = new ConnectFourBoard(8,7);
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
	
	public String getWinStatus(){
		
		if(gameBoard.getGameTie()) return "It is a tie!";
		if(gameBoard.getGameWin()) return playerTurn(playerTurnBoard).getPlayer() + " Wins!";
		if(gameBoard.getGameForfeit()){
			playerTurn();
			return playerTurn(playerTurnBoard).getPlayer() + " Wins!";
		}
		return "";
	}
	
	public boolean setGameToken(int n){
		
		gameBoard.setGameToken(playerTurn(playerTurnBoard), n);
		gameLogger.logPlayerInteraction(playerTurn(playerTurnBoard).getPlayer(), 0, n);
		//gameBoard.printAnalogGameBoard(); //debug
		if(gameBoard.getGameStatus()) return true;
		return false;
	}
	
	private void mainGame() throws Exception{
	
		//gameLogger.start();
		gameBoard.loadGameBordGui(this);
	}
	
	public static void main(String args[]){
		
		try {
			new ConnectFourGame(8,7);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}