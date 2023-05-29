package starpattern;

public class Sample_reverse_String 
{
	public static void main(String[] args) 
	{
		//abcd
		String org="abcd";     //dcba
		String rev="";
		for(int i=org.length()-1; i>=0;i-- ) 
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		
	}

}
