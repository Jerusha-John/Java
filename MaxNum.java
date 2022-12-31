// WAP to read three numbers and the maximum.

import java.io.*;
public class MaxNum
{
	public static void main(String args[])
	{
		int x,y,z;
		try
		{
			System.out.println("Enter x: ");
			DataInputStream din=new DataInputStream(System.in);
			x=Integer.parseInt(din.readLine());
			System.out.println("Enter y: ");
			y=Integer.parseInt(din.readLine());
			System.out.println("Enter z: ");
			z=Integer.parseInt(din.readLine());
			if(x>y && x>z)
				System.out.println("Max is "+x);
			else if(y>x && y>z)
				System.out.println("Max is "+y);
			else
				System.out.println("Max is "+z);
		}
		catch(IOException e){System.out.println(e);}
	}
}