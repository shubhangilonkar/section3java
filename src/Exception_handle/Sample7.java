package Exception_handle;

public class Sample7 
{
	public static void main(String[] args)
	{
		int ar[]= {10,20,30,40};
		
		
		//System.out.println(ar[5]);risky code 
		
		try
		{
			System.out.println(ar[5]);
			
		}
		catch(ArrayIndexOutOfBoundsException s1) 
		{
			System.out.println(ar[2]);    //alternate sol
			
			System.out.println("ArrayIndexOutOfBoundsExceptionhandle");
		}
		
		

		System.out.println("print array index");
	}

}
