class Conversion
{int dec;StringBuffer a=new StringBuffer("");
    public void Conversion(int dec)
    {
        this.dec=dec;
    }

    public void convert()
    {int r=dec%16;
        while(r>0)
        {
            dec=dec/16;
            if(r<=9) a=a.append(r);
            else if(r==10)
            {a=a.append('a');}
            else if(r==11)
            {a=a.append('b');}
            else if(r==12)
            {a=a.append('c');}
            else if(r==13)
            {a=a.append('d');}
            else if(r==14)
            {a=a.append('e');}
            else if(r==15)
            {a=a.append('f');}
            r=dec%16;
        }
            }

    public void display ()
    {
        a=a.reverse();
        System.out.println(a);
    }
}
   