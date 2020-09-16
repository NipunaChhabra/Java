// first oop based program
class Rectangle
{
    double l, b, ar;
    
    public void enterData(double l, double b)
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
    
    public static void main(String args[])
    {
        double l = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        Rectangle TableTop = new Rectangle();
        TableTop.enterData(l,b);
        TableTop.findArea();
        TableTop.display();
        
    }
}