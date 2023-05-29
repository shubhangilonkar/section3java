package Logical_pogram;

public class Example1 
{
	//madam
	public static void main(String[] args) 
	{
		String org="java";           //avja
		String rve="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rve=rve+org.charAt(i);
			}
		
		System.out.println(rve);
		
		if(org.equalsIgnoreCase(rve)) 
		{
			System.out.println("given string is palindrom");
		}
		else
		{
			System.out.println("given string is not palindrom");
		}

		
		
	}

}
