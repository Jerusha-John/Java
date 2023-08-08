import java.io.*;
public class readNo
{
    public static void main(String args[])
    {
        String str;
        try
        {
            System.out.println("Enter x:");
            DataInputStream din=new DataInputStream(System.in);
            str=din.readLine();
            System.out.println("x is "+str);
        }
        catch(IOException e){System.out.println(e);}
    }
}