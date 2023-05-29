package Array_parctice;

import java.util.Arrays;

public class Example4 
{
public static void main(String[] args) 
{
	int ar[]= {10,25,50,80,100,200,300};
	
	
	System.out.println(ar.length);
	
	Arrays.sort(ar);
	
	System.out.println("----print datta in asc order---");
	
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("min number is "+ar[0]);
	System.out.println("max number is "+ar[6]);
}
}
