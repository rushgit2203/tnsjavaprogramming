/**
 * 
 */
package multiDimensionalArray;
import java.util.*;
/**
 * 
 */
public class jacggedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// fixed outer array size but variable inner array size 
		// we do not set inner array size
		int arr [][]=new int [2][];
		// inner size 3 members
		// outside size 2 members
		arr[0]=new int[3];
		arr[1]=new int[2];
		
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
				arr [i][j]=sc.nextInt();
			}
		}
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
				System.out.println(arr[i][j]);
			}
		}
		
		
		
	}

}
