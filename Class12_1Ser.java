//  Write a program to implement Serialization and De-Serialization, for an object of Student Class.
//  Serialization
import java.io.*;
import java.util.*;
public class Class12_1Ser
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Name:");
            String name=sc.nextLine();
            System.out.print("Enter the Age:");
            int age=sc.nextInt();
            System.out.print("Enter the RollNo:");
            int rollNo=sc.nextInt();
            Student s=new Student(name,age,rollNo);
            FileOutputStream fout=new FileOutputStream("D:\\java\\s.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fout);
            oos.writeObject(s);
            System.out.println("Serialization happened");
        }
        catch(IOException e){System.out.println(e);}
    }
}