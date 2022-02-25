//2.Find the second largest number in the given array. 

class secondLargestNumber
{
	public static void main(String args[])
	{
		int temp, size;
        int array[] = {10, 20, 30, 40, 50};
        size = array.length;
		System.out.println(size);

		for(int i = 0; i<size; i++ )
		{
			for(int j = i+1; j<size; j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
            }        
        }
		System.out.println("Second largest number in the given array is "+array[size-2]);
   }
}