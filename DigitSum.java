//WAP to calculate sum of digits of a number (functions with argument and return type.)

import java.io.*;
class test
{
	public int FuncDemo(int n)
	{
		int y,sum=0;
		while(n!=0)
		{
			y=n%10;
			sum=sum+y;
			n=n/10;
		}
		return sum;
	}
}
public class DigitSum
{
	public static void main(String args[])
	{
		DataInputStream din;
		din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter x ");
			int n=Integer.parseInt(din.readLine());
			test t=new test();
			int sum=t.FuncDemo(n);
			System.out.println("Sum is:"+sum);
		}
	catch(IOException e) {System.out.println(e);}
	}
}