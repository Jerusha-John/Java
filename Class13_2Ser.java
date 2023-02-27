//Write a program to implement communication between a client and server client, via Socket Programming.
package Class13;
import java.net.*;
public class Class13_2Ser {

	public static void main(String[] args) throws Exception {
		byte[] b1=new byte[2048];
		DatagramSocket ds=new DatagramSocket(1234);
		DatagramPacket dp=new DatagramPacket(b1,b1.length);
		ds.receive(dp);
		String str=new String(dp.getData());
		int num=Integer.parseInt(str.trim());
		num++;
		System.out.println("Data is "+num);

	}

}
