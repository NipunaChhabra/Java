public class ArmstrongNumber//restricted to four digits
{
    public static void main(int n)
    {
      int a = n/1000;
      int b = n%1000;
      int c = b/100;
      int d = b%100;
      int e = d/10;
      int f = d%10;
      int sum = a*a*a + c*c*c + e*e*e + f*f*f;
      if (sum==n)
      {
         System.out.println("it is an Armstrong No.");
        }
        else
        {
            System.out.println("it is not an Armstrong No.");
        }
    }
}
      