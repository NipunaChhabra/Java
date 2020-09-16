class SumSeries
{ double sum; double x; int n;
    public SumSeries(double a, int b)
    {this.x=a;
        this.n=b;
    }

    public double power(double a, int n)
    {
        if(n==1)return a;
        else return a*power(a,n-1);}

    public int factorial(int a )
    {
        if(a==1)return 1;
        else return a*factorial(a-1);
    }

    public int fib( int n)
    {
        if(n==1) return 0;
        else if(n==2) return 1;
        else return fib(n-2)+fib(n-1);
    }

  

    public double getSum(int n, double x)
    {
        if(n==0)return 0;
        else return ((fib(n+1)*power(x,n))/factorial(n))+getSum(n-1,x);
    }

    public void getSum()
    {
        sum = getSum(n,x);
    }

    public void display()
    {System.out.println(sum);}
}

