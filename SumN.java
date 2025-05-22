import java.io.*;
import java.util.*;

public class SumN {
	public static void main(String args[]) throws IOException {
		int i=1, n, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number upto which you want to display the sum: ");
		n=sc.nextInt();
		do {
			sum=sum+i;
			i++;
		}while(i<=n);
		System.out.println("The sum of numbers upto "+n+" is: "+sum);
	}

}
