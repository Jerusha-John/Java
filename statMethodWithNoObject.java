import java.io.*;
import java.lang.*;
class myNewClass
{
	static int x=10;
	static void fun()
	{
		System.out.println("x is "+x);
	}
}

class statMethodWithNoObject
{
	public static void main(String args[])
	{
		myNewClass.fun();
	}
}