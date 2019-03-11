import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		System.out.println("enter key value");
		Scanner input=new Scanner(System.in);
		int [] elements= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int key;
		key=input.nextInt();
		boolean element=false;
		int i;
		for(i=0;i<elements.length;i++)
		{
			if(elements[i]==key)
			{
			element= true;
			break;
			}
		}
				if(element)
				{ 
					System.out.println("element is found"+key+" position of index is"+i);
				}
				else
				{
					System.out.println("element is not found");
				}
			}
		
	}


