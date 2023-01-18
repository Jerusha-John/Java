//file creation using FileOutputStream method.
import java.io.*;
class FCMeth2
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream f1=new FileOutputStream("D:\\java\\text123.txt");
			System.out.println("File created");
		}
		catch(IOException e){System.out.println(e);};
	}
}