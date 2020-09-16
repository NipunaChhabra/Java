import java.util.*;
class Correlation
{ static int m[],c[],n,rsm[],rsc[],rm[],rc[],dis;

    public Correlation(int n)
    {this.n=n;
        int M[]= new int[n];
        int C[] = new int[n];
        Scanner ab = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {  System.out.println("Enter Maths and Computer marks for" + i);
            M[i] = ab.nextInt();
            C[i] = ab.nextInt();
        }
        c=C;
        m=M;
    }

    public  void rhoRankSort()
    {
        int r[];
        for(int k=1; k<3; k++)
        {if (k%2==0)r=m;
            else r= c;
            for(int i =0; i<n; i++)  
            {
                for(int j = i+1; j<n; j++)
                {
                    if(r[i]<r[j])
                    {int t = r[i];
                        r[i] =r[j]; 
                        r[j]=t;
                    }
                }
            }
            if (k%2==0)rsm = r;
            else  rsc = r;
        }
    }

    public  void rank()
    {for(int i=0; i<n; i--)
        {for(int j = 0; j<n; j--)
            {if(m[i]==rsm[j])rm[i] =j+1;
                if(c[i]==rsc[j])rc[i] =j+1;}
        }
    }

    public  void diS()
    {int s= 0;
        for(int i=0; i<n; i++)
        {s= s+((rm[i]-rc[i])*(rm[i]-rc[i]));}
        dis=s;
    }

    public double rho()
    {Correlation obj = new Correlation(n);
        obj.rhoRankSort();
        obj.rank();
        obj.diS();
        double r =1-((6*dis)/(n*(n*n-1)));
        return r;
    }

    public static int tauS(int i, int j)
    {int xi = m[i];
        int yi= c[i];
        int xj = m[j];
        int yj = c[j];
        if(xi>xj&&yi>yj) return 2;
        else if(xi<xj&&yi<yj) return 2;
        else return -2;
    }

    public int tau()
    { int sum =0; 
        for(int i=1; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {sum = sum + tauS(i,j);
            }
        }
        return (sum/(n*(n-1)) ) ;

    }

    public static void main(String args[])
    {int t = Integer.parseInt(args[0]);
        Correlation obj = new Correlation(t);
        System.out.println("Rho" + obj.rho());
        System.out.println("Tau" + obj.tau());
    }
}

