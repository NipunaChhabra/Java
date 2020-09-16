class MagicPrime

{
    public static boolean isMagic(int n)
    {
        int sum =0; int test = n;
        do
        {
            for (int m = test ; m>0 ; m=m/10)
            {
                int r = m%10;
                sum = sum +r;
            }
            if(sum==1)
                return true;
            test=sum;}
        while(sum!=0 && sum/10>0);
        return false;
        }
    }

            