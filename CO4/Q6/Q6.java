import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class Q6 {

	public static void main(String[] args) throws InterruptedException {
		fibonacci at = new fibonacci();
		Thread a=new Thread(at);
		even bt = new even();
		Thread b= new Thread(bt);
		a.start();
		a.sleep(200);
		b.start();
		b.sleep(200);
    }
}
class fibonacci extends Thread{
	public void run(){
		int n=20, a1=0, a2=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Fibonacci Series till " + n + " terms:");
		for (int i=1;i<=20;i++) {
		      System.out.print(a1 + ", ");
		      int nextTerm = a1+a2;
		      a1=a2;
		      a2=nextTerm;
		}
	}
}
class even extends Thread{
	public void run() {
		int number, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\n Please Enter any Number : ");
		number = sc.nextInt();	
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i +"\n"); 
			}
	  }
			
   }  
}

