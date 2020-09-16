class PrimeOperations
{
    public static boolean isPrime(int n)
    {int fc=0; if(n==1)return false;
        for(int i = 2; i<=n/2; i++)
        { if(n%i==0)fc++;}

        if(fc==0)return true;
        else return false;
    }

    public static void duplicatePrimeFactors(int n)
    {int m =n;
        for(int i =2; i<=m/2 ; i++)
        {
            while(m%i==0 && isPrime(i))
            {             
                System.out.println(i);
                m=m/i;}
        }       

    }

    public static int sumDuplicatePrimeFactors(int n)
    {int m =n; int sum =0;
        for(int i =2; i<=m/2 ; i++)
        {
            while(m%i==0 && isPrime(i))
            {             
                sum = sum + i;
                m=m/i;}
        }return sum;

    }

    public static void primeNumbers(int l,int u)
    {
        for(int n = l; n<=u; n++)
        {
            if(isPrime(n))
                System.out.println(n);
        }
    }

    public static void twinPrime(int l, int u)
    {
        for(int n=l; n<=u; n++)
        { if(isPrime(n)&& isPrime(n+2))
                System.out.println(n+ "\t" + (n+2));

        }
    }

    public static boolean isSemiPrime(int n)
    {
        for(int f = 2; f<=n/2; f++)
        {
            if (n%f==0&& isPrime(f)&& isPrime(n/f) && f!=n/f)
                return true;
        }return false;
    }

    public static void semiPrime(int l, int u)
    {
        for(int n=l; n<=u; n++)
            if(isSemiPrime(n))
                System.out.println(n);
    }

    public static boolean areCoPrime(int m, int n)
    {
        for (int i = 2; i<=m&&i<=n; i++){
            if(m%i==0 &&n%i==0)
                return false;}
                return true;
    }

    
}

    