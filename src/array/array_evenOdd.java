package array;

public class array_evenOdd
{
public static void main(String[] args) 
{  
	int ar[]= {1,2,3,4,5,6,7,8,9};
	
	
	System.out.println("print odd number in array");
	
	for(int i=0;i<=ar.length-1;i=i+2)
	{
		System.out.println(ar[i]);
		
	}
	
	
System.out.println("print even number in array");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
		
	}
	
	
	
	
	
	
}

}
