package Exception_handle;

public class demo1 
{
public static void main(String[] args) 
{
	String s1="shubhangi";
	
	//System.out.println(s1.charAt(9));             //risky code
	
	try
	{
		System.out.println(s1.charAt(9));             //risky code

	}
	catch (StringIndexOutOfBoundsException e) 
	{
		System.out.println("StringIndexOutOfBounds Exception handle");
	}
	
	System.out.println("hiii");
	System.out.println("hello");
	
}
}
