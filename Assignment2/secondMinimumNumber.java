//3.Find the second minimum number in the given array. 
class secondMinimumNumber
{
	public static void main(String args[])
	{
		int temp, size;
        int array[] = {10, 20, 30, 40, 50};
        size = array.length;

		for(int i = 0; i<size; i++ )
		{
			for(int j = i+1; j<size; j++)
			{
				if(array[i]<array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
            }        
        }
		System.out.println("Second minimum number in the given array is "+array[size-2]);
   }
}