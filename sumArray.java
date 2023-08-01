import java.io.*;
import java.lang.*;
public class sumArray
{
	public static void main(String args[])
	{
		int a[],n,i,sum=0;
		try
		{
			System.out.println("Enter the size of the array: ");
			DataInputStream din=new DataInputStream(System.in);
			n=Integer.parseInt(din.readLine());
			a=new int[n];
			System.out.println("Enter the elements of the array ");
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(din.readLine());
				sum=sum+a[i];
			}
			System.out.println("The sum of the elements of the array is "+sum);
		}
		
		catch(IOException e){System.out.println(e);}		
	}	
}