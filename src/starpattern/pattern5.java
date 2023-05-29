package starpattern;

public class pattern5 
{
//*
//**
//***
	
	public static void main(String[] args)
	{
		int star=1;//2
		//2<=3
		for(int i=1;i<=3;i++)   //--->rows 
		{
			for(int j=1;j<=star;j++) //---->col
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		
	}
	
}//*
