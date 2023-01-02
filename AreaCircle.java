import java.io.*;
import java.lang.*;
public class AreaCircle
{
	public static void main(String args[])
	{
		int r;
		double area;
		try
		{
			System.out.println("Enter the radius");
			DataInputStream din;
			din=new DataInputStream(System.in);
			r=Integer.parseInt(din.readLine());
			area=3.14*r*r;
			System.out.println("The radius is "+r);
			System.out.println("The area is "+area);
		}	
		catch(IOException e){System.out.println(e);}
	}	
}	