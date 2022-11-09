package week2day2;

public class Intersection 
{
	public static void main(String[] args)
	{
	int[] arr1={3,2,11,4,6,7};
	int[] arr2={1,2,8,4,9,7};
	int n1=arr1.length;
	int n2=arr2.length;
	
	for(int i=0;i<n1;i++)
	{
		for(int j=0;j<n2;j++)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.println(arr1[i]);
			}
		}
	}

}
}
