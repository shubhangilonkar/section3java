
package Array_parctice;

import java.util.Arrays;

public class Example1 
{
public static void main(String[] args) 
{
	//array declaration
	String ar[]=new String[5];
	//array initilazation
	ar[0]="sanu";
	ar[1]="rahul";
	ar[2]="pihu";
	ar[3]="pooja";
	ar[4]="neha";
	System.out.println(ar.length);
	System.out.println(ar[2]);
	System.out.println("---print all data-----");
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	Arrays.sort(ar);
	System.out.println("---print all data in asencing---");
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("---print all data in desending---");
	for(int i=ar.length-1;i>=0 ; i--) 
	{
		System.out.println(ar[i]);
	}
}
}
