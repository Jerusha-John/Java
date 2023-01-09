import java.io.*;
import java.lang.*;
class test
{
	public int sq()
	{
	int x,sq;
	try
		{
			System.out.println("Enter x: ");
			DataInputStream din=new DataInputStream(System.in);
			x=Integer.parseInt(din.readLine());
			sq=x*x;
			return sq;
			
		}
		catch(IOException e)
		{
		System.out.println(e);
		return 1;
		}
		
	}
}
class FuncwoArgwReturn
{
	public static void main(String args[])
	{
			test t=new test();
			int a=t.sq();
			System.out.println("The square is "+a);
	}
}