package array;

public class Example3multidimen_array 
{
public static void main(String[] args) 
{    // 0  1  2  3
	//0 34 45 56 37
	//1 24 48 78 94
	//2 12 34 66 87
	
	int ar [][]=new int[3][4];
	
	ar [0][0]=34;
	ar[0][1]=45;
	ar[0][2]=56;
	ar[0][3]=37;
	ar[1][0]=24;
	ar[1][1]=48;
	ar[1][2]=78;
	ar[1][3]=94;
	ar[2][0]=12;
	ar[2][1]=34;
	ar[2][2]=66;
	ar[2][3]=87;
	
	
	for(int i=0;i<=2;i++)//outer loop--->rows
	{
		for(int j=0;j<=3;j++)//inner for loop--->colom
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
