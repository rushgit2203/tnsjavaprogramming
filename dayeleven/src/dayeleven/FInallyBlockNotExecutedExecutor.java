package dayeleven;
import java.util.*;
public class FInallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
	
		int x=sc.nextInt();
		int y=sc.nextInt();
		//we cannot 
		//try block contains exceptional code
		
		try {
			
			
			System.out.println(x/y);
			
			System.exit(0);	
			//when we use ... the finally block does not get executed
			
		}
		//catch block is used to handle the exception
		// we can use multiple catch blocks using pipe "|" put predefined exception as parameter
		catch(Exception e)
		{
			System.out .println("exception handled"+e);
			//when we use ... the finally block does not get executed
			
		}
		
		finally {
			
			//when finally block contains an exeption then finally block does nor=t get executed
			System.out.println(4/0);

			System.out.println("finally block is always executed");
			
		}
				

	}

}
