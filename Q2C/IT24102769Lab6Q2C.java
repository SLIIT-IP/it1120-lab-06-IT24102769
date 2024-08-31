import java.util.Scanner;
public class IT24102769Lab6Q2C
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    
    
    
    System.out.print("Enter number 1:");
    int num1 = sc.nextInt();


    System.out.print("Enter number 2:");
    int num2 = sc.nextInt();

    System.out.print("Enter number 3:");
    int num3 = sc.nextInt();

    System.out.print("Enter number 4:");
    int num4 = sc.nextInt();

    System.out.print("Enter number 5:");
    int num5 = sc.nextInt();

    System.out.print("Enter number 6:");
    int num6 = sc.nextInt();

    System.out.print("Enter number 7:");
    int num7 = sc.nextInt();

    System.out.print("Enter number 8:");
    int num8 = sc.nextInt();

    System.out.print("Enter number 9:");
    int num9 = sc.nextInt();


    System.out.print("Enter number 10:");
    int num10 = sc.nextInt(); 

   System.out.println("The numbers you entered are:");
   System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9+" "+num10);
  
   double sum=(num1+num2+num3+num4+num5+num6+num7+num8+num9+num10);
   System.out.println("Sum of the numbers:"+sum);

   double avg= sum/10;
   System.out.println("Average of the numbers:"+avg);


   }
}
    