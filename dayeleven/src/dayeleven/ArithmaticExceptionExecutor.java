package dayeleven;
import java.util.*;
public class ArithmaticExceptionExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		//we cannot 
		//try block contains exceptional code
		
		try {
			
			
			System.out.println(x/y);
		}
		//catch block is used to handle the exception
		catch(Exception e)
		{
			System.out .println("exception handled"+e);
			
		}
	}

}
