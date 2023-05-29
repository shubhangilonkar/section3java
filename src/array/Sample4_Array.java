package array;

public class Sample4_Array 
{
public static void main(String[] args) 
{   //     0  1  3  4 -col
    //  0  10 20 30  40
   //   1   50 60 70 80------row
	
	int ar[][]= {{10 ,20 ,30 ,40} ,{50, 60 ,70, 80}};
	
	for(int i=0;i<=ar.length-1;i++)               //--- outer for loop /row
	{
		for(int j=0;j<=3;j++) //--inner for loop /colom
		{
			System.out.print(ar[i][j]+" ");

		}
		System.out.println();
		
	}
	
}  
}
