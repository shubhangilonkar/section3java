package Logical_pogram;
//this is an interview
public class Example_longest_string 
{
public static void main(String[] args)
{
	String s1="this is an interview";
	String ar[]=s1.split(" ");
	
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("longest string in sentence"+ ":= "+ ar[3]);
}
}
