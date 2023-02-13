package packages;
import java.lang.Math;
public class Prime
{
    public static void PrimeFact(int n)
    {
        while(n%2==0)
        {
            System.out.println(2 + " ");
            n=n/2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            while(n%i==0)
            {
                System.out.println(i + " ");
                n=n/i;
            }
        }
        if(n>2)
        {
            System.out.println(n);
        }
    }
}