/*table*/
public class TablesUsingFor
{
    public static void main ()
    {
        int a;
        int i;
        for (a=2; a<=5; a++)
        {
            for (i=1; i<=10; i++)
            {
                System.out.println(a+"*"+i+"="+ a*i);
            }
        }
    }
}