class SumRoots
{
    public static void main(int n)
    {
        double sum=0; int mul; int  i = 1;
        while(i<n)
           { mul = 4 *i;
            sum =  sum + Math.sqrt(mul);
            i+=1;
        }
        System.out.println("Sum= " + sum);
    }
}
