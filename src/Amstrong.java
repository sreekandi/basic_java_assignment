import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		int value;
		int sum=0;
		int reverse;
		
		System.out.println("enter the amstrong value");
		Scanner input=new Scanner(System.in);
		value=input.nextInt();
		int number = value;
		
		while(value!=0)
		{
			reverse=value%10;
			sum=sum+ reverse*reverse*reverse;
			   value=value/10;

		}
		if(sum==number)
		{
			System.out.println("number is amstrong"+number);
		}
		else
		{
			System.out.println("number is not amstrong"+number);
		}
		
	}

}
