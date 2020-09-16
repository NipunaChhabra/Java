class HCF_LCM
{
    static int HCF(int a, int b)
    {
        int hcf=1;
        for(int i=1; i<=a && i<=b; i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        return hcf;
    }

    static int LCM(int a, int b)
    {
        int lcm = 1;
        for(int i=1; i<=a*b; i++)
        {
            if(i%a==0 && i%b==0)
            {
                lcm=i;
                break;
            }
        }
        return lcm;
    }

    public static void main()
    {
        int lcm = LCM(4,5);
        System.out.println(lcm);
    }
}

        