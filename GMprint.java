//generic methods
import java.io.*;
class GMprint
{
	public static <Gii> void printa(Gii[] a)
	{
		for(Gii el:a)
		{
		System.out.println(el);
		}
	}
	public static void main(String args[])
	{
		Integer[]ia={1,2,3,4};
		Double[]da={1.2,2.4,4.5,5.6};
		String[]ca={"a","b","c","d"};
		printa(ia);
		printa(da);
		printa(ca);
	}	
}
