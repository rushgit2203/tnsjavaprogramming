package customexception;
import java.util.*;
public class customExceptionExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to demonstrate user defined exception
//DRIVER CLASS
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your login credentials");
		String email=sc.nextLine();
		String password=sc.nextLine();
		try {
		if (email.equals("rushiborekar2000@gmail.com")&& password.equals("pass@123"))
		{
			System.out.println("Credentials matched");
			
		}
		
		
		else {
			throw new logincredential("invalid credentials");
		}
		}
		catch(logincredential e){
			
			System.out.println(e);
			
		
		}
		
	}

}
