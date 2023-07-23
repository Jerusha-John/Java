import java.io.*;
class finallyExc
{
	public static void main(String args[])
	{
		try
		{
			String s="reg";
			int i=Integer.parseInt(s);
			System.out.println(i);
			i++;
			System.out.println(i);
		}
		catch(NumberFormatException e){e.printStackTrace();}
		finally
		{
			System.out.println("The final content");
			System.out.println(s);
		}
	}
}