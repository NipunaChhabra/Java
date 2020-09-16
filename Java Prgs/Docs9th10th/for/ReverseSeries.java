import java.util.Scanner;
public class ReverseSeries
{
    public static void main()
    {
        Scanner ab = new Scanner(System.in);
        System.out.println("enter a number to get reverse series till 0");
        double n = ab.nextDouble();
        if(n<=0)
        {
            System.out.println ("invalid number");
        }
        
        else 
        {
               for(double a= n; a>=0; a--)
            {
                System.out.println (a);
            }
        }
    }
}
            