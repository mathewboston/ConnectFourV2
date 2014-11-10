public class GameTimer extends Thread{

	private int minutes;
	private int seconds;
	
	public GameTimer(){
		
		this.minutes = 0;
		this.seconds = 0;
	}
	
	public int getGameMinutes(){
		
		return this.minutes;
	}
	
	public int getGameSeconds(){
		
		return this.seconds;
	}

	public void run() {
		
		//try {
			int setSeconds = (int)(System.nanoTime()/1000000000);
			for(;;){
				seconds = (int)(System.nanoTime()/1000000000)-setSeconds;
				if(seconds > 59){ 
					setSeconds = (int)(System.nanoTime()/1000000000);
					minutes++;
				}
			}
		//} catch (InterruptedException e) {}
	}
}