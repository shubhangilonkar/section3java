package Exception_handle;

public class demo4
{
public static void main(String[] args) 
{
      int	num1=10;
      int num2=0;
      int div;
      
//   div=   num1/num2;
//   System.out.println(div);
   
   try
   {
	   div=   num1/num2;
	   System.out.println(div);           //risky code
   }
   catch(ArithmeticException s1)
   {
	   System.out.println("Arithmetic Exception handle ");
   }
   
   System.out.println("hii");
   System.out.println("have nice day");
}

}
