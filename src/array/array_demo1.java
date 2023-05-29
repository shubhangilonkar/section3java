package array;

public class array_demo1 
{
public static void main(String[] args) 
{
	//array declaration
	String ar[]=new String[5];
	//array initilazation
	ar[0]="sanu";
	ar[1]="manu";
	ar[2]="tanu";
	ar[3]="ram";
	ar[4]="syam";
	
	System.out.println("length="+ar.length);
	
	//array uses
	System.out.println(ar[2]);
	
	System.out.println("--------print all String info---------");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	
}
}
