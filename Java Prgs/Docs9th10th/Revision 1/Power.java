class Power
{
    public static void main(int x, int y)
    {
        double a=(3*x + 5*y) / (5*x+3*y) - (8*x*y / 2*y*x);
        double ans=Math.pow(a,3/2);
        System.out.println(ans);
    }
}