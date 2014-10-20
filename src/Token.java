public class Token {

	private boolean tokenOne;
	private boolean tokenTwo;

	public Token() {

		tokenOne = tokenTwo = false;
	}

	public void setTokenOne(boolean b) {

		if(tokenTwo) tokenTwo = false;
		tokenOne = b;
	}

	public boolean getTokenOne() {

		return tokenOne;
	}

	public void setTokenTwo(boolean b) {

		if(getTokenOne()) tokenOne = false;
		tokenTwo = b;
	}

	public boolean getTokenTwo() {

		return tokenTwo;
	}

	public void setTokenType(boolean b) {

		if(b) setTokenOne(b);
		if(!b) setTokenTwo(!b);
	}

	public int getTokenType() {

		if(getTokenOne()) return 1;
		if(getTokenTwo()) return 2;
		return 0;		
	}
	
	public char getTokenCharType() {

		if(getTokenOne()) return 'X';
		if(getTokenTwo()) return 'O';
		return ' ';		
	}

	@Override
	public String toString(){

		return "This token is "+this.hashCode();
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