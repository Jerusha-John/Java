import java.io.*;
import java.lang.*;

class Num{
    int x;
}

// class MyClass{
//     int x;
// }

class Test{
    public void swapFunc(Num a,Num b){
        System.out.println("Before swap(INSIDE) a="+a.x+" b="+b.x);
        Num c=new Num();
        c.x=a.x;
        a.x=b.x;
        b.x=c.x;
        System.out.println("After swap(INSIDE) a="+a.x+" b="+b.x);
    }
}

class SwapByRef{
    public static void main(String args[]){
        Num a=new Num();
        a.x=10;
        Num b=new Num();
        b.x=20;

        System.out.println("Before swap a="+a.x+" b="+b.x);
        Test t=new Test();
        t.swapFunc(a,b);
        System.out.println("After swap a="+a.x+" b="+b.x);
    }
}