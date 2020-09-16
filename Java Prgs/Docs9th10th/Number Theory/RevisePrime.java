class RevisePrime
{
    public static boolean isPrime(int n)
    {int fc=0;
        for(int i=1; i<n/2;i++)
        {if(n%i==0)fc++;
            {if (fc==0)return true; 
                else return false;}}}

    public static boolean isSemiPrime (int n)
    {for (int f=1;f<n/2;f++)
        {if (n%f==0&&isPrime(f)&&isPrime(n/f)&&f!=n/f)
                return true;
            else return false;
        }
    }

    public static boolean isEmirp(int n)
    {int m=n;int rev=0;
        while (m>0)
        {
            int t=m/10;
            m=m/10;
            rev=rev*10+t;
        }
        if(rev==n&&isPrime(n)&&isPrime(rev))
        return true ;
        else return false;}
public static void genEmirp(int l,int u)
{for (int i=l;i<=u;i++)
    if (isEmirp(i)
    