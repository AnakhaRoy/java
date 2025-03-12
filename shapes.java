import java.util.*;
class shape
{
	int l,b;
	double a;
	float r;
	 void area(int l,int b)
	 {
	 	this.l=l;
	 	this.b=b;
	 	int a1=l*b;
	 	System.out.println(" Area of rectangle is "+a1);
	 }
	 void area(float r)
	{
		this.r=r;
		double a2=3.14*r*r;
		System.out.println(" Area of circle is "+a2);
	}
	void area(double a)
	{
		this.a=a;
		double a3=a*a;
		System.out.println(" Area of square is "+a3);
	}
}
class shapes
{
	public static void main(String args[])
	{
		Scanner op=new Scanner(System.in);
		shape sh=new shape();
		System.out.println("Enter length of rectangle ");
		int l=op.nextInt();
		System.out.println("Enter breadth of rectangle ");
		int b=op.nextInt();
		sh.area(l,b);
		System.out.println("Enter radius of circle ");
		double r=op.nextFloat();
		sh.area(r);
		System.out.println("Enter side length of square ");
		double a=op.nextInt();
		sh.area(a);
	}
}
		
		
	
	
