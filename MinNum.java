// Find the minimum of three numbers using a single statement.

import java.io.*;
public class MinNum
{
	public static void main(String args[])
	{
		int x,y,z,min;
		try
		{
			System.out.println("Enter x: ");
			DataInputStream din=new DataInputStream(System.in);
			x=Integer.parseInt(din.readLine());
			System.out.println("Enter y: ");
			y=Integer.parseInt(din.readLine());
			System.out.println("Enter z: ");
			z=Integer.parseInt(din.readLine());
			min=((x<y)&&(x<z))?x:((y<x)&&(y<z)?y:z);
			System.out.println("The min is  "+min);
		}
		catch(IOException e){System.out.println(e);}
	}
}