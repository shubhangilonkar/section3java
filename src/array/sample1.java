package array;

import java.util.Arrays;

public class sample1 
{
public static void main(String[] args) 
{
	//array declaration
	String ar[]=new String[5];
	ar[0]="rajesh";
	ar[1]="ramesh";             //array initialization
	ar[2]="suresh";
	ar[3]="mahesh";
	ar[4]="ganesh";
			
	
	//array uses
	
	System.out.println(ar.length);
 System.out.println(ar[1]);
 System.out.println(ar[4]);
 
 System.out.println("-------------print all data---------------");
 
 
// for(int i=0;i<=4;i++) 
// {
//	 
//	System.out.println(ar[i]); 
// }
// 
 for(int i=0;i<=ar.length-1; i++) 
 {
	 System.out.println(ar[i]);
 }
 Arrays.sort(ar);
 System.out.println("-------------print all info in asending order------------");
 
 for(int i=0;i<=ar.length-1;i++) 
	 
 {
	 
	 System.out.println(ar[i]);
 }
 
}
}
