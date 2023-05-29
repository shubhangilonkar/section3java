package Exception_handle;

public class demo3 
{
public static void main(String[] args) 
{
	int ar[]= {12,23,34,45};
	
	//System.out.println(ar[6]);
	
	try
	{
		System.out.println(ar[6]);//---->risky code

	}
	catch(StringIndexOutOfBoundsException e) 
	{
		System.out.println("StringIndexOutOfBounds Exception handle");
	}
	catch(ArrayIndexOutOfBoundsException e) 
	{
		System.out.println("ArrayIndexOutOfBounds Exception handle ");
	}
	catch(ArithmeticException e) 
	{
		System.out.println("Arithmetic Exception handle");
	}
}

}
