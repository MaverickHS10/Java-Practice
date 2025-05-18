import java.io.*;
import java.util.*;

public class ArrayEvenodd
{
	public static void main(String args[]) throws IOException
	{
		int a[], n, i;
		Scanner sc=new Scanner(System.in); 
		System.out.println("How many array elements: ");
		n=sc.nextInt();
		a=new int[7];
		System.out.println("Accepting Numbers: ");
		for(i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Displaying numbers: ");
		for (i=0; i<n; i++)
		{
			System.out.println(""+a[i]);
		}
		System.out.println("Displaying even odd numbers: ");
		for (i=0;i<n;i++)
		{
			if (a[i]%2==0)
			{
				System.out.println("Even number: "+a[i]);
			}
			else
			{
				System.out.println("Odd Number: "+a[i]);
			}
		}
	}

} 