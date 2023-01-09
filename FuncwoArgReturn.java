import java.io.*;
import java.lang.*;
class test
{
	public void sq()
	{
	int x;
	try
		{
			System.out.println("Enter x: ");
			DataInputStream din=new DataInputStream(System.in);
			x=Integer.parseInt(din.readLine());
			int sq=x*x;
			System.out.println("The square is "+sq);
		}
		catch(IOException e) {System.out.println(e);}
	}
}
class FuncwoArgReturn
{
	public static void main(String args[])
	{
			test t=new test();
			t.sq();
	}
}