package packages;
public class Fact
{
    public static int factNum(int val)
    {
        int fac=1;
        int i;
        for(i=val;i>1;i--)
        {
            fac=fac*i;
        }
        return fac;
    }
}
