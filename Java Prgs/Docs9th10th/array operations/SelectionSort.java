class SelectionSort extends Base
{
        
    public void sort()
    {
        for(int i=1; i<a.length; i++)
        {
            for(int j=i; j<a.length; j++)
            {
                if (a[i-1] > a[j])
                {
                    long t=a[i-1];
                    a[i-1]=a[j];
                    a[j]=t;
                }
            }
        }
    
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + "  ");
        }
    }
    
    
}
