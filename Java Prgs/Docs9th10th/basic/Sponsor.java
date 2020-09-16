/*pg 476 q.59*/
import java.util.Scanner;
public class Sponsor
{
    public static void main()
    {
        Scanner ship=new Scanner(System.in);
        System.out.println("enter amount to be raised");
        double group=ship.nextDouble();
        double total=group;
        System.out.println("enter amount raised by group 1");
        double group1=ship.nextDouble();
        double total1=total-group1;
        System.out.println("remaining amount to be raised is rupees" +total1);
        System.out.println("enter amount to be raised by group2");
        double group2=ship.nextDouble();
        double total2=total1-group2;
        System.out.println("remaining amount to be raised is rupees "+total2);
        double grand=total2/5;
        System.out.println("therefore each of the remaining 5 groups will raise rupees"+grand);
    }
}
        
        