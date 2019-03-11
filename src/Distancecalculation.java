public class Adddistance
{
	public static void main(String [] args)
	{
		Distance d1=new Distance();
		d1.setFeetAndInches(5,8);
		d1.displayFeetAndInches();
		Distance  d2=new Distance ();
		d2.setFeetAndInches(5,6);
		d2.displayFeetAndInches();
		Distance d3=new Distance();
		d3=d1.sumOfTwoDistanceVariables(d2);
		d3.displayFeetAndInches();
	}
}		