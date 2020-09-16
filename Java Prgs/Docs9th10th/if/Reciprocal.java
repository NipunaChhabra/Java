//wap to print Reciprocals of Even no.s between 2 to 20
public class Reciprocal
{
    public static void main ()
    {
        for(int i = 0; i<=20; i=i+2)
        {
            double r = 1.0 / i;
            System.out.println("reciprocal of " + i + "is" + r);
        }
    }
}
        