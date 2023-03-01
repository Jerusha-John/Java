//Write a program to implement threads by implementing the Runnable interface.
package Class9;
class CCC implements Runnable{
	String nm;
	CCC(String name){
		nm=name;
	}
	public void run() {
		System.out.println("Running "+nm);
		try{
			for(int i=5;i>=0;i--) {
				System.out.println(nm+ " "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
public class Class9_2 {

	public static void main(String[] args) {
		CCC c=new CCC("C");
		Thread t=new Thread(c);
		t.start();

	}

}
