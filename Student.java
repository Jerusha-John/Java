import java.io.*;
public class Student implements Serializable
{
    String name;
    int age;
    int rollNo;
    public Student(String name,int age,int rollNo)
    {
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }
    public void disp()
    {
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("rollNo is "+rollNo);
    }
}