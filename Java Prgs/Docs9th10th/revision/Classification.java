import java.util.Scanner;
//classification of triangles
class Classification
{
    public static void main()
    {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Sides");
        int a = ab.nextInt();
        int b = ab.nextInt();
        int c = ab.nextInt();
        
        if(a==b&&b==c)
        {
            System.out.println("Equilateral Triangle");
        }
        
        else if(a*a==b*b+c*c||c*c==a*a+b*b||b*b==a*a+c*c)
        {System.out.println("Right Angle Triangle");
        }
        else
        System.out.println("Scalene Triangle");
    }
}
        