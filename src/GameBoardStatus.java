public class GameBoardStatus {

	private boolean tie;
	private boolean win;

	public GameBoardStatus() {

		tie = win = false;
	}

	//	public void setGameTie() {
	//		
	//		if(tie) tie = false;
	//		else tie = true;
	//	}

	public boolean getGameTie() {

		return tie;
	}

	//	public void setGameWin() {
	//		
	//		if(win) win = false;
	//		else win = true;
	//	}

	public boolean getGameWin() {

		return win;
	}
	
	public boolean getGameStatus(){
		
		if(getGameWin() || getGameTie()) return true;
		return false;
	}
	
	private int checkHorizontalWinLeft(Token[][] board, int[] tokenLocation, int tokenType){
		
		int[] tmp = tokenLocation;
		int x = tmp[0];
		int y = tmp[1];
		int status = tmp[2];
		if(x != 0 && board[y][x-1].getTokenType() == tokenType){
			if(status < 3){
				tmp[0] = x-1;
				tmp[2] = ++status;
				status = checkHorizontalWinLeft(board, tmp, tokenType);
			}
		}
		return status;
	}
	
	private int checkHorizontalWinRight(Token[][] board, int[] tokenLocation, int tokenType){
		
		int[] tmp = tokenLocation;
		int x = tmp[0];
		int y = tmp[1];
		int status = tmp[2];
		if(x!=board[y].length && board[y][x+1].getTokenType() == tokenType){
			if(status < 3){
				tmp[0] = x+1;
				tmp[2] = ++status;
				status = checkHorizontalWinRight(board, tmp, tokenType);
			}
		}
		return status;
	}

	private boolean checkHorizonalWin(Token[][] board, int[] tokenLocation, int tokenType){
		
		if(checkHorizontalWinLeft(board,tokenLocation,tokenType) == 3 || checkHorizontalWinRight(board,tokenLocation,tokenType) ==3) return true;
		return false;
	}

	private boolean checkVerticalWin(Token[][] board, int[] tokenLocation, int tokenType){

		return false;
	}

	private boolean checkDiagonalWin(Token[][] board, int[] tokenLocation, int tokenType){

		return false;
	}

	private boolean checkTieStatus(Token[][] board){ //full game board

		for(int x=0;x<=board.length; x++)
			if(board[0][x].getTokenType() == 0) return false;
		return true;
	}

	private boolean checkWinStatus(Token[][] board, int[] tokenLocation, int tokenType){

		if(checkHorizonalWin(board, tokenLocation, tokenType)) return true;
		if(checkVerticalWin(board, tokenLocation, tokenType)) return true;
		if(checkDiagonalWin(board, tokenLocation, tokenType)) return true;
		return false;
	}

	public int getGameStatus(Token[][] board, int[] tokenLocation, int tokenType) {

		if(checkTieStatus(board)) return 1;
		if(checkWinStatus(board, tokenLocation, tokenType)) return 2;
		return 0;
	}

}
