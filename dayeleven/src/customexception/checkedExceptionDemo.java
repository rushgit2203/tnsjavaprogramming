package customexception;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class checkedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		FileInputStream f=new FileInputStream("");
		System.out.println("file found");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
	}

}
