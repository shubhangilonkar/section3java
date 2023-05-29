package Exception_handle;

public class Sample10
{
public static void main(String[] args)
{
	int num1=10;
	int num2=0;
	int div=0;
	
	//div=num1/num2;
	//System.out.println(div);risky code
	
	try 
	{
		div=num1/num2;
		System.out.println(div);		
	}
	catch(ArithmeticException s1) 
	{
	
	System.out.println("ArithmeticExceptionhandle");
	System.out.println(div);
	
	}
	System.out.println("hello");
	
	
}
}
