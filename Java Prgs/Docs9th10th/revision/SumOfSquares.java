class SumOfSquares
{
    public static void main(int n)
    {
        int sum=0; int  i = 2;
        do{
            sum = sum + (i*i); 
            i+=2;
        }while(i<n);
        System.out.println("Sum= " + sum);
    }
}
