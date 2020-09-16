class PrimeOrNot
{
    public static void main(int a)
    {  int count=0;
        for(int i = 1; i<=a/2; i++)
        {
            if(a%i==0)  
                count++;
            }
            if (count ==1)
            System.out.println(" prime");
            else 
            System.out.println("not prime");
        }
    }
            