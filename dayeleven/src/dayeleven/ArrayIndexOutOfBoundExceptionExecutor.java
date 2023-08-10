package dayeleven;
// program to demonstrate arrayindexoutofboundexception 
public class ArrayIndexOutOfBoundExceptionExecutor {
	
	static void print(int arr[])
	{
		try {
			System.out.println(arr[4]);
			
		}
		catch(Exception e) {
			System.out.println("ecxeption handled"+e);
			
		}
		
		finally {
			System.out.println("finally block is always executed");
		}
		
		System.out.println("any statement outside the block is always executed ");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3};
		print(arr);
		
	}

}
