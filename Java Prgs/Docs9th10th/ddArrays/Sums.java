class Sums
{
    int a[][];
    public Sums(int a[][], int b[][])
    {
        this.a=a;
    }

    public int addMainDiag()
    {  int sum1 = 0;
        for(int i=0; i<a.length;i++)
        {
            for(int j=0; j<a[0].length; i++)
            {
                if(i==j)sum1+=a[i][j];
            }
        }
        return sum1;
    }

    public int addOtherDiag()
    {  int sum1 = 0;
        for(int i=0; i<a.length;i++)
        {
            for(int j=0; j<a[0].length; i++)
            {
                if(i+j==a.length-1)sum1+=a[i][j];
            }
        }
        return sum1;
    }

    public void addColumn()
    {int s[]=new int[a[0].length];
        for(int i =0; i<a[0].length; i++)
        {for(int j=0; j<a.length; j++)
            { s[i]=a[j][i];}
        }
    }

    public void displayMatrix()
    {
        for(int i=0; i<a.length; i++)
        {  for(int j = 0; j<a[0].length; j++)
            {
                System.out.println(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public  int addMDiag()
    {int sum=0; 
        for(int i = 0; i<a.length; i++)
        {sum+= a[i][i];
        }
        return sum;
    }

    public  int addODiag()
    {int sum=0; 
        for(int i = 0; i<a.length; i++)
        {sum+= a[a.length-i][a.length-i]; 
        }
        return sum;
    }

}

            