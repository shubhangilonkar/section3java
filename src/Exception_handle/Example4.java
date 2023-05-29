package Exception_handle;

public class Example4 
{
public static void main(String[] args) 
{
	int ar[]= {1, 4, 5, 7,8,9};
	
	//System.out.println(ar[9]);//risky code 
	
	
	try 
	{
		System.out.println(ar[9]);//risky code 
		
	}
	
	catch (Exception e) 
	{
		 e.printStackTrace();
	}
	
	System.out.println("hiii");
	System.out.println("good morning");
}
}
