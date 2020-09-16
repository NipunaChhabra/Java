class Mirror
{
    int a[][]; int m[][];
    public Mirror(int a[][])
    {this.a=a;
        int m[][] = new int[a.length][a[0].length];
        this.m=m;
    }

    public void formMatrix()
    {for(int i=0; i<a.length; i++)
         {   int n=0;
       for(int j=a[0].length-1; j>=0; j--)
        m[i][n++] = a[i][j];

    }}

    public void display()
    { System.out.println("original: ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println("mirror: ");
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

        