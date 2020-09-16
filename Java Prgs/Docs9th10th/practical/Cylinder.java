import java.io.*;
class Cylinder
{
    double height, radius, density;

    public Cylinder()throws IOException
    {
        InputStreamReader k = new InputStreamReader(System.in);
        BufferedReader i = new BufferedReader(k);

        System.out.println("Enter radius");
        String r = i.readLine();
        radius = Integer.parseInt(r);
        System.out.println("Enter density");
        String h = i.readLine();
        height = Integer.parseInt(h);
        System.out.println("Enter height");
        String d = i.readLine();
        density = Integer.parseInt(d);

    }

    public double volume()
    {
        return Math.PI*radius*radius*height;
    }

    public double mass()
    {
        return volume() * density;
    }

    public void display()
    {
       System.out.println("volume : " + volume());
       System.out.println("mass : " + mass());
    }
    
    public static void main()throws IOException
    {
        Cylinder obj = new Cylinder();
        obj.display();
    }
    
}