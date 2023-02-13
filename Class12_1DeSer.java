//  Write a program to implement Serialization and De-Serialization, for an object of Student Class.
//  Deserialization
import java.io.*;
public class Class12_1DeSer
{
    public static void main(String args[])
    {
        Student s=null;
        try
        {
            FileInputStream fin=new FileInputStream("D:\\java\\s.txt");
            ObjectInputStream ois=new ObjectInputStream(fin);
            s=(Student)ois.readObject();
            System.out.println("Deserialization happened");
            s.disp();
        }
        catch(IOException e){System.out.println(e);}
        catch(ClassNotFoundException f){System.out.println(f);}
    }
}