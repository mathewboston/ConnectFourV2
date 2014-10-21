import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawGameBoard{  //extends Frame implements ActionListener{

	private JFrame mainFrame;
	private JPanel gameFrame;
	private JPanel mainTitle;
	private JPanel newGameMenu;
	private JPanel QuitMenu;

	public DrawGameBoard() {

		prepareGUI();
	}

	private void prepareGUI(){
		
		int width = 1200;
		int height = 900;
		mainFrame = new JFrame("Connect Four");
		mainFrame.setSize(width, height);
		mainFrame.setLayout(new GridLayout(2, 1));	
		mainFrame.setBackground(Color.darkGray);
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}        
		});		
		mainTitle = new JPanel();
		mainTitle.setLayout(new FlowLayout());
		mainTitle.setSize(width, height);
		gameFrame = new JPanel();
		gameFrame.setLayout(new GridLayout(5,1));
		gameFrame.setSize(width, height);
		newGameMenu = new JPanel();
		newGameMenu.setLayout(new FlowLayout());
		newGameMenu.setSize(20, 20);
		newGameMenu.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				mainFrame.setBackground(Color.BLUE);
			}
			public void mouseEntered(MouseEvent e){
				System.out.println("dkdk");
			}
		});
		QuitMenu = new JPanel();
		QuitMenu.setLayout(new FlowLayout());
		QuitMenu.setSize(20, 20);
		QuitMenu.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				mainFrame.setBackground(Color.white);
			}
			public void mouseEntered(MouseEvent e){
				System.out.println("klllk");
			}
		});
		mainFrame.add(mainTitle);
		mainFrame.add(gameFrame);
		gameFrame.add(newGameMenu);
		gameFrame.add(new JPanel());
		gameFrame.add(QuitMenu);
		mainFrame.setVisible(true);
	}
	
	public void buildGameBoardGui(){
		
		mainTitle.add(new ImageComponent("img/ConnectFour.png"));
		newGameMenu.add(new ImageComponent("img/NewGame.png"));
		QuitMenu.add(new ImageComponent("img/Quit.png"));
		mainFrame.setVisible(true);
		gameFrame.setVisible(true);
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