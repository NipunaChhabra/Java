/* scanner*/
import java.util.Scanner;
public class Bowlingaverage
{
    public static void main()
    {
        Scanner ab= new Scanner(System.in);
        System.out.println("Enter no. of matches");
        double m= ab.nextDouble();
        System.out.println("Enter no. of wickets");
        double w= ab.nextDouble();
        System.out.println("Enter no. of runs");
        double r= ab.nextDouble();
        double ans=r/w;
        System.out.println("Average="+ans);
    }
}