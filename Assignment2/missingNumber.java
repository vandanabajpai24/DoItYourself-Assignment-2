//4.Find the missing Number in the given array of 1 to N. 


import java.util.*; 
class missingNumber
{
	static void missingNumber(int arr[],int N)
	{
    int diff = arr[0] - 0;
    for(int i = 0; i < N; i++)
    {
        if (arr[i] - i != diff)
        {
            while (diff < arr[i] - i)
            {
                System.out.print((i + diff) + " ");
                diff++;
            }
        }
    }
}
 
public static void main (String[] args)
	{
		int arr[] = { 1,2,3,4,5,7,8,9,10};
		int N = arr.length;
		missingNumber(arr, N);
	}
}
 