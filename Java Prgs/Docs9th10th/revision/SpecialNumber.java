//special number
class SpecialNumber
{
    
public static void main(int a)
    {    double Sum = 0;
        double copy = a;
        double factorial=1;
        while (a>=0)
        {
            int digit = a%10;
            for(int i = 1; i<=digit; i++)
            {factorial = factorial * i;}
            Sum = Sum + factorial;
            a=a/10;
        }
        if(Sum==a)
        System.out.println("It is a Special Number");
        else
        System.out.println("It is not a Special Number");
            }
}