//Write a program to create multiple threads by extending the Thread class.
package Class9;
class AAA extends Thread{
	String nm;
	AAA(String name){
		nm=name;
	}
	public void run() {
		System.out.println("Running "+nm);
		try {
			for(int i=5;i>=0;i--) {
				System.out.println(nm+" "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

class BBB extends Thread{
	String nm;
	BBB(String name){
		nm=name;
	}
	public void run() {
		System.out.println("Running "+nm);
		try {
			for(int i=5;i>=0;i--) {
				System.out.println(nm+" "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class Class9_1 {

	public static void main(String[] args) {
		AAA a=new AAA("A");
		a.start();
		BBB b=new BBB("B");
		b.start();

	}

}
