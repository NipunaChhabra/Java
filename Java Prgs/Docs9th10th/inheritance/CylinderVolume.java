class CylinderVolume extends Cylinder
{
    public double volume()
    {
        return Math.PI * radius * radius *height;
    }

    public void display()
    {super.display();
System.out.println("volume:"+volume());
}
}