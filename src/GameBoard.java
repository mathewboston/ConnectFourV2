import java.util.Random;

public class GameBoard{

	private static UserInteraction ui;
	private static Random r;
	private static int[][] gameBoard;
	private static int playerTurn;
	private static int gameStatus;
	private static int row;
	private static int column;
	private static String player1;
	private static String player2;
	private static boolean reset;
	private static boolean quit;

	public static void gamePlay(int turn){

		int token = 0;
		int x = 0;
		System.out.println("\n"+playerName(turn)+"("+playerToken(turn)+")"+", please place a token");
		token = ui.askUser(1, 8, 'R', 'Q')-1;
		if(token == 8){ 
			reset = true;
			return;
		}
		if(token == 9){ 
			quit = true;
			return;
		}
		for(int i=gameBoard.length-1; i>=0; i--){
			if(gameBoard[i][token]==0){ 
				gameBoard[i][token] = turn;
				x=i;
				break;
			}
			if(i==0){
				printBoard();
				System.out.println("Column is full, choose another");
				gamePlay(turn);
			}
		}
		printBoard();
		gameStatus = connectFour(turn, x, token);
	}

	public static int connectFour(int token, int x, int y){ //scans the surrounding area of the most recent token. and/or statements prevent false positives
		int status = 0;
		int direction = 0;
		if(y!=0){
			if(gameBoard[x][y-1]==token){
				direction = 1;
				status = connectFour(token,x,y-1,direction,1); //left
			}
		}
		if(x!=row-1){
			if(gameBoard[x+1][y]==token && status<3 && direction==0){
				direction = 2;
				status += connectFour(token,x+1,y,direction,1); //down
			}
		}
		if(y!=column-1){
			if(gameBoard[x][y+1]==token && status<3 && (direction==0 || direction==1)){
				direction = 3;
				status += connectFour(token,x,y+1,direction,1); //right
			}
		}
		if(status<3) status = direction = 0; //resets counter
		if(y!=0 && x!=row-1){
			if(gameBoard[x+1][y-1]==token && status<3 && direction==0){
				direction = 4;
				status += connectFour(token,x+1,y-1,direction,1); //downleft
			}
		}
		if(x!=row-1 && y!=column-1){
			if(gameBoard[x+1][y+1]==token && status<3 && direction==0){
				direction = 5;
				status += connectFour(token,x+1,y+1,direction,1); //downright
			}
		}
		if(y!=0 && x!=0){
			if(gameBoard[x-1][y-1]==token && status<3 && (direction==0 || direction==5)){
				direction = 6;
				status += connectFour(token,x-1,y-1,direction,1); //upleft
			}
		}
		if(x!=0 && y!=column-1){
			if(gameBoard[x-1][y+1]==token && status<3 && (direction==0 || direction==4)){
				direction = 7;
				status += connectFour(token,x-1,y+1,direction,1); //upright
			}
		}
		if(status == 3) return token;
		return 0;
	}

	public static int connectFour(int token, int x, int y, int direction, int count){ //scans the surrounding area of the most recent token, sticking to one direction

		int status = count;
		switch(direction){
		case 1: if(y!=0) 
			if(gameBoard[x][y-1]==token) status = connectFour(token,x,y-1,1,count+=1); //left
		break;
		case 2: if(x!=row-1) 
			if(gameBoard[x+1][y]==token) status = connectFour(token,x+1,y,2,count+=1); //down
		break;
		case 3: if(y!=column-1) 
			if(gameBoard[x][y+1]==token) status = connectFour(token,x,y+1,3,count+=1); //right
		break;
		case 4: if(y!=0 && x!=row-1)
			if(gameBoard[x+1][y-1]==token) status = connectFour(token,x+1,y-1,4,count+=1); //downleft
		break;
		case 5: if(x!=row-1 && y!=column-1)
			if(gameBoard[x+1][y+1]==token) status = connectFour(token,x+1,y+1,5,count+=1); //downright
		break;
		case 6: if(y!=0 && x!=0)
			if(gameBoard[x-1][y-1]==token) status = connectFour(token,x-1,y-1,6,count+=1); //upleft
		break;
		case 7: if(x!=0 && y!=column-1)
			if(gameBoard[x-1][y+1]==token) status = connectFour(token,x-1,y+1,7,count+=1); //upright
		break;
		}
		return status;
	}

	public static void endGame(int s){

		if(s==0) System.out.println("\nIt is a tie!");
		if(s==1) System.out.println("\n"+player1+"("+playerToken(s)+")"+" wins!");
		if(s==2) System.out.println("\n"+player2+"("+playerToken(s)+")"+" wins!");
	}

//	public static boolean fullBoard(){
//
//		for(int i=0;i<=gameBoard.length; i++)
//			if(gameBoard[0][i]==0) return false;
//		return true;
//	}

	public static void playerTurn(){

		if(playerTurn == 0) playerTurn = r.nextInt(1)+1;
		if(playerTurn == 1)	gamePlay(playerTurn++);
		else gamePlay(playerTurn--);
	}

	public static char playerToken(int t){

		if(t==0) return ' ';
		if(t==1) return 'X';
		return 'O';
	}

	public static String playerName(int t){

		if(t==1) return player1;
		return player2;
	}

//	public static void initializeBoard(int[][] a){
//
//		for(int i=0; i<a.length; i++)
//			for(int j=0; j<a[i].length; j++)
//				a[i][j] = 0;
//	}

//	public static void printBoard(){
//
//		for(int i=0; i<gameBoard.length; i++){
//			System.out.println();
//			for(int j=0; j<gameBoard[i].length; j++)
//				System.out.print("-"+playerToken(gameBoard[i][j])+"-");
//		}
//		System.out.println();
//		for(int i=0; i<=gameBoard.length; i++)
//			System.out.print(" "+(i+1)+" ");
//		System.out.println();
//	}
//
//	public static void printBoardClean(){ //A clean board for new and reset games
//
//		for(int i=0; i<gameBoard.length; i++){
//			System.out.println();
//			for(int j=0; j<gameBoard[i].length; j++)
//				System.out.print("- -");
//		}
//		System.out.println();
//		for(int i=0; i<=gameBoard.length; i++)
//			System.out.print(" "+(i+1)+" ");
//		System.out.println();
//	}

	public static void main(String args[]){

		row = 7;
		column = 8;
		ui = new UserInteraction();
		r = new Random();
		System.out.println("\nWelcome to connect four! Entering Y starts a new game.\nEnter R at anytime to reset the game.\nEntering Q at anytime will quit the game\n");
		System.out.println("New game? (Y/n)");
		boolean gameLoop = ui.askUser('Y', 'N');
		System.out.println("Player 1, enter your name");
		player1 = ui.askUserString();
		System.out.println("Player 2, enter your name");
		player2 = ui.askUserString();
		while(gameLoop){
			gameStatus = 0;
			reset = false;
			quit = false;
			playerTurn = 0;
			gameBoard = new int[row][column];
			initializeBoard(gameBoard);
			printBoardClean();
			while(!fullBoard() && gameStatus == 0){
				playerTurn();
				if(gameStatus!=0) break;
				if(reset){
					reset = false;
					gameBoard = new int[row][column];
					initializeBoard(gameBoard);
					printBoardClean();
				}
				if(quit){
					System.out.println("Goodbye!");
					System.exit(0);
				}
			}
			endGame(gameStatus);
			System.out.println("New game? (Y/n)");
			gameLoop = ui.askUser('Y', 'N');
			System.out.println("Goodbye!");
		}
	}
}