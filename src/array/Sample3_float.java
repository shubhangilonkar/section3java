package array;

public class Sample3_float 
//we have declare student per
{
public static void main(String[] args)
{
	//array declaration
	float s1[]=new float[5];
	
	//array initialize
	s1[0]=65.5f;
	s1[1]=66.5f;
	s1[2]=67.8f;
	s1[3]=68.9f;
	s1[4]=69.9f;
	
	//array uses
	System.out.println("--------print length of array--------");
	
	System.out.println(s1.length);
	
	System.out.println("-------print all student per------");
	
	for(int i=0;i<=s1.length-1;i++) 
	{
		System.out.println(s1[i]);
	}
	
	
}
}
