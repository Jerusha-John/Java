//Write a program to calculate the value of nCr for given values of n and r,using packages
import java.util.*;
import packages.*;
class nCrValue
{
    public static void main(String args[])
    {
        int n,r,d;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n=sc.nextInt();
        System.out.print("Enter the value of r:");
        r=sc.nextInt();
        d=n-r;
        Fact f=new Fact();
        int nVal=f.factNum(n);
        int rVal=f.factNum(r);
        int dVal=f.factNum(d);
        System.out.println(nVal/(rVal*dVal));
    }
}