//10.Write a Java Program to Move all Zero to End of the Array. 

class ZerotoEnd
{
	public static void main(String args[])
	{
	
	int arr[]={0,1,2,3,4,0,0,3,6,7};
	int temp=0;
	for(int x=0;x<arr.length;x++)
	{
		for(int y=x;y<arr.length;y++)
		{
			if (arr[x]==0)
			temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
	}
	System.out.println(arr);
	}
}