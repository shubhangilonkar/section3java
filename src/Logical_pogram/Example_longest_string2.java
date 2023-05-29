
package Logical_pogram;

import java.util.Arrays;

public class Example_longest_string2 
{
public static void main(String[] args) 
{
	String s1="my name is shubhangi";
	
	String ar[]=s1.split(" ");

	for(int i=0;i<=ar.length-1;i++) 
	{
		Arrays.sort(ar);
		System.out.println(ar[ar.length-1]);
		break;
	}
}
}
