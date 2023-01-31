import java.io.*;
class ArtExc
{
	public static void main(String args[])
	{
		try
		{
			int i=23/0;
			System.out.println(i);
		}
		catch(ArithmeticException e){System.out.println(e);}
	}
}