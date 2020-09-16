//heron's formula
public class Herons_Formula
{
    public static void main(double a , double b, double c)
    {
        double s=(a + b + c)/2;
        double area= Math.sqrt(s)*(s-a)*(s-b)*(s-c);
        System.out.println("Area = " +area);
    }
}