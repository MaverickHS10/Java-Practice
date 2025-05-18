import java.util.*;
import java.io.*;

class Employee {
    
    public int eid;
    public String ename, designation;
    public double salary;
    Scanner in=new Scanner(System.in);
    BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
    
    void accept(){
        System.out.print(" enter id :- ");
        eid=in.nextInt();
        System.out.print(" enter name :- ");
        ename=in.next();
        System.out.print(" enter designation  :- ");
        designation=in.next();
        System.out.print(" enter salary :- ");
        salary=in.nextDouble();
        }
        
    void display(){
        System.out.println(" id :- "+eid+"\n name :- "+ename+"\n designation :- "+designation+"\n salary :- "+ salary);
    }
    
    public static void main(String[] args) {
        
        
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        //String st;
        //st=br.nextLine();
        
        
        System.out.println("\n\n  1st employee Details ");
        Employee e1=new Employee();
        e1.accept();
        e1.display();
        
        System.out.println(" 2nd employee Details  ");
        Employee e2=new Employee();
        e2.accept();
        e2.display();
        
        
    }
}