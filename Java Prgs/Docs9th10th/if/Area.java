/*area*/
import java.util.Scanner;

public class Area
{
public static void main ()
{
    Scanner ab= new Scanner(System.in);
    System.out.println("enter 1 for square,2 for rectangle 3 for circle and 4 for triangle"); 
    int n =ab.nextInt();
     
     if (n==1)
     {
        System.out.println("enter the side ");
        int t=ab.nextInt();
        int ans1= t * t;
        System.out.println ("area="+ans1);
    }
        
         if (n==2)
     {
        System.out.println("enter the length and breadth ");
        int l=ab.nextInt();
        int b=ab.nextInt();
        int ans2= l * b;
        System.out.println ("area="+ans2);
    }
    
    
    if (n==3)
     {
        System.out.println("enter the radius ");
        int r=ab.nextInt();
        double ans3= r * r * 22/7;
        System.out.println ("area="+ans3);
    }
    if (n==4)
     {
        System.out.println("enter the length, breadth ");
        int l1=ab.nextInt();
        int b1 = ab.nextInt();
        double ans4 = l1 * b1* 1/2;
        System.out.println ("area="+ans4);
    }
    
    if (n>4)
     {
        System.out.println("invalid");
    }
}
}