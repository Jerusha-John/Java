// WAP to sort elements in an array in ascending order.

import java.io.*;
import java.lang.*;
public class SortArray
{
	public static void main(String args[])
	{
		int a[],n,i,j,temp;
		try
		{
			System.out.println("Enter the size of the array");
			DataInputStream din=new DataInputStream(System.in);
			n=Integer.parseInt(din.readLine());
			a=new int[n];
			System.out.println("Enter the elements of the array");
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(din.readLine());
			}
			System.out.println("Enter the element to be searched");
			for(i=0;i<n;i++)
			{	
				for(j=0;j<n;j++)
				{
					if(a[i]<a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(IOException e){System.out.println(e);}
	}
}