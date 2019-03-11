
public class Bubblesort 
{
	public static void main(String[] args)
	 {
		int[] array= {5,12,14,6,78,19,23,26,35,37,52,86,47};
		for(int i=0;i<array.length-1;i++)
			{
			for(int j=0;j<array.length-1-i;j++)
				{
				if(array[j]>array[j+1])
					{
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;

					}
				}
System.out.println(array[i]);
		}

	}

}

