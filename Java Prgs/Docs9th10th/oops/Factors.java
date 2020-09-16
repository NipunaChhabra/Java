//factors
class Factors
{
    double x ; 
    
    public void enterNumber(double num)
    {
        x=num;
    }
    
    public void working()
    {
       
        for(int i=1; i<=x/2; i++)
        {
            if(x%i==0)
            
                System.out.println(i);
            
        }
    }
}
    