//Read numbers into an array. Perform validations using multiple catch statements/predefined Exceptions.
import java.io.*;
class class8_1
{
	public static void main(String args[])
	{
		int a[],n,i;
		try
		{
			System.out.println("Enter the size of the array: ");
			DataInputStream din=new DataInputStream(System.in);
			n=Integer.parseInt(din.readLine());
			a=new int [n];
			System.out.println("Enter the elements of the array: ");
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(din.readLine());
			}
			System.out.println("The elements of the array are: ");
			for(i=0;i<n;i++)
			{
				System.out.print("\t"+a[i]);
			}
		}
		catch(IOException e)
		{
			System.out.println("First catch");
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Second catch");
			System.out.println(e);
		}
		
	}
}