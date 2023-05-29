package array;

public class Example_largestandsmallest_number 
{
public static void main(String[] args)
{
	int ar[]= {25,30,40,10,60};
	//         0   1  2  3  4
	
	int max=ar[0];
	for(int i=1;i<ar.length;i++)
	{
		if(ar[i]>max) //30>25
		{
			max=ar[i];//i=30
		}
	}
	System.out.println(max+"maximum number in array is" );
	
	int min=ar[0];
	for(int i=1;i<ar.length;i++) 
	
	{
		if(ar[i]<min) //25>30
		{
			min=ar[i];
		}
	}
	System.out.println(min+"min number in array");

	
	

	
	
	
	
	
}
}