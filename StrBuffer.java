//Write a program to implement various methods of a StringBuffer class.
package StrBuffer;
import java.util.*;
public class StrBuffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String fName=sc.nextLine();
		
		System.out.println("Enter the middle name: ");
		String mName=sc.nextLine();
	
		System.out.println("Enter the last name: ");
		String lName=sc.nextLine();
		
		StringBuffer s=new StringBuffer(fName);
		
		s.insert(fName.length()," ");
		s.append(mName); //append method
		s.insert(fName.length()+mName.length()+1," "); //inserting spaces between names
		s.append(lName);
		System.out.println(s);
		System.out.println("The length of the name is "+s.length()); //finding the length
		System.out.println("The reverse is of the name is "+s.reverse()); //reversing the string
		System.out.println("The name is "+s.reverse()); //for getting the original string
		System.out.println(" "+s.replace(8,11,"ann")); //replace method
		
		System.out.println("Enter the index to be searched: ");
		int i=sc.nextInt();
		System.out.println("The element at the "+i+"th index is "+s.charAt(i));
		System.out.println(" "+s.substring(0,7));
		
		
		
		
		
	}

}
