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
		tokenLocation[2] = 0;
		return status;
	}
	
	private int checkHorizontalWinRight(Token[][] board, int[] tokenLocation, int tokenType){
		
		int[] tmp = tokenLocation;
		int x = tmp[0];
		int y = tmp[1];
		int status = tmp[2];
		if(x!=board[y].length-1 && board[y][x+1].getTokenType() == tokenType){
			if(status < 3){
				tmp[0] = x+1;
				tmp[2] = ++status;
				status = checkHorizontalWinRight(board, tmp, tokenType);
			}
		}
		tokenLocation[2] = 0;
		return status;
	}

	private boolean checkHorizonalWin(Token[][] board, int[] tokenLocation, int tokenType){
		
		return (checkHorizontalWinLeft(board,tokenLocation,tokenType) == 3 ? true : 
			checkHorizontalWinRight(board,tokenLocation,tokenType) ==3) ? true : false;
	}

	private int checkVerticalWinInt(Token[][] board, int[] tokenLocation, int tokenType){
		
		int[] tmp = tokenLocation;
		int x = tmp[0];
		int y = tmp[1];
		int status = tmp[2];
		if(y!=board.length-1 && board[y+1][x].getTokenType() == tokenType){
			if(status < 3){
				tmp[1] = y+1;
				tmp[2] = ++status;
				status = checkVerticalWinInt(board, tmp, tokenType);
			}
		}
		tokenLocation[2] = 0;
		return status;
	}
	
	private boolean checkVerticalWin(Token[][] board, int[] tokenLocation, int tokenType){
		
		return (checkVerticalWinInt(board, tokenLocation, tokenType) == 3) ? true:false;
	}
	
	private int checkDiagonalWinUpLeft(Token[][] board, int[] tokenLocation, int tokenType){

		int[] tmp = tokenLocation;
		int x = tmp[0];
		int y = tmp[1];
		int status = tmp[2];
		if((y!=0 && x!=0) && board[y-1][x-1].getTokenType() == tokenType){
			if(status < 3){
				tmp[0] = x-1;
				tmp[1] = y-1;
				tmp[2] = ++status;
				status = checkDiagonalWinUpLeft(board, tmp, tokenType);
			}
		}
		tokenLocation[2] = 0;
		return status;
	}
	
	private int checkDiagonalWinUpRight(Token[][] board, int[] tokenLocation, int tokenType){

		int[] tmp = tokenLocation;
		int x = tmp[0];
		int y = tmp[1];
		int status = tmp[2];
		if((y!=0 && x!=board[y].length-1) && board[y-1][x+1].getTokenType() == tokenType){
			if(status < 3){
				tmp[0] = x+1;
				tmp[1] = y-1;
				tmp[2] = ++status;
				status = checkDiagonalWinUpRight(board, tmp, tokenType);
			}
		}
		tokenLocation[2] = 0;
		return status;
	}
	
	private int checkDiagonalWinDownLeft(Token[][] board, int[] tokenLocation, int tokenType){

		int[] tmp = tokenLocation;
		int x = tmp[0];
		int y = tmp[1];
		int status = tmp[2];
		if((y!=0 && x!=0) && board[y-1][x-1].getTokenType() == tokenType){
			if(status < 3){
				tmp[0] = x+1;
				tmp[1] = y+1;
				tmp[2] = ++status;
				status = checkDiagonalWinDownLeft(board, tmp, tokenType);
			}
		}
		tokenLocation[2] = 0;
		return status;
	}
	
	private int checkDiagonalWinDownRight(Token[][] board, int[] tokenLocation, int tokenType){

		int[] tmp = tokenLocation;
		int x = tmp[0];
		int y = tmp[1];
		int status = tmp[2];
		if((y!=0 && x!=board[y].length-1) && board[y-1][x+1].getTokenType() == tokenType){
			if(status < 3){
				tmp[0] = x+1;
				tmp[1] = y-1;
				tmp[2] = ++status;
				status = checkDiagonalWinDownRight(board, tmp, tokenType);
			}
		}
		tokenLocation[2] = 0;
		return status;
	}
	
	private boolean checkDiagonalWinUp(Token[][] board, int[] tokenLocation, int tokenType){
		
		return (checkDiagonalWinUpLeft(board, tokenLocation, tokenType)==3) ? true : 
			(checkDiagonalWinUpRight(board, tokenLocation, tokenType)==3) ? true : false;
	}
	
	private boolean checkDiagonalWinDown(Token[][] board, int[] tokenLocation, int tokenType){
		
		return (checkDiagonalWinDownLeft(board, tokenLocation, tokenType)==3) ? true : 
			(checkDiagonalWinDownRight(board, tokenLocation, tokenType)==3) ? true : false;
	}


	private boolean checkDiagonalWin(Token[][] board, int[] tokenLocation, int tokenType){

		return checkDiagonalWinUp(board, tokenLocation, tokenType) ? true:
			checkDiagonalWinDown(board, tokenLocation, tokenType) ? true:false;
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

		if(checkTieStatus(board)){ 
			tie = true;
			return 1;
		}
		if(checkWinStatus(board, tokenLocation, tokenType)){
			win = true;
			return 2;
		}
		return 0;
	}

}
