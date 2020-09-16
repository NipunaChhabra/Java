class PerfectSquareNumber
{
    public static boolean isSpecial81(int n)
    { int sum=NumberTheory.sumDigits(n);
        if(n==Math.pow(sum,2))

        return true;
        else return false;
    }
    
    public static void Special81Number (int a,int b)
    {int count = 0;
        for (int i=a;i<=b;i++)
            if (isSpecial81(i))
                {System.out.println(i);
              count++ ;}
              System.out.println("special numbers in the range are:" + count);
            }
}