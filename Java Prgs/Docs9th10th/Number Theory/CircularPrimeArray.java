class CircularPrimeArray
{  private   int number;
   private  int A[];
    
    public CircularPrimeArray(int num)
    {number= num;
    }
    
    public  int countDigits(int n)
    {
        int m = n;
        int count = 0;
        while(m>0)
        {
            m=m/10;
            count ++;
            }
        return count;}

    public  void assign()
    {
        int num = number;
        int A[] = new int[countDigits(number)];
        
        for(int i = 0; i<A.length; i++)
        {
            A[i] =num%10 ;
            num = num/10;
        }
        this.A=A;
        
    }

    public  boolean isCircularPrime()
    {int test=number;

        do
        {if(PrimeOperations.isPrime(test))
            { 
                for(int i =0; i<A.length; i++)
                    test = test*10 +A[i];
                int t = A[A.length-1];
                for(int j =A.length-1; j>0; j--)
                    A[j]=A[j-1];
                    A[0] = t;
            }
            else return false;
        }
        while(test==number);
        return true;
    }
    
 public static void main(String args[])
  {
    }
}

