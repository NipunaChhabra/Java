// Temperature conversion
import java.util.Scanner;
class Temperature
{
    public static void main()
    {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter 1 for conversion into celsius and 2 for conversion into fahrenheit");
        int n = ab.nextInt();
        System.out.println("Enter temperature");
        int t = ab.nextInt();
        
        if (n==1)
        {
            int ans = (5*(t-32))/9;
            System.out.println("temperature in celsius= " + ans);
        }
        
        else if (n==2)
        {
            int ans = 9*t/5+32;
            System.out.println(" temperature in fahrenheit= " + ans);
        }
        
        else
        {
            System.out.println("invalid");
        }
    }
}
        
        