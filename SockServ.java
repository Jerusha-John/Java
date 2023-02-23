package Networking;
import java.net.*;
import java.io.*;
public class SockServ {

	public static void main(String[] args) {
		try {
			ServerSocket as=new ServerSocket(1234);
			System.out.println("Waiting for a connection");
			Socket as=ss.accept();
			System.out.println("made connection");
			DataInputStream din=new DataInputStream(as.getInputStream());
			String str=(String)din.readUTF();
			System.out.println("The message is "+str);
			ss.close();
			as.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
