//Write a program to implement communication between a client and server client, via Socket Programming.
package Class13;
import java.net.*;
public class Class13_2Cli {

	public static void main(String[] args) throws Exception {
		int i=10;
		byte[] b=(String.valueOf(i)).getBytes();
		DatagramSocket ds=new DatagramSocket();
		InetAddress my=InetAddress.getLocalHost();
		DatagramPacket dp=new DatagramPacket(b,b.length,my.getLocalHost(),1234);
		ds.send(dp);
		System.out.println("Data is sent");
	}

}
