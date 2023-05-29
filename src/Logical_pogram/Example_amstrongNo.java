package Logical_pogram;

public class Example_amstrongNo 
{
public static void main(String[] args) 
{
	//153
	
	int no=153;
	int t1=no;
	int leng=1;
	while(t1!=0)
		{
		 t1=t1/10;
		 leng =leng+1;
		}
	System.out.println(leng);
}
}
