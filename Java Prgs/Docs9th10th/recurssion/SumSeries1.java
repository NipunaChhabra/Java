//x,x^3,x^5,x^7......
class SumSeries1
{
    
    private static int pow(int x, int n)
    {if(n==1)return x;
        else return x*pow(x,n-1); 
    }
    
    private static int sumSeries(int x, int m)
    {if(m==1)return x;
        else return pow(x,m)+sumSeries(x,m-2);
    }
    
    public static void main(String args[])
    {int X  = Integer.parseInt(args[0]);
     int M = Integer.parseInt(args[1]);
     sumSeries(X,M);
    }
}
        
        


    