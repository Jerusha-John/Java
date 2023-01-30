import java.lang.*;
class mainThread
{
	public static void main(String args[])
	{
		Thread mt=Thread.currentThread();
		System.out.println(mt);
		mt.setName("Mythread");
		mt.setPriority(3);
		System.out.println(mt);
		try
		{
			for(int i=5;i>=0;i--)
			{
				System.out.println(i);
				mt.sleep(1000);
			}
		}
		catch(InterruptedException e){System.out.println(e);}
	}
}