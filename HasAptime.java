//package Serialization;
import java.io.*;
import java.util.Scanner;
import java.net.*;
public class HasAptime implements Serializable{
	String ctgry;
	Emp e; 
	public HasAptime(String ctgry) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the name: ");
		String Name=sc.nextLine();
		System.out.println("Enter the eId: ");
		int eId=sc.nextInt();
		System.out.println("Enter the Age: ");
		int Age=sc.nextInt();
		this.ctgry=ctgry;
		e =new Emp(Name,eId,Age);

		

	}
	public void disp() {
		e.disp();
		System.out.println("Category is "+ctgry);
	}
}	