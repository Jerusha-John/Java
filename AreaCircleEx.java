import java.io.*;
import java.lang.*;
public class AreaCircleEx
{
	public static void main(String args[])
	{
		float r;
		float area;
		try
		{
			System.out.println("Enter the radius ");
			DataInputStream din=new DataInputStream(System.in);
			r=Float.parseFloat(din.readLine());
			area=(int)3.14*(int)r*r;
			System.out.println("The radius is "+r);
			System.out.println("The area is "+area);
		}
		catch(IOException e){System.out.println(e);}
	}	
}