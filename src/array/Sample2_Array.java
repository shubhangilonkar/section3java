package array;

import java.util.Arrays;

public class Sample2_Array 
{
public static void main(String[] args) 
{
	
	
	int ar[]=new int[5];
	ar[0]=30;
	ar[1]=60;
	ar[2]=40;
	ar[3]=10;
	ar[4]=50;
	
	System.out.println(ar.length);
	System.out.println(ar[1]);
	System.out.println("--print all data ---");
	
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
 Arrays.sort(ar);
 
System.out.println("--print all datat in asending---");
 for(int i=0;i<=ar.length-1;i++) 
 {
	 System.out.println(ar[i]);
 }
 System.out.println("--print all datat in desending---");
 
 for(int i=ar.length-1;i>=0;i--)
 {
	 System.out.println(ar[i]);
 }

}
}
