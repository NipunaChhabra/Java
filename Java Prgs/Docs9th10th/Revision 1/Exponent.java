//powers of x from 1 to 10
class Exponent
{ 
     public static void main(int x )
     {
         double a = 0;
         int i;
         for (i=1; i<=10; i++)
         {
             a = Math.pow (x,i);
             System.out.println(a);
            }
        }
    }