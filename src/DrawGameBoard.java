//import java.awt.Button;
//import java.awt.FlowLayout;
//import java.awt.Frame;
//import java.awt.Label;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class DrawGameBoard{  //extends Frame implements ActionListener{

	//	private Label lblCount;    // Declare component Label
	//	private TextField tfCount; // Declare component TextField
	//	private Button btnCount;   // Declare component Button
	//	private int count = 0;     // Counter's value

	public DrawGameBoard() {
	//		// TODO Auto-generated constructor stub
	//		setLayout(new FlowLayout());
	//		// "super" Frame sets its layout to FlowLayout, which arranges the components
	//		//  from left-to-right, and flow to next row from top-to-bottom.
	//
	//		lblCount = new Label("Counter");  // construct Label
	//		add(lblCount);                    // "super" Frame adds Label
	//
	//		tfCount = new TextField("0", 10); // construct TextField
	//		tfCount.setEditable(false);       // set to read-only
	//		add(tfCount);                     // "super" Frame adds tfCount
	//
	//		btnCount = new Button("Count");   // construct Button
	//		add(btnCount);                    // "super" Frame adds Button
	//
	//		btnCount.addActionListener(this);
	//		// Clicking Button source fires ActionEvent
	//		// btnCount registers this instance as ActionEvent listener
	//
	//		setTitle("AWT Counter");  // "super" Frame sets title
	//		setSize(250, 100);        // "super" Frame sets initial window size
	//
	//		// System.out.println(this);
	//		// System.out.println(lblCount);
	//		// System.out.println(tfCount);
	//		// System.out.println(btnCount);
	//
	//		setVisible(true);         // "super" Frame shows
	//
	//		// System.out.println(this);
	//		// System.out.println(lblCount);
	//		// System.out.println(tfCount);
	//		// System.out.println(btnCount);
	//	}
	//
	//	/** The entry main() method */
	//	public static void main(String[] args) {
	//		// Invoke the constructor to setup the GUI, by allocating an instance
	//		new DrawGameBoard();
	//	}
	//
	//	/** ActionEvent handler - Called back upon button-click. */
	//	@Override
	//	public void actionPerformed(ActionEvent evt) {
	//		++count; // increase the counter value
	//		// Display the counter value on the TextField tfCount
	//		tfCount.setText(count + ""); // convert int to String
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