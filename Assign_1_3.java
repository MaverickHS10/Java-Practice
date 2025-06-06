import java.util.*;

class Employee {
	int eid;
	String ename;
	float salary;
	Scanner sc=new Scanner(System.in);
	void accept() {
		System.out.println("Enter Emp id: ");
		eid=sc.nextInt();
		System.out.println("Enter Emp name: ");
		ename=sc.next();
		System.out.println("Enter Emp Salary: ");
		salary=sc.nextFloat();
	}
	
	void display() {
		System.out.println("Employee id: "+eid+" name: "+ename+" and Salary: "+salary);
	}
}
	
public class Assign_1_3 {
    public static void main(String args[]) {
		LinkedList<Employee> empList=new LinkedList<Employee>();
		Scanner sc=new Scanner(System.in);
		int noOfEmp;
		System.out.println("How many Employee you want: ");
		noOfEmp=sc.nextInt();
		for(int i=0; i<noOfEmp; i++) {
			Employee eob=new Employee();
			eob.accept();
			empList.add(eob);
		}
		Iterator itr=empList.iterator();
		while(itr.hasNext()) {
			Employee ob=(Employee)itr.next();
			System.out.println(ob.eid+"\t"+ob.ename+"\t"+ob.salary);
		}
		int find;
        System.out.print("Enter employee id t find employee :- ");
        find = sc.nextInt();

        itr = empList.iterator();
        while(itr.hasNext()){
            Employee sample = (Employee) itr.next();
            if(sample.eid == find){
				System.out.println("Employee found......");
                sample.display();
			}
			else
			{
				System.out.println("Employee not found.");
			}
        }

        sc.close();
    }
}
	

