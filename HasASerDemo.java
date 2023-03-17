//package Serialization;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class HasASerDemo {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Ctgry: ");
			String ctgry=sc.nextLine();
			
			HasAptime hp=new HasAptime(ctgry);
			FileOutputStream fout=new FileOutputStream("HasAemp.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(hp);
			System.out.println("Serialization happened");
			
		}
		catch(IOException e) {System.out.println(e);}
		
	}

	

}