package array;

import java.util.Arrays;

public class Example7 
{
public static void main(String[] args) 
{
	int ar[]= {10,30,40,50,60,80};
	      //    0  1  2  3  4  5
	System.out.println("--print all info in array---");
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("---print all info in reverse order--");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]); 
		
	}
	
	Arrays.sort(ar);
	
	System.out.println("---print all info in asending order---");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
		
	}
	
	System.out.println("--print all info in desnding order--");
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]); 
		
	}
}

}
