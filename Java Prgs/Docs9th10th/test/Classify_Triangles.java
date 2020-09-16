/*Classification of triangles*/
public class Classify_Triangles
{
    public static void main(int a,int b,int c)
    {
        if(a==b && b==c)
        System.out.println("equilateral triangle");
        else if(a==b || b==c || c==a)
        System.out.println("isoceles triangle");
        else System.out.println("Scalene triangle");
    }
}
        