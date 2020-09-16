//x,x^3/3!,x^5/5!.....
class SumSeries
{ double x; int n; double sum;
    public SumSeries(double x , int n)
    {this.x=x; this.n=n;}

    private int factorial(int n)
    {if(n==1)return 1;
        else return n*factorial(n-1);}

    private double pow(double x, int n)
    {if(n==0)return 1;
        else return x*pow(x,n-1); 
    }

    private double getSum(double x, int n)
    {if(n==1)return x;
        else return pow(x,n)/factorial(n)+getSum(x,n-2);
    }

    public void getSum()
    {sum=getSum(x,n);}

    public void display(){
        System.out.println("SumSeries=" +sum);}

    public static void main(String args[])
    {double X  = Double.parseDouble(args[0]);
        int M = Integer.parseInt(args[1]);
        SumSeries ss = new SumSeries(X,M);
        ss.getSum();
        ss.display();

    }
}

    