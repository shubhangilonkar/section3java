package array;

public class Example5largestsmallestnumber
{
public static void main(String[] args)
{
	int s1[]= {12,23,45,67,89,56,};
	        // 0   1  2  3  4  5
	
	int max=s1[0];
	int min=s1[0];
	
	for(int i=1;i<s1.length;i++) 
	{
		if(s1[i]>max) 
		{
			max=s1[i];
		}
	}

	System.out.println(max+ " "+"max number in array");
	
	
	for(int i=1;i<s1.length;i++) 
	{
		if(s1[i]<min) 
		{
			min=s1[i];
		}
	}
	System.out.println(min+" "+ "min nubmer in array");
}

}
