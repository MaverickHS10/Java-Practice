import java.util.*;

public class Assign_1_1 {
	public static void main(String args[]) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("MS Dhoni");
		list.add("Lionel");
		list.add("Julian");
		list.add("Neymar");
		System.out.println("My linked list is "+list);
		list.remove(list.size()-1);
		System.out.println("After deleting element from last position: "+list);
		list.addFirst("Hardik");
		System.out.println("After adding new element at the first position of the linked  list: "+list);
		System.out.println("The size of the linked list is "+list.size());
		System.out.println("The lements in the linked list are: ");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Object ob=itr.next();
			System.out.println(ob);
		}
	}
}