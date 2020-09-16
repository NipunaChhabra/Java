class CylinderMass extends CylinderVolume
{
     double density, mass;
    public void calculateMass()
    {
        mass= volume()*density;
    }
    
    public void display()
    {
        super.display();
       System.out.println("mass:" + mass);
    }
    
}
