
public class Armstrongnumber {

	public static void main(String[] args) {
	
		
for(int i=100;i<999;i++)
{
	int  temp=i;
	int result=0;
	int result1;
	while(temp!=0)
	{
		result1=temp%10;
		result=result+result1*result1*result1;
		temp=temp/10;
		
	}
	if(result==i) {
		System.out.println("amstrong values"+i);
	}
		}
	}

}
