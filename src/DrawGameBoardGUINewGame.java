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
	int playerCounter;
	
	public DrawGameBoardGUINewGame(DrawGameBoardGUI n, ConnectFourGame gameData) {
		setBackground(Color.DARK_GRAY);
		setForeground(Color.DARK_GRAY);

		playerCounter = 0;
		textField = new JTextField();
		textField.setBackground(Color.DARK_GRAY);
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Karmatic Arcade", Font.PLAIN, 42));
		textField.setHorizontalAlignment(textField.CENTER);
		textField.setColumns(10);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/ConnectFour.png")));
		
		JLabel infoString = new JLabel("PLayer One Enter Your Name");
		infoString.setBackground(Color.BLACK);
		infoString.setForeground(new Color(192, 192, 192));
		infoString.setFont(new Font("Karmatic Arcade", Font.PLAIN, 32));
		
		JLabel PlayerToken = new JLabel("");
		PlayerToken.setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(561)
							.addComponent(PlayerToken))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(282)
							.addComponent(infoString))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE))
						.addComponent(lblNewLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNewLabel)
					.addGap(136)
					.addComponent(PlayerToken)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(infoString)
					.addGap(32)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(115, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		textField.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					++playerCounter;
					gameData.setPlayer(playerCounter, textField.getText());
					textField.setText("");
					PlayerToken.setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
					infoString.setText("PLayer Two Enter Your Name");
					if(playerCounter==2) n.gameGUI(gameData);
				}
			}
		});
	}
}
