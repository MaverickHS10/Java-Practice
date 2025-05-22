import java.io.*;
import java.util.*;

public class Armstrong
{
	public static void main(String args[]) throws IOException
	{
		int num, temp, i, rem, arm=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 digit number: ");
		num=sc.nextInt();
		temp=num;
		for(;temp>0; )
		{
			rem=temp%10;
			arm=(rem*rem*rem)+arm;
			temp=temp/10;
		}
		if(arm==num)
			System.out.println("The entered number "+num+" is an armstrong number");
		
		else
			System.out.println("the entered number is not an armstrong number.");
	}
}