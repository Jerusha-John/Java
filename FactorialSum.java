// WAP to find the sum of 1+2/2!+3/3!+4/4!++n/n! using a single for loop.

import java.io.*;
class Series
{
    int i;
    double fact=1,sum=0;
    public double fact(int n)
    {
    for(i=1;i<=n;i++)
    {
        fact=fact*i;
        sum=sum+(i/fact);
    }
    return sum;
    }
 }     
class class3_4
{
	public static void main(String args[])
	{
		String str;
		int n;
		double res;
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the number");
			n=Integer.parseInt(str=din.readLine());
			Series s=new Series();
			res=s.fact(n);
			System.out.println("Sum of the series is: "+res);
		}
		catch(IOException e){System.out.println(e);}
	}
}