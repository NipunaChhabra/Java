class CircularPrime
{
    

    public static int countDigits(int n)
    {
        int m = n;
        int count = 0;
        while(m>0)
        {
            int r = m%10;
            count ++;
            m=m/10;}
        return count;} 

    public static boolean isCircularPrime(int number)
    { int test = number;
        for(int i =0; i<countDigits(number); i++)
        { if(PrimeOperations.isPrime(test))
            {int r = test%10;
                test= test/10;
                test = r*(int)(Math.pow(10,(countDigits(number)-1)))+test;
            }
            else  return false;
                    }
        return true;
    }

    public static void circularPrimes (int a,int b)
    {int count = 0;
        for (int i=a;i<=b;i++)
            if (isCircularPrime(i))
            {System.out.println(i);
                count++ ;}
        System.out.println("circular Prime numbers in the range are:" + count);
    }

}
