package Exception_handle;

public class Sample11 
{
public static void main(String[] args) 
{
	int num1=12;
	int num2=0;
	int div=0;
	
	
	//div =num1/num2;
	//System.out.println(div);  risky code
	try 
	{
		div =num1/num2;
		System.out.println(div);
	}
	catch(ArithmeticException ee2)
	{
		System.out.println(div);
		
               System.out.println("ArithmeticExceptionhandle");
	}
	
	System.out.println("hii");
	
}
}
