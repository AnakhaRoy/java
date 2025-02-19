import java.util.*;
public class transpose
{
	public static void main(String args[])
	{
		int i,j,r,c;
		int a[][]=new int[10][10];
		Scanner op=new Scanner(System.in);
		System.out.println("enter the no.of elements in the matrix : ");
		r=op.nextInt();
		System.out.println("enter the elements of the matrix :");
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				a[i][j]=op.nextInt();
			}
		}
		System.out.println("Transpose of the matrix is :");
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println(" ");
		}
		boolean isSym=true;
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					isSym=false;
					break;
				}
			}
			
		}
		if(!isSym)
			{
				System.out.println("it is not Symmetric");
			}
			else
			{
				System.out.println("it is Symmetric");
			}
	}
}
			
