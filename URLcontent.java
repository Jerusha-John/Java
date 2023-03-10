//Write a program to get protocol, file name, host, path and port of a given URL.
package Networking;
import java.net.*;
public class URLcontent {

	public static void main(String[] args) {
		try {
			URL u=new URL("https://rajagiri.edu/");
			System.out.println("The protocol is "+u.getProtocol());
			//System.out.println("The File is "+u.toString());
			System.out.println("The Host name is "+u.getHost());
			System.out.println("The Path is "+u.getPath());
			System.out.println("The Port is "+u.getDefaultPort());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
