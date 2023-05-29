package Exception_handle;

public class Sample2 
{
public static void main(String[] args) 
{
	int ar[]= {40,30,20,10};
	
	
	try 
	{
		System.out.println(ar[5]);//risky code
	}
catch (ArrayIndexOutOfBoundsException s1) 
	{
	 System.out.println(ar[0]);//altr sol
	 
	 System.out.println("Array index oue of bound exception handle");
	}
	
	
	
	System.out.println("heloo guys");
	
	
	
	
}
}
