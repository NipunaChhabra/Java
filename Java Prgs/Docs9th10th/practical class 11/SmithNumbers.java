class SmithNumbers
{
    public static boolean isPrime(int n)
    { int fc =0;
        for(int i=2; i<n/2; i++)
        {
            if(n%i==0)
                fc++;}
        if(fc==0)return true;
        else return false;
    }

    public static int sumDigits(int n)
    {
        int m=n;
        int sum=0;
        while(m>0)
        {
            int r =m%10;
            sum = sum +r;
            m=m/10;
        } 
        return sum;
    }

    public static int getSumDigitsOfPrimeFactors(int n)
    { int sum=0;
        for(int i=2; i<=n; i++)
        {
            while(n%i==0 && isPrime(i))
            {
                sum = sum + sumDigits(i);
                n=n/i;}
        }
        return sum;
    }

    public static boolean isSmith(int n)
    {
        if(sumDigits(n)==getSumDigitsOfPrimeFactors(n))
            return true;
        else return false;
    }

    public static void range(int l, int u)
    {
        for(int i=l; i<=u; i++)
        {
            if(isSmith(i))
                System.out.println(i);
        }
    }
}

