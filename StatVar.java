import java.io.*;
import java.lang.*;

class StatVar{
    //public static void main(String args[]){
         static int x=10;
        void test(){
            x++;
            System.out.println("x is "+x);
        }
   // }
   
    static{
        System.out.println("static variable");
    }
}