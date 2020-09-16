/* WAP that displays how many dozens and gross and how many extra (both dozen and gross)packets has a charity animal hospital received (gross=144 units) use scanner class*/
import java.util.Scanner;
public class Packets
{
    public static void main()
    {
        Scanner ab=new Scanner(System.in);
        System.out.println("enter no. of packets received");
        int packets=ab.nextInt();
        int dozen=packets/12;
        System.out.println("dozens of packets received are "+dozen);
        int total=packets%12;
        System.out.println("no. of packets that are extra(dozen) is"+total);
        int gross= packets/144;
        System.out.println("no. of gross packets received= " +gross);
        int grosstotal=packets%144;
        System.out.println("no. of packets that are extra (gross) is"+grosstotal);
    }
}