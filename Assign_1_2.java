import java.util.*;

public class Assign_1_2 {
	public static void main(String args[]) {
		ArrayList<String> alist=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		for(int i=1; i<5; i++) {
			System.out.println("Enter course name: ");
			alist.add(sc.next());
		}
		System.out.println("Courses in college are: ");
		Iterator itr=alist.iterator();
		while(itr.hasNext()) {
			Object ob=itr.next();
			System.out.println(ob);
		}
		alist.removeAll(alist);
		System.out.println("After removing all courses, Arraylist is: "+alist);
		
	}
}