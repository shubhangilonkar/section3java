package Exception_handle;

public class demo2 
{
public static void main(String[] args) 
{
	int ar[]= {10,20,30,40};
	
	//System.out.println(ar[5]);-----------risky code
	
	try 
	{
		System.out.println(ar[5]);     //----------->risky code

	}
	catch(ArrayIndexOutOfBoundsException s1) 
	{
		System.out.println("ArrayIndexOutOfBounds Exception handle");
	}
	
	System.out.println("hiii");
	System.out.println("hello");
}

}
