//5.Write a Java Program to find the Intersection of two arrays.

class intersactionArrays 
{
   public static void main(String args[]) 
	{
		int arr1[] = {2,4,6,8,10,12,14,16,18,20};
		int arr2[] = {1,2,3,4,5,6,7,8,9,10};
		int m = arr1.length;
		int n = arr2.length;
		int i = 0, j = 0;
		System.out.print("Array 1 is ");
		for(int k = 0; k < m; k++) 
		{
			System.out.print(arr1[k] + " "); 
		}
		System.out.print("\n");
		System.out.print("Array 2 is ");
		for(int k = 0; k < n; k++) 
		{
			System.out.print(arr2[k] + " ");
		}
		System.out.print("\n");
		System.out.print("Intersection of two arrays is ");
		while (i < m && j < n) 
		{
			if (arr1[i] < arr2[j])
            i++;
			else if (arr2[j] < arr1[i])
            j++;
			else 
			{
				System.out.print(arr2[j++]+" ");
				i++; 
			}
		}
   }
}