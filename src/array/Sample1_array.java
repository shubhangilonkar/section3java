package array;

public class Sample1_array 
{
public static void main(String[] args) 
{
	//array declaration
	String ar[]=new String[5];
	//array initilazation
	ar[0]="rahul";
	ar[1]="amar";
	ar[2]="dev";
	ar[3]="om";
	ar[4]="ram";
	
	//array uses
	System.out.println(ar.length);
	System.out.println(ar[3]);
	System.out.println(ar[0]);
	System.out.println("--print all data---");
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	
}
}
