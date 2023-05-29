package array;

import java.util.Arrays;

public class array_demo6 
{
public static void main(String[] args)
{
	String ar[]= {"raju","gaju","aaju","viju"};
	
	
	System.out.println("length="+ar.length);
	
	
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);
	
	System.out.println("---print asending order");
	
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	
	
	
	
}
	
	
	
}
