public class Rectangle
{
	public int length;
	public int bredth;
	public Rectangle(int length,int bredth)
	{
		this.length=length;
		this.bredth=bredth;
	}
	
	public int area()
	{	
		
		return length*bredth;
	}
	public int perimeter()
	{
		
		return 2*(length+bredth);
	}
	public void display()
	{
		System.out.println("length"+length);
		System.out.println("bredth"+bredth);
	}
	public static void main(String[] args)
	{
		Rectangle rec=new Rectangle(4,5);
		rec.display();
		System.out.println(rec.area());
		System.out.println(rec.perimeter());
	}
}
	
