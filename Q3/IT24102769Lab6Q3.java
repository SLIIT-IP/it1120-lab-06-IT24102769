import java.util.Scanner;
public class IT24102769Lab6Q3
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  int sumsqr=0;
  int count=0;
  
  System.out.println("Enter positive integers (terminate input with -99):");
 

  
  while (true)
   {
    System.out.print("Enter a number:");
    int num=sc.nextInt();

      if (num==-99)
     {
       break;
     }
  
    if (num<0)
     {
      System.out.println("Please enter a positive integer or -99 to terminate");
      continue;
     }
    
  
   
    
   sumsqr += num * num;
   count++;
  }

  if(count>0) 
   {
    double RMS = Math.sqrt((double)sumsqr/count);
    System.out.println("The Root Mean Square (RMS) is:"+RMS);
   } 
  else 
   {
    System.out.println("No valid numbers were entered.");
   }
  }
}

