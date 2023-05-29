package String_class;

public class Sample6 
{
public static void main(String[] args) 
{
String s1="automation";
String s2="";
String s3="abcd";
String s4="ABCD";
String s5="i practice for java";

System.out.println(s1.length());
System.out.println(s2.isEmpty());
System.out.println(s1.charAt(3));
System.out.println(s1.indexOf('m'));
System.out.println(s1.lastIndexOf('t'));
System.out.println(s3.equals(s4));
System.out.println(s3.equalsIgnoreCase(s4));
System.out.println(s3.toUpperCase());
System.out.println(s4.toLowerCase());
System.out.println(s5.endsWith("java"));
System.out.println(s5.startsWith("i"));
System.out.println(s1.substring(4));
System.out.println(s1.substring(1, 6));
System.out.println(s1.concat(s3));
System.out.println(s5.replace("java", "selenium"));

}
}