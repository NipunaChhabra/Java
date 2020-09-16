//pg 476 q58
import java.util.Scanner;
public class Store
{
    public static void main()
    {
        Scanner store=new Scanner(System.in);
        System.out.println("enter number of cans of 15 rupees");
        int can=store.nextInt();
        int total1=can*15;
        System.out.println("the total amount is rupees " +total1);
        System.out.println("enter the number of cans of 20 rupees ");
        int cans=store.nextInt();
        int total2=cans*20;
        System.out.println("the total amount is rupees " +total2);
        System.out.println("enter the number of cans of 21 rupees ");
        int can3=store.nextInt();
        int total3= can3*21;
        System.out.println("the total amount is rupees " +total3);
        int total=total1+total2+total3;
        System.out.println("grand total is rs. "+total);
    }
}
        