package Array_parctice;

public class Example3 
{
	//10 ,20,30,40
	//50, 60,70,80
	
public static void main(String[] args) 
{
	int ar[][]={{10,20,30,40},{50,60,70,80}};
	
	for(int i=0;i<=ar.length-1;i++)     //--->row
	{
		for(int j=0;j<=3;j++)      //--->colm
			
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
}
}
