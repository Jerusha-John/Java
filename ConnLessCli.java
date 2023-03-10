//Write a program to implement connection less communication.
package Networking;
import java.net.*;
import java.util.*;

public class ConnLessCli {
	public static void main(String[] args) throws Exception {
		Scanner sc =new Scanner(System.in);
		int i;
		System.out.println("Enter the data to be send: ");
		i=sc.nextInt();
		byte[] b=(String.valueOf(i)).getBytes();
		DatagramSocket ds=new DatagramSocket();
		InetAddress my=InetAddress.getLocalHost();
		DatagramPacket dp=new DatagramPacket(b,b.length,my.getLocalHost(),1234);
		ds.send(dp);
		System.out.println("Data is sent");
	}
}