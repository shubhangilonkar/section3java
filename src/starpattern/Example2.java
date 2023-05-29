package starpattern;
//*
//**
//***
public class Example2 
{
public static void main(String[] args) 
{
 int	star=1;
 
 for(int i=1;i<=3;i++)                  //  --->rows
 {
	 for(int j=1;j<=star;j++)                    //colm
	 {
		 System.out.print("*");
	 }
	 System.out.println();
	 star++;
 }
}
}
