public class Armstrong_numbe
{
    public static void main(int n)
    {
        int a = n/100;
        if(a>10 || a==0)
        {
            System.out.println("it is not 3 digit");

        }
        int b = n%100;
        int c = b/10;
        int d = b%10;
        int sum = (a*a*a) + (c*c*c) + (d*d*d);
        if(sum==n)
        {
          System.out.println("it is an armstrong number");
        }
         else
        {
            System.out.println("it is not an armstrong number");
        }
    }
}