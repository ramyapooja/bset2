import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n+1;i<m;i++)
        {
          int c=0;
          for(int j=1;j<=i;j++)
          {
             if(i%j==0)
               c=c+1;
          }
          if(c==2)
          {
            if(i<m-1)
              System.out.print(i+" ");
            else
              System.out.print(i);
          }
        }
	}
}
