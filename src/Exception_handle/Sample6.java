package Exception_handle;

public class Sample6 
{
public static void main(String[] args) 
{
	String s1="ABCDE";
	
	//System.out.println(s1.charAt(6));risky code 
	
	try 
	{
		System.out.println(s1.charAt(6));
	}
	catch(StringIndexOutOfBoundsException e1)
	{
		System.out.println("StringIndexOutOfBoundsExceptionhandle");
	}
	
     System.out.println("good night");
}
}
