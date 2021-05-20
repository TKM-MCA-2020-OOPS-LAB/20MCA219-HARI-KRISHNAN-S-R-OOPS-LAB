package myproject;

	import java.util.Scanner;

	public class Employe {

		int emp_id;
		String Ename;
		double Esalary;
		String Eaddress;
		
	public Employe()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter employee id: ");
		emp_id=s.nextInt();
		System.out.println("Enter employee name: ");
		Ename=s.next();
		System.out.println("Enter employee salary: ");
		Esalary=s.nextDouble();
		System.out.println("Enter employee address: ");
		Eaddress=s.next();	
	}
	}
	class Teacher extends Employe
	{
		String department;
		String subject;
		
	public Teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department details: ");
		department=sc.next();
		System.out.println("Enter subject taught: ");
		subject=sc.next();
	}
	void display()
	{
		System.out.println("-------------------------------");
		System.out.println("Employee id: "+emp_id);
		System.out.println("Employee name: "+Ename);
		System.out.println("Salary: "+Esalary);
		System.out.println("Employee address: "+Eaddress);
		System.out.println("Department details: "+department);
		System.out.println("Subject taught: "+subject);
		
	}
	public static void main(String args[])
	{
		int n,i;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the No of employees: ");
		n=s1.nextInt();
		Teacher T1[]=new Teacher[n];
		
		for(i=0;i<n;i++)
		{
			T1[i]=new Teacher();
			
		}
	    for(i=0;i<n;i++)
	    {
	    	T1[i].display();
	    }
	}
	}