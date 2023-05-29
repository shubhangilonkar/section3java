package Exception_handle;

public class Example2
{
public static void main(String[] args) 
{
	String s1="java";//0123
	
	//System.out.println(s1.charAt(5));//risky code 
	
	try 
	{
		System.out.println(s1.charAt(5));//risky code 
	}
	catch (StringIndexOutOfBoundsException e1) 
	{
		
	}
	catch (ArrayIndexOutOfBoundsException e2) 
	{
		
	}
	catch (ArithmeticException e3) 
	{
		
	}
	System.out.println("hii student");
	System.out.println("have a nice day");
	
	
}
}
