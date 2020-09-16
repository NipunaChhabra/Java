class stat
{
    double x[];
    int f[];
    public stat(double x[], int f[])
    {this.x=x;
        this.f=f;
    }

    public double AMean()
    {double sumfx=0; int sumf=0;
        for(int i=0; i<x.length; i++)
        {sumfx = sumfx + (x[i]*f[i]);
            sumf= sumf+ f[i];}
        return sumfx/sumf;}

    public double mode()
    {int m =0; int mp=0;       
        for(int i=0; i<f.length; i++)
            {if(f[i]>m)
                {if(x[i]>x[mp]) {m=f[i]; mp=i;}}
            }
            return x[mp];
        }
    }
    

    