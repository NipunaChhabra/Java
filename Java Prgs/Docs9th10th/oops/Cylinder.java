// total surface are and volume of cylindrical objects

class Cylinder
{
    double radius, tsa, volume, height;
    
    public void enterRadius(double r, double h)
    {
        radius=r;
        height=h;
    }
    
    public void totalSurfaceArea()
    {
        tsa= 2* Math.PI * radius *(radius+height);
    }
    
    public void volume()
    {
        volume= Math.PI * radius * radius *height;
    }
    
    public void volumeOutput()
    {
        System.out.println("Volume= " + volume);
    }
    
    public void tsaOutput()
    {
        System.out.println("Tsa= " + tsa);
    }
}
    