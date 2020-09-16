class SmithNumbers
{

    private int number;
    public SmithNumbers (int n)
    {
        number=n;
    }

    boolean isPrime(int a)
    {
        for (int i =2; i<=a/2;i++)
        {
            if (a%i==0)return false; }
        return true; }

    int sumDigitsPrimeFactors(int n)
    {   int sum2=0;
        for (int i=2;i<=n;i++)
        {            while (n%i==0&&isPrime(i))
            {sum2=sum2+NumberTheory.sumDigits(i);
                n=n/i;
            }}
        return sum2;
    }

    boolean isSmithNumber()
    {
        if (NumberTheory.sumDigits (number)==sumDigitsPrimeFactors(number))
            return true ;
        else return false;
    }

    void display()
    {
        if (isSmithNumber())
            System.out.println(number+"is a smith number");
        else System.out.println ("not a smith number");
    }

    public static void main(String args[])
    { SmithNumbers obj = new SmithNumbers(675);
        obj.display();
    }
}

