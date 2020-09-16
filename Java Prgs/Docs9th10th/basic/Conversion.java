/* WAP to calculate the distance of 1056 feet in terms of yards and miles. given fixed values are 1 mile=
 1760 yards and 1 yard= 3 feet*/
import java.util.Scanner;
 public class Conversion
{
    public static void main()
    {
        Scanner ab=new Scanner(System.in);
        System.out.println("enter distance in feet");
        double dis=ab.nextDouble();
        double yard  = dis/3;
        double mile = yard/1760;
        yard = yard%1760;
        System.out.println("mile: " + mile +"yard: " + yard );
    }
}
        