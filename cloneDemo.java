import java.io.*;

class Test implements Cloneable{
    int a,b;
    public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println(e);
            return this;
        }
    }

}

class cloneDemo{
    public static void main(String args[]){
        try{
            Test t1=new Test();
            t1.a=10;
            t1.b=15;
            System.out.println("t1.a="+t1.a+" t1.b="+t1.b);
            Test t2=(Test)t1.clone();
            System.out.println("t2.a="+t2.a+" t2.b="+t2.b);
        }
         catch(Exception se){
            System.out.println(se);
        }
       
    }
}