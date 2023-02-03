import pac.*;
package pac;
class p1
{
	public static int disp(int a,int b)
	{
	int c=a*b;
	return(c);
	}
}
public class p1Demo
{
	public static void main(String args[])
	{
		p1 pobj=new p1();
		int x=p1.disp(10,20);
		System.out.println("Outside package"+x);
	}
}

