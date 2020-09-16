class DecimalToHexadecimal
{int x; String result;
    public  DecimalToHexadecimal(int x)
    {this.x=x;
    }

    public void convert()
    {char r;int t = x%16;
        while(t>0)
        {
            if(t==10)  r='A';                                                                                                                                               
             else if(t==11)r='B';
             else if(t==12)r='C';
             else if(t==13)r='D';
             else if(t==14)r='E';
             else if(t==15)r='F';
            x=x/16;
            t=t%16;
            }
        }
