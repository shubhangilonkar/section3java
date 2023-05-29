package Exception_handle;

public class Example1 
{
public static void main(String[] args) 
{
	int ar[]= {20,39,40,10};
	
           // System.out.println(ar[7]);//risky code

	try 
	{
		System.out.println(ar[7]);//risky code
	}
	catch (StringIndexOutOfBoundsException e) 
	{
		System.out.println("StringIndexOutOfBounds Exception handle");
	}
	
	catch (ArrayIndexOutOfBoundsException e) 
	{
		System.out.println("ArrayIndexOutOfBounds Exception handle ");
		
	}
	catch (ArithmeticException e) 
	{
       System.out.println("Arithmetic Exception handle");
}
	System.out.println("hii");
	System.out.println("hello");

}
}