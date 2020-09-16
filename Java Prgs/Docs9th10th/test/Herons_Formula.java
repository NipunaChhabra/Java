
public class Herons_Formula
{
    public static void main(double a , double b, double c)
    {
        double s=(a + b + c)/2;
        double p = s-a;
        double q = s-b;
        double r = s-c;
        double sum= s*p*q*r;
        double area= Math.sqrt(sum);
        
        System.out.println("Area = " +area);
    }
}