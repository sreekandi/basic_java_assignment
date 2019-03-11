public class Distance
{
	
	private int feet;
	private float inches;
	
	public void setFeetAndInches(int feet,float inches)
	{
		this.feet=feet;
		this.inches=inches;
	}
	
	public void displayFeetAndInches()
	{
		System.out.println("distance in feet "+ feet+","+inches+ " inches");
	}
	
	public Distance sumOfTwoDistanceVariables(Distance number)
	{
		
		Distance d3= new Distance();	
		d3.inches=this.inches+number.inches;
		if(d3.inches>=12.0)
		{
			d3.inches = d3.inches-10;
			d3.feet++;
		}
		d3.feet += this.feet+number.feet;
		return d3; 
		
		 
	}	
	
}