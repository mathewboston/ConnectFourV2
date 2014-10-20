import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DrawGameBoard{  //extends Frame implements ActionListener{

	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;

	public DrawGameBoard() {
		
		prepareGUI();
	}
	
	 private void prepareGUI(){
	      mainFrame = new Frame("Java AWT Examples");
	      mainFrame.setSize(400,400);
	      mainFrame.setLayout(new GridLayout(3, 1));
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      headerLabel = new Label();
	      headerLabel.setAlignment(Label.CENTER);
	      statusLabel = new Label();        
	      statusLabel.setAlignment(Label.CENTER);
	      statusLabel.setSize(350,100);

	      controlPanel = new Panel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	   }
	 
	   private void showImageDemo(){
		      headerLabel.setText("Control in action: Image"); 

		      controlPanel.add(new ImageComponent("resources/java.jpg"));
		      mainFrame.setVisible(true);  
		   }
	   
	   class ImageComponent extends Component {

		      BufferedImage img;

		      public void paint(Graphics g) {
		         g.drawImage(img, 0, 0, null);
		      }

		      public ImageComponent(String path) {
		         try {
		            img = ImageIO.read(new File(path));
		         } catch (IOException e) {
		            e.printStackTrace();
		         }
		      }

		      public Dimension getPreferredSize() {
		         if (img == null) {
		            return new Dimension(100,100);
		         } else {
		            return new Dimension(img.getWidth(), img.getHeight());
		         }
		      }
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