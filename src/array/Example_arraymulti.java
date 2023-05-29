package array;

public class Example_arraymulti 
{
public static void main(String[] args) 
{
	//  0   1  2  3
	//0 20 30 40 10
	//1 80 50 60 70
	
	int ar[][]= {{20,30,40,10},{80,50,60,70}};
	
	
	for(int i=0;i<=1;i++)        //outer for loop--->rows
	{
		for(int j=0;j<=3;j++)     //inner for loop--->colom
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
}
}
