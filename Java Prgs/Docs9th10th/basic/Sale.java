/*sale*/
public class Sale
{
    public static void main ()
    {
        int woolenitems = 5000;
        int cottonitems = 3000;
        int kidsitems = 2000;
        
        int dw =woolenitems-(woolenitems*10/100);
       int dc =cottonitems-(cottonitems*20/100);
        int dk =kidsitems-(kidsitems*30/100);
        System.out.println ("original price of woolen items = " + woolenitems);
        System.out.println ("price after discount =" + dw);
        
        System.out.println ("original price of cotton items = " + cottonitems);
        System.out.println ("price after discount =" + dc);
        
        System.out.println ("original price of kids items = " + kidsitems);
        System.out.println ("price after discount =" + dk);
        
        int total = dw + dc + dk;
        System.out.println ("TOTAL = " + total);
    }
}
        
        
       