import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DrawGameBoardGUI extends JFrame {

	private JPanel contentPane;
	public DrawGameBoardGUIGame gamePane;
	private DrawGameBoardGUINewGame newGame;

	public DrawGameBoardGUI(ConnectFourGame gameData) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1226, 614);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		newGame = new DrawGameBoardGUINewGame(this, gameData);
		newGame.setSize(1226, 614);
		gamePane = new DrawGameBoardGUIGame(gameData);
		gamePane.setSize(1226, 614);
		
		JLabel menu = new JLabel("");
		menu.setIcon(new ImageIcon("E:\\Users\\Matt\\Documents\\GitHub\\ConnectFourV2\\img\\ConnectFour.png"));
		
		JLabel newGameButton = new JLabel("");
		newGameButton.setIcon(new ImageIcon("E:\\Users\\Matt\\Documents\\GitHub\\ConnectFourV2\\img\\NewGame.png"));
		
		JLabel quitButton = new JLabel("");
		quitButton.setIcon(new ImageIcon("E:\\Users\\Matt\\Documents\\GitHub\\ConnectFourV2\\img\\Quit.png"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(menu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(289)
					.addComponent(newGameButton))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(450)
					.addComponent(quitButton))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(menu, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addGap(99)
					.addComponent(newGameButton)
					.addGap(18)
					.addComponent(quitButton)
					.addGap(127))
		);
		contentPane.setLayout(gl_contentPane);
		newGameButton.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				newGameGUI();
			}
		});
		quitButton.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				System.exit(0);
			}
		});
	}
	
	public String getHolderString(){
		
		return newGame.getHolder();
	}
	
	private void newGameGUI(){
		
		setContentPane(newGame);
		new GroupLayout(newGame);
	}
	
	public void gameGUI(ConnectFourGame gameData){
		//gamePane.buildGameBoardGUI(gameData);
		setContentPane(gamePane);
		new GroupLayout(gamePane);
	}
}
