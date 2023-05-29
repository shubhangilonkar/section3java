package Exception_handle;

public class Example7 
{

public static void main(String[] args) 
{
	int num1=10;
	int num2=0;
	int div=0;
	
	//div =num1/num2;
	//System.out.println(div);//risky code
	try 
	{
		div =num1/num2;
		System.out.println(div);//risky code
	}
	catch(Exception e)
	{
		e.printStackTrace();//method
		
		System.out.println("generic Exception handle");
	}
	
	System.out.println("hiii");
	System.out.println("hello");
	
}
}
