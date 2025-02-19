import java.util.*;
class complex
{
	int i,r;
	complex(int i,int r)
	{
		this.r=r;
		this.i=i;
	}
	static void csum(complex c1,complex c2)
	{
		int f=c1.r+c2.r;
		int s=c1.i+c2.i;
		System.out.println("Sum is "+s+" + i"+f);
	}
	public static void main(String args[])
	{
		Scanner op=new Scanner(System.in);
		System.out.println("enter real and imaginary part of  first complex number :");
		int r1=op.nextInt();
		int c1=op.nextInt();
		complex s1=new complex(r1,c1);
		System.out.println("enter real and imaginary part of  second complex number :");
		int r2=op.nextInt();
		int c2=op.nextInt();
		complex s2=new complex(r2,c2);
		csum(s1,s2);
	}
}
		
		
