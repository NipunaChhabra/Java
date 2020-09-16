//1^3, 3^3,5^3;
class SumOddCubes
{
   private static int sumSeries(int n)
   {if(n==1)return 1;
       else return n*n*n +sumSeries(n-2);
    }
    
    public static void main(String args[])
    {int n = Integer.parseInt(args[0]); 
        int sum=sumSeries(n);
        System.out.println("Sum of series:" + sum);
    }
}
        
       