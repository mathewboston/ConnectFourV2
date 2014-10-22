public class DrawGameBoard{

	private DrawGameBoardGUI gameGUI;

	public DrawGameBoard() {}
	
	public void displayGUI(ConnectFourGame gameData){
		
		gameGUI = new DrawGameBoardGUI(gameData);
		gameGUI.setVisible(true);
	}

	public void printAnalogGameBoardClean(Token[][] gameBoard){ //A clean board for new and reset games

		for(int y=0; y<gameBoard.length; y++){
			System.out.println();
			for(int x=0; x<gameBoard[y].length; x++)
				System.out.print("- -");
		}
		System.out.println();
		for(int y=0; y<=gameBoard.length; y++)
			System.out.print(" "+(y+1)+" ");
		System.out.println();
	}

	public void printAnalogGameBoard(Token[][] gameBoard){

		for(int y=0; y<gameBoard.length; y++){
			System.out.println();
			for(int x=0; x<gameBoard[y].length; x++)
				System.out.print("-"+gameBoard[y][x].getTokenCharType()+"-");
		}
		System.out.println();
		for(int x=0; x<gameBoard.length+1; x++)
			System.out.print(" "+(x+1)+" ");
		System.out.println();
	}
}