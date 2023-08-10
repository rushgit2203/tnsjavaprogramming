package customexception;



//program to demnstrate user defined exception

public class logincredential extends Exception {
	// private data member
	private String str;
	//parameterised constructor 
	public logincredential (String str) {
		super ();
		this.str=str;
		
	}

		//getters and setters

	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	public String toString() {
		
		return str;
	}
	
	
}
