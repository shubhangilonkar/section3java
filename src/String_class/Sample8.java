package String_class;

public class Sample8
{
public static void main(String[] args) 
{
	String s1="my name is shubhangi";
	String ar[]=s1.split(" ");
	
	System.out.println(s1.replace("shubhangi", "lawange"));
	System.out.println(s1.startsWith("my"));
	System.out.println(s1.endsWith("is"));
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
}
}
