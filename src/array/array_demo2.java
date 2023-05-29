package array;

public class array_demo2 
{
	public static void main(String[] args) 
	{
		//array declaration
		int ar[]=new int[4];
		//intilazation
		ar[0]=20;
		ar[1]=10;
		ar[2]=40;
		ar[3]=30;
	
		System.out.println("length="+ar.length);
		
		System.out.println(ar[2]);
		
		System.out.println("---print all int info------");
	
		for(int i=0;i<=ar.length-1;i++) 
		{
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
