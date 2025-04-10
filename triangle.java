package graphics;
public class triangle implements figure
{
	public int h,b;
	public triangle(int h,int b)
	{
		this.h=h;
		this.b=b;
	}
	public double area()
	{
		return 0.5*b*h;
	}
}

