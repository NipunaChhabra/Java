// Designing a simple calculator
class Calculator
{
    double a,b,r, radian;
    
    public void input(double x, double y)
    {
        a=x;
        b=y;
    }
    
    public void add ()
    {
        r = a+b;
    }
    
    public void subtract ()
    {
        r = a-b;
    }
    
     public void multiply ()
    {
        r = a*b;
    }
    
     public void divide ()
    {
        r = a/b;
    }
    
     public void power ()
    {
        r = Math.pow(a,b);
    }
    
    public void squareRoot()
    {
        r=Math.sqrt(a);
    }
    
    public void sin()
    {
        radian = Math.PI/180 * a;
        r=Math.sin(radian);
    }
    
    public void cos()
    {
        radian = Math.PI/180 * a;
        r=Math.cos(radian);
    }
    
    public void tan()
    {
        radian = Math.PI/180 * a;
        r=Math.tan(radian);
    }
    
    public void output()
    {
        System.out.println("Result= " + r);
    }
}
    