
public class EmployeeSalaryDetails
{
	private int employeeid;
	private String employeename;
	private double monthlybasic;
	public EmployeeSalaryDetails(int id,String name,double monthlyBasic)
	{
		this.employeeid=id;
		this.employeename=name;
		this.monthlybasic=monthlyBasic;
	}
	double annualbasic;
	double monthlygrosssalary;
	double annualgrosssalary;
	double monthlydeducations;
	double monthlytakehome;
	double annualtakehome;
	double hra=monthlybasic/2;
	int medical=1250;
	int conveyance=800;
	double pf;
	double esic;
	double proftax;
	public double getAnnualBasic()
	{
		annualbasic= 12 * monthlybasic;
		System.out.println("AnnualBasic" +annualbasic);
		return annualbasic;
	}
	public double getMonthlyGrossSalary()
	{
		monthlygrosssalary=monthlybasic+hra+medical+conveyance;
		System.out.println("MonthlyGrossSalary"  +monthlygrosssalary);
		return monthlygrosssalary;
	}
	public double getAnnualGrossSalary()
	{
		annualgrosssalary= 12 * monthlygrosssalary;
		System.out.println("AnnualGrossSalary"  +annualgrosssalary);
		return annualgrosssalary;
	}
	public double getMonthlyDeductions()
	{	
		if(monthlybasic<=6500)
		{
			pf=(monthlybasic*10)/100;
			System.out.println("pf is"+pf);
		}
		if(monthlybasic<=5000)
		{
			esic=(4.75*monthlybasic)/100;
			System.out.println("esic is"+esic);
		}
		if(monthlygrosssalary<=10000)
		{
			proftax=monthlygrosssalary-100;
		}
		else
		{
			proftax=monthlygrosssalary-50;
		}
		
			
		
		monthlydeducations=pf+esic+proftax;
		System.out.println("MonthlyDeductions"  +monthlydeducations);
		return monthlydeducations;
	}
	public double getMonthlyTakeHome()
	{
		monthlytakehome=monthlygrosssalary-monthlydeducations ;
		System.out.println("MonthlyTakeHome"  +monthlytakehome);
		return monthlytakehome;
	}
	public double getAnnualTakeHome()
	{
		annualtakehome= 12 *monthlytakehome;
		System.out.println("AnnualTakeHome"  +annualtakehome);
		return annualtakehome;
	}
	public void display()
	{
		System.out.println("enter employeeid"  +employeeid);

		System.out.println("enter employeename"  +employeename);
		
		System.out.println("enter monthlybasic"  +monthlybasic);
	}
	
}
			                      