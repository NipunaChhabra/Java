class Factorial
{
    static int factorial=0;
    
    static void factorial(int n)
    {
       
        int fac=1;
        for(int i=1; i<=n; i++)
        {
            fac=fac*i;
        }
        factorial=fac;
    }
    }        
        System.out.println(factorial);
    

