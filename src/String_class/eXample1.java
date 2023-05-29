package String_class;

public class eXample1
{

	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="";
		String s3="abcd";
		String s4="ABCD";
		String s5="my name is abc";
		String s6="abcabcd";
		
		System.out.println(s1.length());         //8
		System.out.println(s2.isEmpty());           //true
		System.out.println(s3.isEmpty());          //false
		System.out.println(s3.toUpperCase());         //ABCD
		System.out.println(s4.toLowerCase());           //abcd
		System.out.println(s3.equals(s4));               //false
		System.out.println(s3.equalsIgnoreCase(s4));      //true
		System.out.println(s5.contains("my"));
		System.out.println(s1.charAt(4));
		System.out.println(s6.lastIndexOf('a'));
		System.out.println(s6.indexOf('c'));
		System.out.println(s6.lastIndexOf('c'));
		System.out.println(s5.startsWith("my"));
		System.out.println(s5.startsWith("is"));
		System.out.println(s5.endsWith("abc"));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(1, 5));
		System.out.println(s1.substring(2, 7));
		System.out.println(s3+s4);
		System.out.println(s3.concat(s4));
		System.out.println(s5.replace("abc", "sanu"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
