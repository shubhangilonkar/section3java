package array;

import java.util.Arrays;

public class Sample6_Array 
{
public static void main(String[] args) 
{
	int ar[]= {40,50,80,90,10};
	
	//find highst no.of array and lowest
	
	Arrays.sort(ar);
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("lowest no.num");
	System.out.println(ar[0]);
	
}
}
	