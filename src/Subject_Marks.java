import java.util.Scanner;
public class Subject_Marks {
	public static void main(String[] args) {
		
	
	int subj1,subj2,subj3;
	System.out.println("enter all subjects");
	Scanner input=new Scanner(System.in);
	subj1=input.nextInt();
	subj2=input.nextInt();
	subj3=input.nextInt();
	if(subj1>60 && subj2>60 && subj3>60)
	{
	    System.out.println("all subjects pass");
	}
	else
	if(((subj1>60 && subj2>60 )|| subj3<60)||((subj1>60 && subj3>60 )|| subj2<60)||(subj1<60 || (subj2>60 && subj3>60)))
	{
	 System.out.println("promoted");
	}
	else
	{
	  System.out.println("fail");
	}

	}
}
