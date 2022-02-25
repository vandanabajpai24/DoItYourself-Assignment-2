//1.Calculate the average of given array. 
class arrayAverage 
{ 
    public static void main(String[] args) 
	{
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = array.length;
        int sum = 0;
        for (int i = 0; i < array.length; i++) 
		{
            sum = sum + array[i];
        }
        double average = sum / length;        
        System.out.println("Average of given array is "+average);
    } 
}
