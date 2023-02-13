//Write a program to calculate the prime factor of a given number,using packages
import java.util.*;
import packages.*;
class Class7_5
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        n=sc.nextInt();
        Prime.PrimeFact(n);

    }
}