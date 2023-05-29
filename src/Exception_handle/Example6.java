package Exception_handle;

public class Example6 
{
public static void main(String[] args)
{
   String s1="abcde";
    int ar[]= {1,3, 4,2,5};
  
    try
    {
    	
    	try
        {
        	
        	System.out.println(s1.charAt(6));//risky code
       
        } 
        catch(StringIndexOutOfBoundsException e) 
        {
        	System.out.println("StringIndexOutOfBounds Exception  handle");
        } 
         
          System.out.println(ar[9]);//risky code 
    } 
    catch(ArrayIndexOutOfBoundsException e) 
    {
    	System.out.println("ArrayIndexOutOfBounds Exception handle");
    } 
     System.out.println("hello gusy");
     System.out.println("have a nice day");
     
     
     
     
     
     
     
     
     
     
     
	
}
}
