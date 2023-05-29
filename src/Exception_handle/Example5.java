package Exception_handle;

public class Example5
{
public static void main(String[] args)
{

	String s1="abcde";
	int ar[]= {1,3, 4,2,5};
	
	//System.out.println(s1.charAt(6));//risky code
	//System.out.println(ar[5]);
	
	try 
	{
		System.out.println(s1.charAt(6));//risky code
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("StringIndexOutOfBounds Exception handle ");
	}
	

	try 
	{
		System.out.println(ar[5]);//risky code
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBounds Exception handle");
	}
	System.out.println("good morn");
	
	
}
}
