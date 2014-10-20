public class Player {

	private String name;
	private Token tokenType; //true(1) is X, false(2) is O, 0 is blank
	//private LinkedList winLose; // A temporary score board for this player

	public Player() {

		name = "";
		tokenType = new Token();
	}

	public String getPlayer() {

		return name;
	}

	public void setPLayer(String n) {

		name = n;
	}
	
	public String getTokenImageType(){
		
		return tokenType.getTokenImageType();
	}

	public int getTokenType() {

		return tokenType.getTokenType();
	}
	
	public Token getToken(){
		
		return tokenType;
	}

	public void setTokenType(boolean n) {

		tokenType.setTokenType(n);
	}

	@Override
	public String toString(){

		return "This Player is " + this.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if(obj.hashCode() == this.hashCode()) return true;
		return false;				
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		final int a = name.length();
		int result = 1;
		result = prime * result + (int) (a ^ (a >>> 32));
		return result;
	}
}