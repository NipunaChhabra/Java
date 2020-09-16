class MagicSquare
{
    int M[][]; int o;
    public MagicSquare(int o)
    {
        int m[][]=new int[o][o];
        M=m;
        this.o=o;
    }

    public void genMagicSquare()
    {
        int A  =1;
        int r =0, c=o/2;
        while(A<=o*o)
        {M[r][c]=A;
            if(A%3==0)
                r++;
            else{ r--; c++;}
            if(r<0)r=o-1;
            if(c>2)c=0;
            A++;
        }
    }

    public void display()
    {
        for(int i=0; i<o; i++)
        {
            for(int j=0; j<o; j++)
            {
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

                