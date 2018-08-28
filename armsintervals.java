/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	            int m=sc.nextInt();
		int k=sc.nextInt();
		int d=0;
		int b=0;
		int n=0;
		int sum=0;
		for(int i=m+1;i<k;i++)
		{
			n=i;
			sum=0;
			b=0;
			while(n>0)
			{
				b=n%10;
				sum=sum+(b*b*b);
				n=n/10;
			}
			if(sum==i)
			{
				d++;
				if(d==1)
			 	{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
					System.out.print(i);
				}
			}
		}
	}
}
