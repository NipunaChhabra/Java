class Union
{

    public void union(int a[], int b[])
    {
        int k[]= new int[a.length + b.length];
        for (int i=0; i<a.length; i++)
        {
            k[i]=a[i];
        }

        for(int i=a.length; i<k.length; i++)
        {
            k[i]=b[i-a.length];
        }
        
        for( int i=0; i<k.length; i++)
        {
            System.out.println(k[i]);
        }
    }
}
