package String_class;

public class Example2
{
public static void main(String[] args) 
{
	String s1="my name is shubhu";
	String ar[]=s1.split("");
	
	System.out.println(ar[2]);
	
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(i);
	}
}
}
