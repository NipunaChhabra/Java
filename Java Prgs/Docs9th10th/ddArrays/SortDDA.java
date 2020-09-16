class SortDDA
{ int a[][]; int A[];
    public SortDDA(int a[][], int ord)
    {this.a=a;
        int M[]= new int[a.length*a[0].length];
        A=M;}

    public void OneDA()
    {int k=0;for(int i=0; i<a.length; i++)
        {  for(int j = 0; j<a[0].length; j++)
            {
                A[k++]=a[i][j];
            }}} 

    public void Ssort()
    {for(int i=1; i<A.length; i++)
        {for(int j=i; j<A.length; j++)
            {if (A[i-1] > A[j])
                {int t=A[i-1];
                    A[i-1]=A[j];
                    A[j]=t;
                }}}}  

    public void assign()
    { int k = 0;
        for(int i=0; i<a.length; i++)
        {  for(int j = 0; j<a[0].length; j++)
            {
                a[i][j]=A[k++];
            }
        }
    }

    public void display()
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}

    