//program to implement run time polymorphism in java using interface,wrt calculating area of a triangle
import java.util.*;
interface triangle
{
    public void area(int a,int b);
}
class trianglearea implements triangle
{
    public void area(int b,int h)
    {
    double x=.5*b*h;
    System.out.println("area of the tringle is:" +x);
    } 
}
class RunTimeArea
{
    public static void main(String arr[])
    {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the height:");
    int a=s.nextInt();
    System.out.print("Enter the base:");
    int b=s.nextInt();
    triangle obj=new trianglearea();
    obj.area(a,b);
    } 
}