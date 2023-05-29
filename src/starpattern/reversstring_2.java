package starpattern;

public class reversstring_2 
{
public static void main(String[] args)
{
	//selinum
	String org ="selinum";//muniles
	String rev ="";  
	
	for(int i= org.length()-1;i>=0;i--) 
	{
		rev=rev+org.charAt(i);
		
	}
	System.out.println("org String:="+org);
	System.out.println("rev String:="+rev);
	
	if(org.equals(rev))
	{
		System.out.println("Gien String is palindrome");
	}
	else
	{
		System.out.println("Gien String is not  palindromei");
	}
	
	
}
}
