//create a file and enter data into the file
import java.io.*;
class createFileandEnterData
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream f=new FileOutputStream("text.txt");
			DataInputStream din=new DataInputStream(System.in);
			while(true)
			{
				System.out.println("Enter text into the file: ");
				String dt=din.readLine();
				if(dt.equals("$"))
				{
					break;
				}
				else
				{
					f.write(dt.getBytes());
					f.write("\n".getBytes());
				}
			}			
		}
		catch(IOException e){System.out.println(e);}
	}
}