package dayeleven;

import java.io.IOException;
//program to demonstrate throw 
public class throwExecutor {
	// throw keyword is used to declare an exception
	static void  IsEligible(int age ,int weight)throws IOException {
		
		if(age>18 && weight >50)
		{
			System.out.println("eleigible to donate blood");
			
		}
		
		else {
			//throw keyword is used to throw an exception explicitly
			throw new IOException ("criteria not fullfilled");
	}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//throwExecutor t=new throwExecutor();

		IsEligible(21,60);
	}
}

