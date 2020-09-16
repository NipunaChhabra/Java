public class Factorial
{
    public static void main( double n)
    {
        double f = 1;
        for(double i = 1; i<=n; i++)
        {
          f = f*i;
        }
        System.out.println ("factorial:" + f);
    }
}
        