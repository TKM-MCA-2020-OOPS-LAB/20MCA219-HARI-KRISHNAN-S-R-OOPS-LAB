package JAVA;
import java.util.Scanner;
import java.lang.String;

public class CPU {
	double price;
   public class processor{
	   float ncores;
	   String manufacturer;
	   void pinfo(float a,String processorname) {
	          ncores=a;
	          manufacturer=processorname;
	   System.out.println("The processor information is" +ncores+ "" +manufacturer);
   }
   }
   static class ram{
	   float memory;
	   String manufacturer;
	   void prinfo(float b,String ramname) {
		   memory=b;
		   manufacturer=ramname;
	   
	   System.out.println("The Ram information is" +memory+ "" +manufacturer); 
	   
   }
   }

	public static void main(String[] args) {
		CPU obj=new CPU();
		CPU.processor obj1=obj.new processor();
		CPU.ram obj2=new CPU.ram();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price of CPU");
		obj.price=sc.nextInt();
		System.out.println("Enter processor details");
		float a=sc.nextFloat();
		Scanner sc1=new Scanner(System.in);
		String processorname=sc1.nextLine();
		System.out.print("Enter RAM details");
		float b=sc.nextFloat();
		String ramname=sc1.nextLine();
		sc.close();
		sc1.close();
		System.out.println("The price of CPU is"+obj.price);
		obj1.pinfo(a, processorname);
		obj2.prinfo(b, ramname);
	}

}