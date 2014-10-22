import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AfterGamePanel extends JPanel {

	public AfterGamePanel(DrawGameBoardGUI n,ConnectFourGame gameData) {
		setBackground(Color.DARK_GRAY);
		this.setSize(1226, 614);
		
		JLabel newGame = new JLabel("");
		newGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				n.gameGUI(gameData);
			}
		});
		newGame.setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/NewGame.png")));
		
		JLabel Quit = new JLabel("");
		Quit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				System.exit(0);
			}
		});
		Quit.setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/Quit.png")));
		
		JLabel winStatus = new JLabel(gameData.getWinStatus());
		winStatus.setHorizontalAlignment(JLabel.CENTER);
		winStatus.setFont(new Font("Karmatic Arcade", Font.PLAIN, 80));
		winStatus.setForeground(Color.LIGHT_GRAY);
		winStatus.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(winStatus, GroupLayout.DEFAULT_SIZE, 1206, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(308)
							.addComponent(newGame))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(471)
							.addComponent(Quit)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(164)
					.addComponent(winStatus, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
					.addGap(82)
					.addComponent(newGame, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(Quit, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addGap(51))
		);
		setLayout(groupLayout);

	}
}
