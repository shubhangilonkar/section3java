package Exception_handle;

public class Sample9 
{
public static void main(String[] args) 
{
	int a[]= {1,2 ,3, 4,5};
	
	//System.out.println(a[6]); risky code 
	
	try 
	{
		
		System.out.println(a[6]);
		
	}
	catch(ArrayIndexOutOfBoundsException e1) 
	{
		System.out.println("ArrayIndexOutOfBoundsExceptionhandle");
		
		System.out.println("array index:="+a[2]);
	}

	
	System.out.println("it is int array");
	
}
}
