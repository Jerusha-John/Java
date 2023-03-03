//Implement the Producer- Consumer Problem, using Threads.
import java.io.*;
class Q{
    int n;
    boolean f = false;
    synchronized int get(){
    if(!f){
        try{
            wait();
        }
        catch(InterruptedException e){
        }
    }
    System.out.println("Consumed " + n);
    f = false;
    notify();
    return n;
    }
    synchronized void put(int a){
    if(f){
        try{
            wait();
        }
        catch(InterruptedException e){
        }
    }
    System.out.println("Produced " + a);
    n = a;
    f = true;
    notify();
    }
}
class Producer implements Runnable{
    Q q;
    Thread t;
    Producer(Q q){
        this.q = q;
        t = new Thread(this);
        t.start();
        }
    public void run(){
        int i = 0;
        while(i<=10){
            q.put(i++);
            }
    }
}
class Consumer implements Runnable{
    Q q;
    Thread t;
    Consumer(Q q){
        this.q = q;
        t = new Thread(this);
        t.start();
        }
    public void run(){
        int i = 0;
        while(true){
            q.get();
            }
        }
}
class Class9_4{
    public static void main(String args[])
    {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
    }
}
