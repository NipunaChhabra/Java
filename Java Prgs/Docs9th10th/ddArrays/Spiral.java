class Spiral
{
    int m[][]; int ord;
    public Spiral(int ord)
    {int m[][] = new int[ord][ord];
        this.m=m;
        this.ord = ord;}

    public void OddExecute()
    {  int n=0;
        for(int i=0; i<=(ord-1)/2; i++)
        {
            m[i][i]=++n;
            //System.out.println(m[i][i]);
            if(n>=ord*ord)return;
            for(int rl=i+1; rl<ord; rl++)
            {m[i][rl] =++n;
                //System.out.println(m[i][rl]);
            }
            --n;    
            for(int r=i+1; r<ord; r++)
                {m[r][ord-1-i]=++n;
                    //System.out.println(m[r][ord-1-i]);
                }
                --n;   
                    for(int j=ord-2-i; j>=0; j--)
                    { m[ord-1-i][j]=++n;
                        //System.out.println(m[ord-1-i][j]);
                    } --n;  
                        for(int k=ord-2-i; k>0; k--)
                        { m[k][i]=++n;
                            //System.out.println(m[k][i]);
                        } --n;  
                        }
                    }

                    public void display()
                    {
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


            