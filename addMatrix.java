import java.io.*;
import java.lang.*;
public class addMatrix
{
    public static void main(String args[])
    {
        int a[][],b[][],c[][];
        int r1,r2,c1,c2;
        int n,i,j;
        try
        {
            System.out.println("Enter the row of the first matrix: ");
            DataInputStream din=new DataInputStream(System.in);
            r1=Integer.parseInt(din.readLine());
            System.out.println("Enter the column of the first matrix: ");
            c1=Integer.parseInt(din.readLine());
            System.out.println("Enter the row of the second matrix: ");
            r2=Integer.parseInt(din.readLine());
            System.out.println("Enter the column of the second matrix: ");
            c2=Integer.parseInt(din.readLine());
            a=new int[r1][c1];
            b=new int[r2][c2];
            c=new int[r1][c1];
            System.out.println("Enter the elements of the first matrix: ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    a[i][j]=Integer.parseInt(din.readLine());
                    
                }    
            }
            System.out.println("Enter the elements of the second matrix: ");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    b[i][j]=Integer.parseInt(din.readLine());
                
                }    
            }
            if(r1==r2&&c1==c2)
            {
                for(i=0;i<r1;i++)
                {
                    for(j=0;j<c1;j++)
                    {
                        c[i][j]=a[i][j]+b[i][j];
                        
                    }    
                }
                System.out.println("The sum of the matrices are ");
                for(i=0;i<r1;i++)
                {

System.out.println();            for(j=0;j<c1;j++)
                    {
                        System.out.print(c[i][j]+"   ");
                        
                    }    
                }
            }
            else
            {
                System.out.println("Addition not possible");
            }    
        }
        catch(IOException e){System.out.println(e);}
    }
}