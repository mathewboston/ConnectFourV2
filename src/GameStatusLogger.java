import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class GameStatusLogger extends Thread{

	private PrintWriter gameLogger;
	private Date systemDate;
	
	public GameStatusLogger() {

		this.systemDate = new Date();
		try {
			this.gameLogger = new PrintWriter(new BufferedWriter(new FileWriter(systemDate.getTime()+" -gamelog.txt")));
			this.gameLogger.write("TESTTT");
		} catch (IOException e) {
			System.out.println("Could not create file");
		}finally{
			this.gameLogger.close();
		}
	}
	
	public void logPlayerInteraction(String player, int timeStamp, int loc){
		
		this.gameLogger.write(timeStamp+"-"+player+" placed a token in column "+loc+".");
		this.gameLogger.println(timeStamp+"-"+player+" placed a token in column "+loc+".");
	}
	
	public void logPlayerInteraction(String player, int timeStamp){
		
		this.gameLogger.write(timeStamp+"-"+player+" won the game!");
	}
	
	public void logPlayerInteraction(int timeStamp){
		
		this.gameLogger.write(timeStamp+"- game was tied.");
	}
	
	public void logIdleGame(int timeStamp){
		
		this.gameLogger.write(timeStamp+"- game idle.");
	}
	
	public void run(){
		
		try {
			this.gameLogger = new PrintWriter(new BufferedWriter(new FileWriter(systemDate.getTime()+" -gamelog.txt")));
			this.gameLogger.write("TESTTT");
		} catch (IOException e) {
			System.out.println("Could not create file");
		}finally{
			this.gameLogger.close();
		}
	}
}