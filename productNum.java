// WAP to display two numbers received as command line argument, and print its product
import java.io.*;
import java.lang.*;
public class class1_2
{
    public static void main(String args[])
    {
        int product=1;
        System.out.println("The Numbers are: ");

        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
            product=product*Integer.parseInt(args[i]);
        }
        System.out.println("The Product is:"+product);

    }
}