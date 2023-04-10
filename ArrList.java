import java.io.*;
import java.util.*;

class ArrList{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();
        al.add("A");
        al.add("D");
        al.add("D");
        for(String al:a){
            System.out.println(a);
        }
        al.add(1,"Ann");
        for(String al:a){
            System.out.println(a);
        }
        al.remove("A");
        for(String al:a){
            System.out.println(a);
        }
        System.out.println(al.indexOf("Ann"));
    }
}