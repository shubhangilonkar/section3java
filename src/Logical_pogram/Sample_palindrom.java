package Logical_pogram;

public class Sample_palindrom 
{
	public static void main(String[] args) 
	{
		String org="madam";//
		String rev="";
		for(int i=org.length()-1;i>=0;i--) 
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		
		if(org.equals(rev))
		{
			System.out.println("is palindrom");
		}
		else {
			System.out.println("is not palindrom");
			
		}
		
	}

}
