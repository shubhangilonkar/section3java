package array;

public class Sampl5_array 
{
public static void main(String[] args) 
{ 
//    0  1  2  3
//	0 20 30 40 50
//	1 60 10 50 70
//	2 30 90 80 10
	
	
	int ar[][]= {{20,30,40,50},{60,10,50,70},{30,90,80,10}};
	for(int i=0;i<=2;i++)           //row
	{
		for(int j=0;j<=3;j++) 
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
