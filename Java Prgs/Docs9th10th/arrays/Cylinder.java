 import java.util.*;
class Cylinder
{
    double radius, height;
    static double PI = 3.14;
    
    public Cylinder()
    {
      Scanner S=new Scanner(System.in);
      System.out.println("Enter radius ");
      radius=S.nextDouble();
      System.out.println("Enter height ");
      height=S.nextDouble();
    }
    
    public Cylinder(double radius, double height)
    {
        this.radius= radius;
        this.height=height;
    }
    
    public double volume()
    {
        double vol=PI*radius*radius*height;
        return vol;
    }
    
    public void display()
    {
       System.out.println("volume : " + volume());
    }
    
    public static void main(String args[])
    {
      
        if(args.length==0) { Cylinder obj2=new Cylinder();
                           obj2.display();}
      else{                     
       double r = Double.parseDouble(args[0]);
       double h = Double.parseDouble(args[1]);
       Cylinder obj1= new Cylinder(r,h);
       obj1.display();}
       }
}
       
    
    
    
    