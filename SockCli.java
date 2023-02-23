package Networking;
import java.net.*;
import java.io.*;
public class SockCli {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("Localhost",1234);
			System.out.println("Sending a request to server");
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(System.in);
			System.out.println("Enter the data you want to enter");
			String st=din.readLine();
			dout.writeUTF(st);
			s.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
