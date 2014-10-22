import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class DrawGameBoardGUI extends JFrame {

	private JPanel contentPane;
	public DrawGameBoardGUIGame gamePane;
	private DrawGameBoardGUINewGame newGame;

	public DrawGameBoardGUI(ConnectFourGame gameData) {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(DrawGameBoardGUI.class.getResource("/RedToken.png")));
		setTitle("Connect Four");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1226, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		newGame = new DrawGameBoardGUINewGame(this, gameData);
		newGame.setSize(1226, 614);
		
		JLabel menu = new JLabel("");
		menu.setIcon(new ImageIcon(DrawGameBoardGUI.class.getResource("/ConnectFour.png")));
		
		JLabel newGameButton = new JLabel("");
		newGameButton.setIcon(new ImageIcon(DrawGameBoardGUI.class.getResource("/NewGame.png")));
		
		JLabel quitButton = new JLabel("");
		quitButton.setIcon(new ImageIcon(DrawGameBoardGUI.class.getResource("/Quit.png")));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(289)
							.addComponent(newGameButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(450)
							.addComponent(quitButton))
						.addComponent(menu, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(menu, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
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
	
	private void newGameGUI(){
		
		setContentPane(newGame);
		new GroupLayout(newGame);
	}
	
	public void gameGUI(ConnectFourGame gameData){
		
		gamePane = new DrawGameBoardGUIGame(this,gameData);
		gamePane.setSize(1226, 614);
		setContentPane(gamePane);
		new GroupLayout(gamePane);
	}
}
