//file creation using Files.createFile() method.
import java.io.*;
import java.nio.file.*;
class FCMeth3
{
	public static void main(String args[])
	{
		try
		{
			Path pf=Paths.get("D:\\java\\text13.txt");
			Path p=Files.createFile(pf);
			System.out.println("File is created at "+pf);
		}
		catch(IOException e){System.out.println(e);}
	}
}