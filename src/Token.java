public class Token {
	
	private boolean tokenOne;
	private boolean tokenTwo;

	public Token() {

		tokenOne = tokenTwo = false;
	}
	
	public void setTokenOne(boolean b) {
		
		if(this.tokenTwo) tokenTwo = false;
		tokenOne = b;
	}
	
	public boolean getTokenOne() {
		
		return tokenOne;
	}
	
	public void setTokenTwo(boolean b) {
		
		if(this.getTokenOne()) tokenOne = false;
		tokenTwo = b;
	}
	
	public boolean getTokenTwo() {
		
		return tokenTwo;
	}
	
	public void setTokenType(boolean b) {
		
		if(b) this.setTokenOne(b);
		if(!b) this.setTokenTwo(!b);
	}
	
	public int getTokenType() {
		
		if(this.getTokenOne()) return 1;
		if(this.getTokenTwo()) return 2;
		return 0;		
	}
	
	@Override
	public String toString(){
		
		return "This Token is " + this.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj.hashCode() == this.hashCode()) return true;
		return false;				
	}
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		final int a;
		if(this.tokenOne) a = 1;
		else a = 2;
		int result = 1;
	    result = prime * result + (int) (a ^ (a >>> 32));
		return result;
	}
}