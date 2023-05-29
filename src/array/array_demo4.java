package array;

import java.util.Arrays;

public class array_demo4
{
	public static void main(String[] args) 
	{
		//array declaration
				int ar[]=new int[4];
				//intilazation
				ar[0]=20;
				ar[1]=10;
				ar[2]=40;
				ar[3]=30;
			System.out.println("length="+ar.length);
			
			System.out.println("---print all int info in reverse--"); 
			
			for(int i=ar.length-1;i>=0;i--) 
			{
				System.out.println(ar[i]);
			}
			Arrays.sort(ar);
System.out.println("---print all int info in dsending--"); 
			
			for(int i=ar.length-1;i>=0;i--) 
			{
				System.out.println(ar[i]);
			}
System.out.println("---print all int info in asending--"); 
			
			for(int i=0 ;i<=ar.length-1;i++) 
			{
				System.out.println(ar[i]);
			}
			
			
			
	}
	

}
