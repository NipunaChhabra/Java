class Fibonacci
{
   
    public static  void main()
    {
         int n[] = new int[20];
        n[0]=0;
        n[1]=1;
        for(int i = 2; i<20; i++)
        {
            n[i]=n[i-1]+n[i-2];

        }
        
        for(int i = 0; i<20; i++)
        {
            System.out.print(n[i] + "  ");
        }
    }
}