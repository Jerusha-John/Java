import java.io.*;
import java.lang.*;
class comp
{
	int rl;
	int im;
	void read()
	{
		DataInputStream din;
		din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the real part");
			rl=Integer.parseInt(din.readLine());
			System.out.println("Enter the imaginary part");
			im=Integer.parseInt(din.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}
	void disp()
	{
		System.out.println("The real part is: "+rl);
		System.out.println("The imaginary part is: "+im);
		System.out.println("The number is: "+rl+"+"+im+"i");
	}	
	comp add(comp c2)
	{
		comp c=new comp();
		c.rl=this.rl+c2.rl;
		c.im=this.im+c2.im;
		System.out.println("The sum is: "+c.rl+"+"+c.im+"i");
		return c;
	}	
}	




class ComplexAdd
{
	public static void main(String args[])
	{
		comp c1=new comp();
		System.out.println("FIRST");
		c1.read();
		c1.disp();
		comp c2=new comp();
		System.out.println("SECOND");
		c2.read();
		c2.disp();
		comp c3=new comp();
		c3=c1.add(c2);
	}	
}	