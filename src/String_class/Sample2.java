package String_class;

public class Sample2 
{
public static void main(String[] args) 
{
	String s1="shubhangi";
	String s2="abcd";
	String s3="ABCD";
	String s4="my name is abc";
	String s5="";
	System.out.println(s1.length());
	System.out.println();
	System.out.println(s5.isEmpty());
	System.out.println(s4.contains("my"));
	System.out.println(s2.equals(s3));
	System.out.println(s2.equalsIgnoreCase(s3));
	System.out.println(s2.toUpperCase());
	System.out.println(s3.toLowerCase());
	System.out.println(s1.charAt(4));
	System.out.println(s1.indexOf('a'));
	System.out.println(s1.lastIndexOf('h'));
	System.out.println(s4.startsWith("my"));
	System.out.println(s4.endsWith("abc"));
	System.out.println(s1.substring(4));
	System.out.println(s1.subSequence(2, 6));
	System.out.println(s2.concat(s3));
}
}
