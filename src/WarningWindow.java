import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;


public class WarningWindow extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public WarningWindow(DrawGameBoardGUI n,ConnectFourGame gameData) {
		setBounds(100, 100, 452, 137);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JTextPane txtpnAreYouSure = new JTextPane();
			txtpnAreYouSure.setEditable(false);
			txtpnAreYouSure.setForeground(Color.BLACK);
			Font KA = new Font("Karmatic Arcade", Font.PLAIN, 32);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(KA);
			txtpnAreYouSure.setFont(KA);
			txtpnAreYouSure.setText("Are you Sure?");
			txtpnAreYouSure.setBackground(Color.DARK_GRAY);
			contentPanel.add(txtpnAreYouSure);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.DARK_GRAY);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setForeground(Color.BLACK);
				okButton.setFont(new Font("Karmatic Arcade", Font.PLAIN, 11));
				okButton.setBackground(Color.DARK_GRAY);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addMouseListener(new MouseAdapter() {

					@Override
					public void mousePressed(MouseEvent e) {
						AfterGamePanel GamePanel = new AfterGamePanel(n,gameData);
						n.setContentPane(GamePanel);
						GamePanel.setVisible(true);
						dispose();
					}
				});
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(Color.BLACK);
				cancelButton.setFont(new Font("Karmatic Arcade", Font.PLAIN, 11));
				cancelButton.setBackground(Color.DARK_GRAY);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addMouseListener(new MouseAdapter() {

					@Override
					public void mousePressed(MouseEvent e) {
						dispose();
					}
				});
			}
		}
	}

}
