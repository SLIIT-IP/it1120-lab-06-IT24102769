import java.util.Scanner;
public class IT24102769Lab6Q1
{
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a number:");
   double num=sc.nextDouble();

   double sqr= num*num;
   double sqrt=Math.sqrt(num);
 
   System.out.println("The square of "  +num+ " is "+sqr);
   System.out.println("The square root of "  +num+ " is "+sqrt);
  }
}

   