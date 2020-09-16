class Narcisstic
{
    

    public static void isNarcisstic(int n)
    {int test=n; int sum = 0;
        while(test>0)
        {
            int r = test%10;
            sum = sum +(int) Math.pow(r,CircularPrime.countDigits(n));
            test = test/10;
            
        }
        if(sum==n)
            System.out.println(" It is a narcisstic number");
        else

            System.out.println(" It is not a narcisstic number");
    }
}