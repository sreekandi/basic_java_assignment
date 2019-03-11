import java.util.Scanner;

public class Simple_Compound_Interest {
	public static void main(String[] args) {
	double si,ci;
	double p,t,r;
	System.out.println("enter the values");
		Scanner input=new Scanner(System.in);
		p=input.nextDouble();
		t=input.nextDouble();
		r=input.nextDouble();
		si=(p*r*t)/100;
		ci=p*(Math.pow(1+(r/100),t));
		System.out.println("Simple interest"+si);
		System.out.println("compound intrest"+ci);
		
	}

}
