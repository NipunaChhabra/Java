class SumSeries1
{ int sum; int a; int b;
    public SumSeries1(int a, int b)
    {this.a=a;
        this.b=b;
    }

    public int power(int a, int n)
    {
        if(n==1)return a;
        else return a*power(a,n-1);}

    public int factorial(int a )
    {
        if(a==1)return 1;
        else return a*factorial(a-1);
    }

          public int getSum(int n, int x)
    {
        if(n==0)return 0;
        else return (power(x,n)/factorial(n))+getSum(n-1,x);
    }

    public void getSum()
    {
        sum = getSum(a,b);
    }

    public void display()
    {System.out.println(sum);}
}

