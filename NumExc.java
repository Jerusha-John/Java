import java.io.*;
class NumExc
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
		catch(NullPointerException e){System.out.println(e);}
	}
}