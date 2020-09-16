class NumberTheory
{
    public static int sumDigits(int n)
    {
        int m = n;
        int sum = 0;
        while(m>0)
        {
            int r = m%10;
            sum +=r;
            m=m/10;}
        return sum;}

    public static boolean isEmirp(int n)
    {
        if (PrimeOperations.isPrime(n))
        {
            int rev=NumberTheory.reverse(n);
            if(PrimeOperations.isPrime(rev))
            {
                return true;}
        } return false;
    }

    public static int reverse(int n)
    {
        int m=n;
        int rev=0;
        while(m>0){
            int r=m%10;
            rev=rev*10+r;
            m=m/10;
        }
        return rev;
    }

    public static void emirpNumbers (int a,int b)
    {
        for (int i=a;i<=b;i++)
            if (isEmirp(i))
                System.out.println(i);
    }
}

            