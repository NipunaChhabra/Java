//Fibonacci Series with for till x
class Fibonacci
{
    public static void main(int x)
    {
       int n = 0;
       int b = 1;
       System.out.println(n);
       System.out.println(b);
       while(n<x)
       {
           int t = n+ b;
           System.out.println(t);
           n= b;
           b=t;          
        }
     }
}
           