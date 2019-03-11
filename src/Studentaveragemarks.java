import java.util.Scanner;
class Studentaveragemarks
{
	public static void main(String [] args)
	{
		int students;
		int subjects;
		int total=0;
	Scanner input=new Scanner(System.in);
	System.out.println("enter no studentds");
	students=input.nextInt();
	System.out.println("enter no of subjects");
	
	
	subjects=input.nextInt();
	int marks[][]=new int[students][subjects];
	for(int i=0;i<students;i++)
	{
		for(int j=0;j<subjects;j++)
		{
			
		marks[i][j]=input.nextInt();
		}
	}
	for(int i=0;i<students;i++)
	{
		for(int j=0;j<subjects;j++)
		{
			
			total=total+marks[i][j];
		}
	System.out.println("print total"+total);
	System.out.println("print average"+total/subjects);
	}
	}
}