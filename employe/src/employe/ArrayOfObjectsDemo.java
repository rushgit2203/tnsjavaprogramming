package employe;

public class ArrayOfObjectsDemo {
	public static void main(String[]args) {
		
		emp arr[]=new emp[2];
		arr[0]=new emp(101,"rushikesh",90000);
		arr[1]=new emp(102,"ravi",60000);
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary()+" ");
			
		}
	}

}
