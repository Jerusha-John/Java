import java.io.*;

abstract class Parent{
    abstract void test();
    void test1(){
        System.out.println("child");
    }
}

class child1 extends Parent{
    void test(){
        System.out.println("child1");
    }
}

class child2 extends Parent{
    void test(){
        System.out.println("child2");
    }
}

class AbsDemo{
    public static void main(String args[]){
        child1 c1=new child1();
        c1.test();
        c1.test1();
        child2 c2=new child2();
        c2.test();
    }
}
