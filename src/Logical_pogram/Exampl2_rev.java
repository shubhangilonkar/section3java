package Logical_pogram;

public class Exampl2_rev
{
public static void main(String[] args) 
{
	String org="madam"  ;  //madam
	String rev=""	;
	for(int i=org.length()-1;i>=0;i--) 
	{
		rev=rev+org.charAt(i);
		
	}
	System.out.println(rev);
	
	
	if(org.equals(rev))
	{
	  System.out.println("given string is palindrom");	
	  
	}
	else {
		System.out.println("given string is not palindrom");
	}
}
}
