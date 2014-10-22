import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class DrawGameBoardGUIGame extends JPanel {

	public DrawGameBoardGUIGame(DrawGameBoardGUI n, ConnectFourGame gameData) {

		gameData.newGameBoard();
		setBackground(Color.DARK_GRAY);
		this.setSize(1226, 614);
		setLayout(new CardLayout(0, 0));

		JLayeredPane gameField = new JLayeredPane();
		add(gameField, "name_108839188420686");
		gameField.setLayout(null);

		JPanel Column0 = new JPanel();
		Column0.setOpaque(false);
		Column0.setBounds(313, 63, 59, 436);
		gameField.add(Column0);

		JPanel Column1 = new JPanel();
		Column1.setOpaque(false);
		Column1.setBounds(378, 63, 59, 436);
		gameField.add(Column1);

		JPanel Column2 = new JPanel();
		Column2.setOpaque(false);
		Column2.setBounds(445, 63, 57, 436);
		gameField.add(Column2);

		JPanel Column3 = new JPanel();
		Column3.setOpaque(false);
		Column3.setBounds(510, 63, 59, 436);
		gameField.add(Column3);

		JPanel Column4 = new JPanel();
		Column4.setOpaque(false);
		Column4.setBounds(579, 63, 59, 436);
		gameField.add(Column4);

		JPanel Column5 = new JPanel();
		Column5.setOpaque(false);
		Column5.setBounds(644, 63, 59, 436);
		gameField.add(Column5);

		JPanel Column6 = new JPanel();
		Column6.setOpaque(false);
		Column6.setBounds(711, 63, 57, 436);
		gameField.add(Column6);

		JPanel Column7 = new JPanel();
		Column7.setOpaque(false);
		Column7.setBounds(776, 63, 59, 436);
		gameField.add(Column7);

		JLabel Token00 = new JLabel("");
		Token00.setBounds(313, 436, 59, 55);
		gameField.add(Token00);	

		JLabel Token01 = new JLabel("");
		Token01.setBounds(378, 436, 59, 55);
		gameField.add(Token01);

		JLabel Token02 = new JLabel("");
		Token02.setBounds(445, 436, 59, 55);
		gameField.add(Token02);

		JLabel Token03 = new JLabel("");
		Token03.setBounds(510, 436, 59, 55);
		gameField.add(Token03);

		JLabel Token04 = new JLabel("");
		Token04.setBounds(579, 436, 59, 55);
		gameField.add(Token04);

		JLabel Token05 = new JLabel("");
		Token05.setBounds(644, 436, 59, 55);
		gameField.add(Token05);

		JLabel Token06 = new JLabel("");
		Token06.setBounds(711, 436, 59, 55);
		gameField.add(Token06);

		JLabel Token07 = new JLabel("");
		Token07.setBounds(780, 436, 59, 55);
		gameField.add(Token07);

		JLabel Token10 = new JLabel("");
		Token10.setBounds(313, 375, 59, 54);
		gameField.add(Token10);

		JLabel Token11 = new JLabel("");
		Token11.setBounds(378, 375, 59, 54);
		gameField.add(Token11);

		JLabel Token12 = new JLabel("");
		Token12.setBounds(445, 375, 59, 54);
		gameField.add(Token12);

		JLabel Token13 = new JLabel("");
		Token13.setBounds(510, 375, 59, 54);
		gameField.add(Token13);

		JLabel Token14 = new JLabel("");
		Token14.setBounds(579, 375, 59, 54);
		gameField.add(Token14);

		JLabel Token15 = new JLabel("");
		Token15.setBounds(644, 375, 59, 54);
		gameField.add(Token15);

		JLabel Token16 = new JLabel("");
		Token16.setBounds(711, 375, 59, 54);
		gameField.add(Token16);

		JLabel Token17 = new JLabel("");
		Token17.setBounds(780, 375, 59, 54);
		gameField.add(Token17);

		JLabel Token20 = new JLabel("");
		Token20.setBounds(313, 314, 59, 54);
		gameField.add(Token20);

		JLabel Token21 = new JLabel("");
		Token21.setBounds(378, 314, 59, 54);
		gameField.add(Token21);

		JLabel Token22 = new JLabel("");
		Token22.setBounds(445, 314, 59, 54);
		gameField.add(Token22);

		JLabel Token23 = new JLabel("");
		Token23.setBounds(510, 314, 59, 54);
		gameField.add(Token23);

		JLabel Token24 = new JLabel("");
		Token24.setBounds(579, 314, 59, 54);
		gameField.add(Token24);

		JLabel Token25 = new JLabel("");
		Token25.setBounds(644, 314, 59, 54);
		gameField.add(Token25);

		JLabel Token26 = new JLabel("");
		Token26.setBounds(711, 314, 59, 54);
		gameField.add(Token26);

		JLabel Token27 = new JLabel("");
		Token27.setBounds(780, 314, 59, 54);
		gameField.add(Token27);

		JLabel Token30 = new JLabel("");
		Token30.setBounds(313, 252, 59, 54);
		gameField.add(Token30);

		JLabel Token31 = new JLabel("");
		Token31.setBounds(378, 252, 59, 54);
		gameField.add(Token31);

		JLabel Token32 = new JLabel("");
		Token32.setBounds(445, 252, 59, 54);
		gameField.add(Token32);

		JLabel Token33 = new JLabel("");
		Token33.setBounds(510, 252, 59, 54);
		gameField.add(Token33);

		JLabel Token34 = new JLabel("");
		Token34.setBounds(579, 252, 59, 54);
		gameField.add(Token34);

		JLabel Token35 = new JLabel("");
		Token35.setBounds(644, 252, 59, 54);
		gameField.add(Token35);

		JLabel Token36 = new JLabel("");
		Token36.setBounds(711, 252, 59, 54);
		gameField.add(Token36);

		JLabel Token37 = new JLabel("");
		Token37.setBounds(780, 252, 59, 54);
		gameField.add(Token37);

		JLabel Token40 = new JLabel("");
		Token40.setBounds(313, 190, 59, 54);
		gameField.add(Token40);

		JLabel Token41 = new JLabel("");
		Token41.setBounds(378, 190, 59, 54);
		gameField.add(Token41);

		JLabel Token42 = new JLabel("");
		Token42.setBounds(445, 190, 59, 54);
		gameField.add(Token42);

		JLabel Token43 = new JLabel("");
		Token43.setBounds(510, 190, 59, 54);
		gameField.add(Token43);

		JLabel Token44 = new JLabel("");
		Token44.setBounds(579, 190, 59, 54);
		gameField.add(Token44);

		JLabel Token45 = new JLabel("");
		Token45.setBounds(644, 190, 59, 54);
		gameField.add(Token45);

		JLabel Token46 = new JLabel("");
		Token46.setBounds(711, 190, 59, 54);
		gameField.add(Token46);

		JLabel Token47 = new JLabel("");
		Token47.setBounds(780, 190, 59, 54);
		gameField.add(Token47);

		JLabel Token50 = new JLabel("");
		Token50.setBounds(313, 130, 59, 54);
		gameField.add(Token50);

		JLabel Token51 = new JLabel("");
		Token51.setBounds(378, 130, 59, 54);
		gameField.add(Token51);

		JLabel Token52 = new JLabel("");
		Token52.setBounds(445, 130, 59, 54);
		gameField.add(Token52);

		JLabel Token53 = new JLabel("");
		Token53.setBounds(510, 130, 59, 54);
		gameField.add(Token53);

		JLabel Token54 = new JLabel("");
		Token54.setBounds(579, 130, 59, 54);
		gameField.add(Token54);

		JLabel Token55 = new JLabel("");
		Token55.setBounds(644, 130, 59, 54);
		gameField.add(Token55);

		JLabel Token56 = new JLabel("");
		Token56.setBounds(711, 130, 59, 54);
		gameField.add(Token56);

		JLabel Token57 = new JLabel("");
		Token57.setBounds(780, 130, 59, 54);
		gameField.add(Token57);

		JLabel Token60 = new JLabel("");
		Token60.setBounds(313, 68, 59, 54);
		gameField.add(Token60);

		JLabel Token61 = new JLabel("");
		Token61.setBounds(378, 68, 59, 54);
		gameField.add(Token61);

		JLabel Token62 = new JLabel("");
		Token62.setBounds(445, 68, 59, 54);
		gameField.add(Token62);

		JLabel Token63 = new JLabel("");
		Token63.setBounds(510, 68, 59, 54);
		gameField.add(Token63);

		JLabel Token64 = new JLabel("");
		Token64.setBounds(579, 68, 59, 54);
		gameField.add(Token64);

		JLabel Token65 = new JLabel("");
		Token65.setBounds(644, 68, 59, 54);
		gameField.add(Token65);

		JLabel Token66 = new JLabel("");
		Token66.setBounds(711, 68, 59, 54);
		gameField.add(Token66);

		JLabel Token67 = new JLabel("");
		Token67.setBounds(780, 68, 59, 54);
		gameField.add(Token67);

		JLabel gameBoard = new JLabel("");
		gameBoard.setBounds(283, 48, 585, 465);
		gameBoard.setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/GameBoard.png")));
		gameField.add(gameBoard);

		JLabel Player1 = new JLabel(gameData.getPLayer(1));
		Player1.setHorizontalAlignment(JLabel.CENTER);
		Player1.setForeground(Color.BLACK);
		Player1.setBackground(Color.BLACK);
		Player1.setFont(new Font("Karmatic Arcade", Font.PLAIN, 30));
		Player1.setBounds(878, 111, 266, 73);
		gameField.add(Player1);

		JLabel Player2 = new JLabel(gameData.getPLayer(2));
		Player2.setHorizontalAlignment(JLabel.CENTER);
		Player2.setForeground(Color.BLACK);
		Player2.setBackground(Color.BLACK);
		Player2.setFont(new Font("Karmatic Arcade", Font.PLAIN, 30));
		Player2.setBounds(10, 111, 266, 73);
		gameField.add(Player2);

		JLabel yellowToken = new JLabel("");
		yellowToken.setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
		yellowToken.setBounds(117, 67, 59, 55);
		gameField.add(yellowToken);

		JLabel redToken = new JLabel("");
		redToken.setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
		redToken.setBounds(984, 67, 59, 55);
		gameField.add(redToken);
		
		JLabel forfeitButton = new JLabel("");
		forfeitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				gameData.setGameForfeit();
				WarningWindow dialog = new WarningWindow(n,gameData);
				dialog.setLocationRelativeTo(gameField);
				dialog.setVisible(true);
			}
		});
		
		forfeitButton.setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/Forgeit.png")));
		forfeitButton.setBounds(325, 524, 504, 93);
		gameField.add(forfeitButton);

		JLabel[][] Tokens = {

				{Token00,Token10,Token20,Token30,Token40,Token50,Token60},
				{Token01,Token11,Token21,Token31,Token41,Token51,Token61},
				{Token02,Token12,Token22,Token32,Token42,Token52,Token62},
				{Token03,Token13,Token23,Token33,Token43,Token53,Token63},
				{Token04,Token14,Token24,Token34,Token44,Token54,Token64},
				{Token05,Token15,Token25,Token35,Token45,Token55,Token65},
				{Token06,Token16,Token26,Token36,Token46,Token56,Token66},
				{Token07,Token17,Token27,Token37,Token47,Token57,Token67}
		};
		
		Column0.addMouseListener(new MouseAdapter() {

			int token = 0;
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(token<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[0][token].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[0][token].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(token<6)
					Tokens[0][token].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/BlankToken.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(token<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[0][token].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[0][token].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
					if(gameData.setGameToken(0)) afterGamePanel(n,gameData);
					if(token<=6)token++;
					gameData.playerTurn();
				}
			}
		});

		Column1.addMouseListener(new MouseAdapter() {

			int token1 = 0;
			@Override
			public void mouseEntered(MouseEvent arg0) {	
				if(token1<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[1][token1].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[1][token1].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(token1<6)
					Tokens[1][token1].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/BlankToken.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(token1<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[1][token1].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[1][token1].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
					if(gameData.setGameToken(1)) afterGamePanel(n,gameData);
					if(token1<=6)token1++;
					gameData.playerTurn();
				}
			}
		});

		Column2.addMouseListener(new MouseAdapter() {

			int token2 = 0;
			@Override
			public void mouseEntered(MouseEvent arg0) {	
				if(token2<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[2][token2].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[2][token2].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(token2<6)
					Tokens[2][token2].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/BlankToken.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(token2<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[2][token2].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[2][token2].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
					if(gameData.setGameToken(2)) afterGamePanel(n,gameData);
					if(token2<=6)token2++;
					gameData.playerTurn();
				}
			}
		});

		Column3.addMouseListener(new MouseAdapter() {

			int token3 = 0;
			@Override
			public void mouseEntered(MouseEvent arg0) {	
				if(token3<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[3][token3].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[3][token3].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(token3<6)
					Tokens[3][token3].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/BlankToken.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(token3<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[3][token3].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[3][token3].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
					if(gameData.setGameToken(3)) afterGamePanel(n,gameData);
					if(token3<=6)token3++;
					gameData.playerTurn();
				}
			}
		});

		Column4.addMouseListener(new MouseAdapter() {

			int token4 = 0;
			@Override
			public void mouseEntered(MouseEvent arg0) {	
				if(token4<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[4][token4].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[4][token4].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(token4<6)
					Tokens[4][token4].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/BlankToken.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(token4<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[4][token4].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[4][token4].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
					if(gameData.setGameToken(4)) afterGamePanel(n,gameData);
					if(token4<=6)token4++;
					gameData.playerTurn();
				}
			}
		});

		Column5.addMouseListener(new MouseAdapter() {

			int token5 = 0;
			@Override
			public void mouseEntered(MouseEvent arg0) {	
				if(token5<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[5][token5].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[5][token5].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(token5<6)
					Tokens[5][token5].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/BlankToken.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(token5<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[5][token5].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[5][token5].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
					if(gameData.setGameToken(5)) afterGamePanel(n,gameData);
					if(token5<=6)token5++;
					gameData.playerTurn();
				}
			}
		});

		Column6.addMouseListener(new MouseAdapter() {

			int token6 = 0;
			@Override
			public void mouseEntered(MouseEvent arg0) {	
				if(token6<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[6][token6].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[6][token6].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(token6<6)
					Tokens[6][token6].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/BlankToken.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(token6<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[6][token6].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[6][token6].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
					if(gameData.setGameToken(6)) afterGamePanel(n,gameData);
					if(token6<=6)token6++;
					gameData.playerTurn();
				}
			}
		});

		Column7.addMouseListener(new MouseAdapter() {

			int token7 = 0;
			@Override
			public void mouseEntered(MouseEvent arg0) {	
				if(token7<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[7][token7].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[7][token7].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(token7<6)
					Tokens[7][token7].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/BlankToken.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(token7<=6){
					if(gameData.getPLayerTurn() == 1)
						Tokens[7][token7].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/RedToken.png")));
					if(gameData.getPLayerTurn() == 2)
						Tokens[7][token7].setIcon(new ImageIcon(DrawGameBoardGUINewGame.class.getResource("/YellowToken.png")));
					if(gameData.setGameToken(7)) afterGamePanel(n,gameData);
					if(token7<=6)token7++;
					gameData.playerTurn();
				}
			}
		});
	}
	
	private void afterGamePanel(DrawGameBoardGUI n, ConnectFourGame gameData){
		
		AfterGamePanel GamePanel = new AfterGamePanel(n,gameData);
		n.setContentPane(GamePanel);
		GamePanel.setVisible(true);
	}
}
