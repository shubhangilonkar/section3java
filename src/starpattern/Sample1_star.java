package starpattern;

public class Sample1_star 
{
	//****
	//***
	//**
	//*
	public static void main(String[] args) 
	{
		int star=4;
		for(int i=1;i<=4;i++)               //row
		{
			for(int j=1;j>=star;j++)                 //colm
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		
	}
	
	
	
	
}
