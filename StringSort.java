import java.io.*;

public class StringSort
{
	public static void main(String args[]) throws IOException
	{
		String pname[], temp;
		int n, i, pass;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many player names: ");
		n=Integer.parseInt(br.readLine());
		pname=new String[n];
		System.out.println("Enter player names: ");
		for(i=0;i<n;i++)
		{
			pname[i]=br.readLine();
		}
		System.out.println("Display player names: ");
		for(i=0;i<n;i++)
		{
			System.out.println(""+pname[i]);
		}
		System.out.println("Sorted Player names in Descending orders: ");
		for(pass=1;pass<n;pass++)
		{
			for(i=0;i<n-pass;i++)
			{
				if(pname[i].compareTo(pname[i+1])<0)
				{
					temp=pname[i];
					pname[i]=pname[i+1];
					pname[i+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(""+pname[i]);
		}
	}
	
}