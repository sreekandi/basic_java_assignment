public class Time{
	
	private int hours;
	private int minutes;
	
	public void setTime(int hours,int minutes)
	{
		this.hours=hours;
		this.minutes=minutes;
	}
	
	public void showTime()
	{
		System.out.println(hours+","+minutes);
	}
	
	public Time sum(Time number)
	{
		
		Time time= new Time();	
		time.minutes=this.minutes+number.minutes;
		if(time.minutes>=60)
		{
			time.minutes= time.minutes-60;
			time.hours++;
		}
		
		time.hours = this.hours+number.hours;
		return time; 
	}	
	public static void main(String[] args)
	{
		Time time1=new Time();
		time1.setTime(5,8);
		time1.showTime();
		Time  time2=new Time();
		time2.setTime(5,6);
		time2.showTime();
		Time time3=new Time();
		time3=time1.sum(time2);
		time3.showTime();
	}
		
}