class SelectionSort
{
    long a[];
    public SelectionSort(long a[])
    {
        this.a=a;
    }
    
    public void execution()
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
    
    public static void main()
    {
        long n[] = {543,434,343,566,545,242,784,456,234,876,435,777};
        SelectionSort Object1 = new SelectionSort(n);
        Object1.execution();
    }
}
