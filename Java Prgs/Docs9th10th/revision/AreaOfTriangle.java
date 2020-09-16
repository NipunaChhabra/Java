//to find the triangle 
class AreaOfTriangle
{
    public static void main(int a,int b,int c)
    {
    double s=(a+b+c)/2;
    double A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("area is:" + A);
}
}


