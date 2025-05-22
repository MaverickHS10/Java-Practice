import java.io.*;
import java.util.*;

public class SumDigits {
	public static void main(String args[]) throws IOException {
		int n, sum=0, rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a multiple digit number: ");
		n=sc.nextInt();
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("The sum of the digits is "+sum);
	}

}