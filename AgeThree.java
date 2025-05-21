import java.io.*;
import java.util.*;

public class AgeThree
{
	static void ageofThree(int a1, int a2, int a3)
	{
		if(a1>a2&&a1>a3)
			System.out.println("First person os oldest.");
		else if(a2>a1&&a2>a3)
			System.out.println("Second person is oldest.");
		else if (a3>a1&&a3>a2)
			System.out.println("Third person is oldest.");
		else
			System.out.println("All are of same age.");
	}
	public static void main(String args[]) throws IOException
	{
		int age1, age2, age3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ages of three peoples: ");
		age1=sc.nextInt();
		age2=sc.nextInt();
		age3=sc.nextInt();
		ageofThree(age1, age2, age3);
	}
}