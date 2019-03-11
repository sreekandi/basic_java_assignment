public class Complex
	{
		private int real;
		private int imaginary;
		public void setComplex(int real,int imaginary)
		{
			this.real=real;
			this.imaginary=imaginary;
		}
		public void display()
		{
			System.out.println(real+" + "+imaginary);
		}
		
		public Complex sumofcomplexnumbers(Complex number)
		{
			Complex c=new Complex();
			c.real=this.real+number.real;
			c.imaginary=this.imaginary+number.imaginary;
			return c;
		}
	public static void main(String[] args)
	{
		Complex c1=new Complex();
		c1.setComplex(5,8);
		c1.display();
		Complex c2=new Complex();
		c2.setComplex(5,6);
		c2.display();
		Complex c=new Complex();
		c=c1.sumofcomplexnumbers(c2);
		c.display();
	}

}
	