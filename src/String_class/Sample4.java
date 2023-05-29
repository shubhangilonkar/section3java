package String_class;

public class Sample4
{
public static void main(String[] args) 
{
	String s5= "my name is shubhangi";
	String ar[]= s5.split(" ");
	
	System.out.println(ar.length);
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	
}
}
