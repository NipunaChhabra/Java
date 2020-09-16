
public class Aorder
{
  public static void main(int x, int y, int z)
    {
    if(x<y && x<z && y<z)
       {
           System.out.println(x+ "\t" + y +"\t" + z);
        }
    if (x<y && x<z && z<y)
       {
           System.out.println(x+ "\t" + z +"\t" + y);
        }
    if (y<z && y<x && z<x)
       {
           System.out.println(y+ "\t" + z +"\t" + x);
        }
    if (y<z && y<x && x<z)
       {
           System.out.println(y+ "\t" + x +"\t" + z);
        }
    if (z<y && z<x && x<y)
       {
           System.out.println(z+ "\t" + x +"\t" + y);
        }
    if (z<y && z<x && y<x)
       {
           System.out.println(z+ "\t" + y +"\t" + x);
        }
    }
}