
//side of square
import java.util.Scanner;
public class SideOfSquare
{
    public static void main()
    {
        Scanner ab = new Scanner (System.in);
        System.out.println("enter the area of square to find its side");
        double a = ab.nextDouble();
        double s = Math.sqrt(a);
        System.out.println("the length of side of square is " + s +" cm");
    }
}
        