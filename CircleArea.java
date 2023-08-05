//WAP to calculate area of a circle (functions with no argument and no return type.)

import java.io.*;
import java.lang.*;

class AreaCircle
{
    public void AreaFunc()
    {
        int r;
        double Area;
        try
		{
            System.out.println("Enter r:");
            DataInputStream din;
            din=new DataInputStream(System.in);
            r=Integer.parseInt(din.readLine());
            Area=3.14*r*r;
            System.out.println("Area is:"+Area);
        }
        catch(IOException e) {System.out.println(e);}
    }
}
class class3_5
{
	public static void main(String args[])
	{
		AreaCircle a=new AreaCircle();
		a.AreaFunc();
	}
}
