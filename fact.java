// WAP to find the factorial of n, using recursion.

import java.io.*;
import java.lang.*;
class test
{
	public int fac(int x)
	{
		if(x>=1)
		{
			return(x*fac(x-1));
		}
		else
		{
			return 1;
		}
	}	
}
public class fact
{
	public static void main(String args[])
	{
		test t=new test();
		int n;
		try
		{
			System.out.println("Enter n: ");
			DataInputStream din=new DataInputStream(System.in);
			n=Integer.parseInt(din.readLine());
			int f=t.fac(n);
			System.out.println("Factorial is "+f);
		}
		catch(IOException e){System.out.println(e);}
	}	
}	
	