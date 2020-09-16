/*abc= abc
 *     ab
 *     a
 */
class Pattern
{
    public static void main (String name)
    {  int l = name.length(  );
        for(int i=l ; i>0; i--)
        {
            String pr = name.substring(0, i);
            System.out.println(pr);
        }
    }
}

        