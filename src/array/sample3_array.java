package array;

import java.util.Arrays;

public class sample3_array 
{
public static void main(String[] args) 
{
	int ar[]= {20,40,50,30,70,10};
	
	System.out.println(ar.length);
	
	System.out.println("---print all data---");
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	Arrays.sort(ar);
	System.out.println("---print all data in asending order--");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
		
	}
	
	System.out.println("---print all data in desc order---");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
}
}
