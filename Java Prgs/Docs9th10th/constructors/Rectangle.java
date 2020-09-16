// first oop based program
class Rectangle
{
    double l, b, ar;

    public Rectangle(double l, double b)
    {
        this.l=l;
        this.b=b;
    }

    public void findArea ()
    {
        ar=l*b;
    }

    public void display()
    {
        System.out.println("Area= "+ar);
    }

    public static void main()
    {
        Rectangle TableTop = new Rectangle(4,9);
        TableTop.findArea();
        TableTop.display();
    }
}