class Fifonacci
{
    static void fibSeries(int a, int b, int i, int n)
    {
        if(i>n)return;
        else {int c=a+b;
            System.out.println(c);
            fibSeries(b,c,i+1,n);
        }
    }
    static void fibSeries(int n)
    {fibSeries(0, 1,3,n);
      
    }
}