package co3qn7;
import java.util.Scanner;
interface Bill
{
	void total();
}
class Product implements Bill
{
	int Order_No;
	int P_Id;
	String P_Name;
	float Qty;
	float Unit_Price;
	float Total;
	float Net_Amt=0;
	Scanner sc=new Scanner(System.in);
	public void Product_Detls()
	{
		System.out.println("Enter the Product Id: ");
		P_Id=sc.nextInt();
		System.out.println("Enter the Product Name: ");
		P_Name=sc.next();
		System.out.println("Enter the Quantity: ");
		Qty=sc.nextFloat();
		System.out.println("Enter Unit Price: ");
		Unit_Price=sc.nextFloat();
	}
	public void total() 
	{	
		Total=Qty*Unit_Price;
		System.out.println("  "+P_Id+"\t\t"+P_Name+"\t\t"+Qty+"\t\t"+Unit_Price+"\t\t"+Total+"\n");
	}
	public void Order_No()
	{
		System.out.println("\nEnter the Order No: ");
		Order_No=sc.nextInt();
	}
	public void display()
	{
		System.out.println("\n-------------Bill Receipt------------\n");
		System.out.println("\nOrder No." + Order_No);
		System.out.println("\nDate : " + java.time.LocalDate.now());
		System.out.println("\nProduct Id\t Name\t\tQuantity\tunit price\tTotal");
		System.out.print("_______________________________________________________________________\n");
	}
}
public class Bill_Receipt {

	public static void main(String[] args) {
		int n;
		int Net_Amt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Items Purchased: ");
		n=sc.nextInt();
		Product Pro= new Product();
		Product obj[]= new Product[n];
		Pro.Order_No();
		for(int i=0;i<n;i++)
		{
		System.out.println("\nEnter Details of Product"+(i+1));
		obj[i]=new Product();
		obj[i].Product_Detls();
		}
		
	    Pro.display();
		for(int i=0;i<n;i++)
		{
		    obj[i].total();
		    Net_Amt+=obj[i].Total;
		}
		System.out.print("_______________________________________________________________________");
		System.out.println("\n\t\t\t\t\t\tNet. Amount\t  "+Net_Amt);
		sc.close();
		// TODO Auto-generated method stub

	}

}