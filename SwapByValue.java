import java.io.*;
import java.lang.*;

class Num{
    public static void SwapFunc(int a,int b){
        System.out.println("Before swap(INSIDE) a="+a+" b="+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After swap(INSIDE) a="+a+" b="+b);
    }
}

class SwapByValue{
    public static void main(String args[]){
        int a=10;
        int b=15;
        System.out.println("Before swap a="+a+" b="+b);
        Num n=new Num();
        n.SwapFunc(a,b);
        System.out.println("After swap a="+a+" b="+b);
    }
}