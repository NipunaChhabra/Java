class DudeneyNumber
{
    public static boolean isDudeney(int n)
    { 
        if(n==Math.pow(NumberTheory.sumDigits(n),3))

        return true;
        else return false;
    }
    
     public static void dudeneyNumbers (int a,int b)
    {int count = 0;
        for (int i=a;i<=b;i++)
            if (isDudeney(i))
                {System.out.println(i);
              count++ ;}
              System.out.println("dudeney numbers in the range are:" + count);
            }
}