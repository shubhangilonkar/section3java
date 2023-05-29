package array;

public class Example1_int 
{
public static void main(String[] args)
{
	//array declaration
	int ar[]=new int[5];
	//array initialization
	ar[0]=30;
	ar[1]=20;
	ar[2]=40;
	ar[3]=10;
	ar[4]=50;
	
	System.out.println(ar.length);
	System.out.println("-------print all int array------------");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
		
	}
		
	System.out.println("-------print all int in reverse order---------");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
}
}
