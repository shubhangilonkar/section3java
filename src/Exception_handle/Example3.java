package Exception_handle;

public class Example3 
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=0;
		int div=0;
		
		
		try
		{
			div=num1/num2;
			System.out.println(div);//risky code
		}
		catch(ArithmeticException s2) 
		
		{
			
			System.out.println("Arithmetic Exception handle");
			
			System.out.println(div);//altre solution
		}
		
		System.out.println("good night");
		
	}

}
