//write a program to implement object cloning for the class Distance which has inch and feet as data members
import java.io.*;
import java.lang.*;
import java.util.*;
class distance implements Cloneable
{
	Double inch,feet;
	distance(Double a,Double b)
	{
		inch=a; 
		feet=b;
	}
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch(CloneNotSupportedException c)
		{
			System.out.println("error"+c);
			return this;
		} 
	} 
}
class ObjCloning
{
	public static void main(String ags[])
	{
		Double n,x;
		System.out.println("Enter distance in inch: ");
		Scanner in = new Scanner(System.in);
		n=in.nextDouble();
		System.out.println("Enter dist in feet: ");
		x=in.nextDouble();
		distance obj1=new distance(n,x);
		distance obj2=(distance)obj1.clone();
		System.out.println("inch: "+obj2.inch);
		System.out.println("feet: "+obj2.feet);
	} 
}