import java.io.*;
import java.util.*;

public class ArrayDemo
{
	 static void evenOdd(int a[], int n)
	{
		int i;
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
	public static void main(String args[]) throws IOException
	{
		int a[], n, i;
		Scanner sc=new Scanner(System.in); 
		System.out.println("How many array elements: ");
		n=sc.nextInt();
		a=new int[n];
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
		evenOdd(a, n);
	}

} 