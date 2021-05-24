package myproj;
import java.util.*;
public class person {
	int Age;
	String Address,Name,Gender;
	
	public person()
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enter Name : ");
		Name = n.next();
		System.out.println("Enter Age : ");
		Age = n.nextInt();
		System.out.println("Enter Gender : ");
		Gender = n.next();
		System.out.println("Enter Address : ");
		Address = n.next();
	}

}
class emp extends person
{
	int eid,salary;
	String Qual,comp_name;
	
	public emp()
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Enter Emp_id : ");
		eid = m.nextInt();
		System.out.println("Enter Salary : ");
		salary = m.nextInt();
		System.out.println("Enter Qualification : ");
		Qual = m.next();
		System.out.println("Enter Company Name : ");
		comp_name = m.next();
	}
}
class teacher extends emp
{
	int tid;
	String dept,subj;

teacher()
{
	Scanner o= new Scanner(System.in);
	System.out.println("Enter Teacher_id : ");
	tid = o.nextInt();
	System.out.println("Enter Subject: ");
	subj = o.next();
	System.out.println("Enter Department : ");
	dept = o.next();
}

public void disp()
{
	System.out.println("Name : "+Name);
	System.out.println("Age : "+Age);
	System.out.println("Gender : "+Gender);
	System.out.println("Address : "+Address);
	System.out.println("Emp id : "+eid);
	System.out.println("salary : "+salary);
	System.out.println("Qualification : "+Qual);
	System.out.println("Company Name : "+comp_name);
	System.out.println("Teacher id : "+tid);
	System.out.println("Subject : "+subj);
	System.out.println("Department : "+dept);
	
}

	
public static void main(String args[])
{
	int no;
	
	Scanner p = new Scanner(System.in);
	System.out.println("Enter no of teachers : ");
	no = p.nextInt();
	
	teacher[] obj = new teacher[no];
	
	for(int i=0;i<no;i++)
	{
		obj[i] = new teacher();
	}
	
	 for(int i=0;i<no;i++)
	    {
	    	System.out.println("\nDetails of Employee  No : " + (i+1));
	    	obj[i].disp();
	    }
}
}