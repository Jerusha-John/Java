//using final class, find the sum of three numbers.
import java.io.*;
import java.lang.*;
class sum2
{
	int n1,n2;
	public sum2(int x,int y)
	{
		n1=x;
		n2=y;	
	}
	int sum()
	{
		return(n1+n2);
	}
}
final class sum3 extends sum2
{
	int n3;
	public sum3(int x,int y,int z)
	{
		n1=x;
		n2=y;
		n3=z;
	}
	int sum()
	{
		return(n1+n2+n3);
	}
}
class sum
{
	public static void main(String args[])
	{
		sum s=new sum(2,3,1);
		int sum;
		sum=c.sum();
	}	
}
	

