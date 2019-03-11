import java.util.Scanner;
class Taxamount
{	
	public static void main(String[] args)
	{
	
	int salary;
	float totaltaxamount;
	System.out.println("enter salary");	
	Scanner input=new Scanner(System.in);

	salary=input.nextInt();
	if((salary>1)&&(salary<=180000))
	{

		System.out.println("Tax in percentage NULL");
		
	}
 
	else if((salary>=180000)&&(salary<=300000))
	{
		System.out.println("Tax in Percentage 10%");
		 totaltaxamount=(salary*10)/100;
		System.out.println("total tax amount is"+totaltaxamount);
	}
	
	else if((salary>=300000)&&(salary<=500000))
	{
		System.out.println("tx in percentage 20%");
		 totaltaxamount=(salary*20)/100;
		System.out.println("total tax amount is"+totaltaxamount);
	}
	 
	else if((salary>=500000)&&(salary<=1000000))
	{
			 
		System.out.println("Tax in Percentage 30%");
			totaltaxamount=(salary*30)/100;
		System.out.println("total tax amount is"+totaltaxamount);
	}
	  
	}
}
