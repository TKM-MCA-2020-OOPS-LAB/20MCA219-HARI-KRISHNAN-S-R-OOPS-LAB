package graphics;

import java.util.Scanner;

interface figure{
	void rectangle();
	void triangle();
	void square();
	void circle();
}



public class area implements figure {
	int x,y,b,h,r;
	double a,ar,are,circle_ar;
	Scanner sc=new Scanner(System.in);
	public void rectangle()
	{
		System.out.println("Enter the length of Rectangle: ");
		x=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle: ");
		y=sc.nextInt();
		a=x*y;
		System.out.println("Area of Rectangle: "+a);
	
	}
	public void triangle()
	{
		System.out.println("Enter the base length of Triangle: ");
		b=sc.nextInt();
		System.out.println("Enter the height of Triangle: ");
		h=sc.nextInt();
		ar=0.5*b*h;
		System.out.println("Area of Triangle: "+ar);
	}
	public void square()
	{
		System.out.println("Enter the side length of Square: ");
		a=sc.nextInt();
		are=a*a;
		System.out.println("Area of Square: "+are);
	}
	public void circle()
	{
		System.out.println("Enter the radius of Circle: ");
		r=sc.nextInt();
		circle_ar=Math.PI*r*r;
		System.out.println("Area of Circle: "+circle_ar);

	}
}


