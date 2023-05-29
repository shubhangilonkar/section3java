package array;

import java.util.Arrays;

public class array_demo3 
{
public static void main(String[] args)
{
//array declaration
	String ar[]=new String[5];
	//array initilazation
	ar[0]="sanu";
	ar[1]="manu";
	ar[2]="tanu";
	ar[3]="ram";
	ar[4]="syam";
	
	System.out.println("---print all info in reverse order----");
	for(int i=ar.length-1;i>=0;i--) 
	{
		System.out.println(ar[i]);
		
	}
	
	System.out.println(ar.length);
	
	Arrays.sort(ar);
	
	System.out.println("-----print all info in asending order---------");
	
	for(int i=0;i<=ar.length-1;i++) 
	{
	System.out.println(ar[i]);	
		
	}
	System.out.println("--print all info in desnding order");
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	
	
}
}
