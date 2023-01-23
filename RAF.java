//Random Access File
import java.io.*;
import java.util.*;
class RAF
{
	public static void main(String args[])
	{
		try
		{
			RandomAccessFile r= new RandomAccessFile("text123.text","rw");
			r.seek(r.length());
			String s="Hi";
			System.out.println("Ptr"+r.getFilePointer());
			r.write(s.getBytes());
			r.close();
		}
		catch(IOException e){System.out.println(e);}
	}
}