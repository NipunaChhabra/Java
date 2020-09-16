class CircularPrime
{
    public boolean isPrime(int n){
        for( int i =2; i<n/2; i++)
        {if(n%i==0)return false;}
        return true;}    

    public int countDigits(int n){
        int c=0;
        while(n>0){ c++; n= n/10;}
        return c;}

    public boolean isCircularPrime(int n){
        int test = n;
        for(int i = 0; i<countDigits(n); i++)
        {
            if(isPrime(test))
            {
                int r = test%10;
                test = test/10;
                test = r*(int)(Math.pow(10,(countDigits(n)-1)))+test;
            }
            else return false;}
        return true;
    }

    public static void main(String args[])
    {int t = Integer.parseInt(args[0]);
        CircularPrime obj = new CircularPrime();
        if(obj.isCircularPrime(t))System.out.println("true" );
        else System.out.println("false" );
        
    }
}

         