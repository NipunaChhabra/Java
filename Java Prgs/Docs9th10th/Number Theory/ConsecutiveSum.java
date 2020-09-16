class ConsecutiveSum
{
    public static  void consecutives(int n)
    {int sum=0;int count=0;
        for(int i=1; i<n; i++)
        {
            for(int j=i; j<=n; j++)
            {
                sum = sum +j;
                if(sum==n)
                {System.out.print(i);
                    for(int k = i+1; k<=j; k++)
                    {System.out.print("+"+k);
                       
                    }
                    System.out.println("=" + sum);
                    count++;
                }
            }
            sum=0;
        }
        if(count==0)System.out.println("no consective sums found");
    }
}
