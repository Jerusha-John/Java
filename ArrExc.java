import java.io.*;
class ArrExc
{
	public static void main(String args[])
	{
		try
		{
			int a[]={10,20,30};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
	}
}