package Logical_pogram;
// 0 1 2 3 5 8 13....
//sum of previous two no
public class Example_fibonaciSeries 
{
public static void main(String[] args) 
{
	
	int a=0;
	int b=1;
	int c;
	
	for(int i=1;i<=10;i++) 
	{
		c=a+b;
		System.out.println(c);
		
		a=b;
		b=c;
	}
	
}
}
