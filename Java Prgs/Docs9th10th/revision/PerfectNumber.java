class PerfectNumber
{
    public static void main(int a)
    {double sum = 0;
        double copy = a;
        for(int i = 1; i<=a/2; i++)
        {
            if(a%i==0)
            { sum = sum + i;}
        }
        if(sum == copy)
        System.out.println("It is a perfect number");
        else
        System.out.println("Not a Perfect Number");
    }
}