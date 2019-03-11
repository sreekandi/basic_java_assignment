public class Employeedetails
{
	
	public static void main(String[] args)
	{
		
		EmployeeSalaryDetails obj1=new EmployeeSalaryDetails(174739,"sreevidhya",2500.0);
		obj1.display();
		obj1.getAnnualBasic();
		obj1.getMonthlyGrossSalary();
		obj1.getAnnualGrossSalary();
		obj1.getMonthlyDeductions();
		obj1.getMonthlyTakeHome();
		obj1.getAnnualTakeHome();
	}
}