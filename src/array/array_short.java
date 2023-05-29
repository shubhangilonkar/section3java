package array;

import java.util.Arrays;

public class array_short 
{
public static void main(String[] args) 
{
	int ar[]=new int[4];
	ar[0]=121;
	ar[1]=122;
	ar[2]=124;
	ar[3]=126;
	
	System.out.println(ar.length);
	
	System.out.println("-------print array all int ---------");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	Arrays.sort(ar);
	
	System.out.println("---------print all info in asending order-------------");
	
	for(int i=0;i<=3;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("----print all info in desending order----");
	for(int i=ar.length-1;i>=0;i--) 
	{
		System.out.println(ar[i]);
	}
	
}
}
