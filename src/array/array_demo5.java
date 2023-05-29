package array;

import java.util.Arrays;

public class array_demo5 
{
public static void main(String[] args) 
{
	int ar[]= {10,20,40,30,60};//array declaration &initilazation in single line
	
	System.out.println("length="+ar.length);
	
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);
	
	System.out.println("--print all int in asending ---");
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
}
}
