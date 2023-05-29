package Exception_handle;

public class Sampl5 
{

	public static void main(String[] args)
	{
		String s="pardu";

		//System.out.println(s.charAt(6)); risky code 
		try 
		{
			System.out.println(s.charAt(6));
		}
		catch (StringIndexOutOfBoundsException e1) 
		{
			System.out.println(s.charAt(2));//alternate solu
			
			System.out.println("StringIndexOutOfBoundsExceptionhandle");
		}
		System.out.println("hi");
		
		System.out.println("hello");
	}
}
