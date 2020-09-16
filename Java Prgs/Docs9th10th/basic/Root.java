/*root of(a^2+b^2+c^2)*/
public class Root
{public static void main(int a,int b, int c)
    {
        double A = Math.pow(a,2);
        double B = Math.pow(b,2);
        double C = Math.pow(c,2);
        double ans = Math.sqrt(A+B+C);
        System.out.println ("ans=" + ans);
    }
}