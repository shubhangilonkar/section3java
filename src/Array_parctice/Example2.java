package Array_parctice;

import java.util.Arrays;

public class Example2 
{
public static void main(String[] args) 
{
	//array declaration & initilazition
	int ar[]= {20,40,60,10,50,70};
	
	System.out.println(ar.length);
	System.out.println(ar[4]);
	
	System.out.println("---printn all data----");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);
	System.out.println("--print all data in ase order---");
	for(int i=0;i<=ar.length-1;i++) 
	{
		
		System.out.println(ar[i]);
	}
	System.out.println("--print all data in desc order---");
	for(int i=ar.length-1;i>=0;i--) 
	{
		
		System.out.println(ar[i]);
	
	}
	
}
}
