// Write a program to implement a user defined Exception, which will throw an Exception when a given number is prime.
import java.io.*;
import java.util.*;
class PrimeException extends Exception
{
	PrimeException(String msg)
	{
		super(msg);
	}
		
}
class Prime
{
	public int findPrime(int n)
	{
		int i;
		int value=n/2;
		for(i=value;i>1;i--)
		{
			if(n%value==0)
				return 0;
		}
		return 1;
	}
	
}
class class8_2
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		Prime prime= new Prime();
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		try
		{
			int val=prime.findPrime(n);
			if(val==1)
			{
				throw new PrimeException("Prime number is not allowed");
			}
			else
			{
				System.out.println("The given number is not a prime");
			}
		}
		catch(PrimeException e)
		{
			System.out.println(e);
		}
	}
}