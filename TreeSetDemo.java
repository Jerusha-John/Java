import java.io.*;
import java.util.*;
class TreeSetDemo{
    public static void main(String args[]){
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("A");
        ts.add("D");
        ts.add("D");
       // ts.add(null);
        for(String a:ts){
            System.out.println(a);
        }
        System.out.println(ts.size());
        ts.clear();
        System.out.println("Cleared is ");
        for(String a:ts){
            System.out.println(a);
        }
    }
}