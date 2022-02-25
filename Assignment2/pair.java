//17.Find the pair of elements(X+Y) in the array whose sum is equal to given number Z. 
import java.util.*;  

class pair
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		Scanner n= new Scanner(System.in);     
		System.out.println("Enter a number between 7 and 15 - ");  
		int number = n.nextInt(); 
	
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < b.length ; j++)
			{
				if(( a[i] + b[j] ) == number )
				{
					System.out.println( a[i] + "and" + b[j] );
				}
				else
				{
					System.out.println(" ");
				}
			}
		}
	}
}
