package array;

import java.util.Arrays;

public class Example2
{
public static void main(String[] args) 
{
	int ar[]= {20,30,50,40,10};
	
	System.out.println(ar.length);
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
		
	}
	Arrays.sort(ar);//classname.methodename();
	System.out.println("----print all info in asending---");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
		
	}
}
}
