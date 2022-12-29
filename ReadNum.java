//Read two numbers.

import java.io.*;
public class ReadNum
{
   public static void main(String args[])
   {
     String str;
     try
     {
       System.out.println("Enter x");
       DataInputStream dis=new DataInputStream(System.in);
       str=dis.readLine();
       System.out.println("x is "+str);
     }
     catch(IOException e){System.out.println(e);} 
   }
} 