//practical question 2
class PrimeOperations
{
    public static boolean isPrime(int n)
    {
       for(int i=2; i<n/2; i++)
       {
           if(n%i==0)
           return false;}
           return true;
        }
        
        public static int reverse(int n)
        {
            int m = n; int rev=0;
            while(m>0)
            {
                int r=m%10;
                rev = rev*10+r;
                m=m/10;
            }
            return rev;
        }
        
        public static boolean isPrimePallindrome(int n)
        {
            if(n==reverse(n) && isPrime(n))
            return true;
            else return false;
        }
        
        public static boolean isSemiPrime(int n)
        {
            for(int i=1; i<n/2; i++)
            {
                if(n%i==0 && isPrime(i) && isPrime(n/i) && n/i!=i)
                
                    return true;
                           }
            return false;
        }
        
    }
    