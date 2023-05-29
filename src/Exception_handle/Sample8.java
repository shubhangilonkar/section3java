package Exception_handle;

public class Sample8 
{
	public static void main(String[] args) 
	{
		String ar[]= {"sanu","manu","rohu"};
		
		
		//System.out.println(ar[4]); risky code 
	try
	{
		System.out.println(ar[4]);
	}	
	catch(ArrayIndexOutOfBoundsException s1) 
	{
		System.out.println(ar[0]);   //alternate sol
		
		System.out.println("ArrayIndexOutOfBoundsExceptionhandle");
	}	
		
	
		System.out.println("manu is  a girl");
	}

}
