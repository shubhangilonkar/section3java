package Exception_handle;

public class Sample4 
{
public static void main(String[] args) 
{
	String s2="shubhangi";
	
	//System.out.println(s2.charAt(9));risky code 
	
	try
	{
		System.out.println(s2.charAt(9));
	}
	catch(StringIndexOutOfBoundsException e1)
	{
		System.out.println("String Index Out Of Bounds Exception handle"); 
	}
	System.out.println("heloo everyone");
	
	System.out.println("what are u donig");
	
}
}
