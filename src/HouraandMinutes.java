public class Time{
	
	private int hours;
	private int minutes;
	
	public void setHoursAndMinutes(int hours,int minutes)
	{
		this.hours=hours;
		this.minutes=minutes;
	}
	
	public void displayHoursAndMinutes()
	{
		System.out.println(hours+","+minutes);
	}
	
	public Distance sumOfTwoDistanceVariables(Distance number)
	{
		
		Distance d3= new Distance();	
		d3.inches=this.inches+number.inches;
		
		d3.feet = this.feet+number.feet;
		return d3; 
	}	
	public static void main(String[] args)
	{
		Distance d1=new Distance();
		d1.setFeetAndInches(5,8);
		d1.displayFeetAndInches();
		Distance  d2=new Distance ();
		d2.setFeetAndInches(5,6);
		d2.displayFeetAndInches();
		Distance d=new Distance();
		d=d1.sumOfTwoDistanceVariables(d2);
		d.displayFeetAndInches();
	}
		
}