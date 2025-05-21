import java.io.*;
import java.util.*;

public class AdditionUser
{
	public static void main(String args[]) throws IOException
	{
		int n1, n2, add;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		add=n1+n2;
		System.out.println("Addition of "+n1+" and "+n2+" is "+add);
	}
}