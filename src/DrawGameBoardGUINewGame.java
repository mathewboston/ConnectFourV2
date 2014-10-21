import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class DrawGameBoardGUINewGame extends JPanel {
	
	private JTextField textField;
	private String holder;
	int playerCounter;
	
	public String getHolder(){
		
		String tmp = holder;
		holder = "";
		return tmp;
	}
	
	public int getPlayerCouter(){
		
		return playerCounter;
	}
	
	public void playerCounter(){
		
		++playerCounter;
	}
	
	public DrawGameBoardGUINewGame(DrawGameBoardGUI n, ConnectFourGame gameData) {
		setBackground(Color.DARK_GRAY);
		setForeground(Color.DARK_GRAY);
		
		holder = "";
		playerCounter = 0;
		textField = new JTextField();
		textField.setBackground(Color.DARK_GRAY);
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Karmatic Arcade", Font.PLAIN, 22));
		textField.setHorizontalAlignment(textField.CENTER);
		textField.setColumns(10);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\Users\\Matt\\Documents\\GitHub\\ConnectFourV2\\img\\ConnectFour.png"));
		
		JLabel infoString = new JLabel("PLayer One Enter Your Name");
		infoString.setBackground(Color.BLACK);
		infoString.setForeground(new Color(192, 192, 192));
		infoString.setFont(new Font("Karmatic Arcade", Font.PLAIN, 32));
		
		JLabel PlayerToken = new JLabel("");
		PlayerToken.setIcon(new ImageIcon("E:\\Users\\Matt\\Documents\\GitHub\\ConnectFourV2\\img\\RedToken.png"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(255)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
					.addGap(267))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(4))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(272)
					.addComponent(infoString)
					.addContainerGap(292, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(564)
					.addComponent(PlayerToken)
					.addContainerGap(581, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(144)
					.addComponent(PlayerToken)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(infoString)
					.addGap(32)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
					.addGap(245))
		);
		setLayout(groupLayout);
		textField.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					playerCounter();
					gameData.setPlayer(playerCounter, textField.getText());
					textField.setText("");
					PlayerToken.setIcon(new ImageIcon("E:\\Users\\Matt\\Documents\\GitHub\\ConnectFourV2\\img\\YellowToken.png"));
					infoString.setText("PLayer Two Enter Your Name");
					if(playerCounter==2) n.gameGUI(gameData);
				}
			}
		});
	}
}
