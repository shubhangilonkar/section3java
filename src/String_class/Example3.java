package String_class;

public class Example3 
{
	public static void main(String[] args) 
	{
		String s1="this is an interview";
		String s2="selenium";
		String s3="JAVA";
		String s4="java";
		
		System.out.println(s2.length());
		System.out.println(s1.isEmpty());
		System.out.println(s2.charAt(3));
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s2.lastIndexOf('m'));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s1.replace("is", "are"));
		System.out.println(s2.concat(s3));
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(2, 6));
		System.out.println(s1.endsWith("interview"));
		System.out.println(s1.startsWith("this"));
		System.out.println(s1.contains("an"));
		
	}

}
