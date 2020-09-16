
/*Simple interesti*/
 import java.util.Scanner;
public class Simple
 {
     public static void main()
     {
         Scanner i=new Scanner(System.in);
         System.out.println("enter principal");
         double principal=i.nextDouble();
         System.out.println("enter rate");
         double rate=i.nextDouble();
         System.out.println("enter time");
         double time=i.nextDouble();
         double interest=(principal*rate*time)/100;
         System.out.println("the interes is "+interest);
        }
    }
    
      
         
 