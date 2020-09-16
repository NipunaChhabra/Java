class NumberToWord
{
    public String hundred()
    {return("hundred");}

    public String thousand()
    {return("thousand");}

    public String million()
    {return("million");}

    public String units(int n)
    {String u[]={"","One","two","three","four","five","six","seven","eight","nine"};
        return(u[n]);
    }

    public String teens(int n)
    {String te[]={"","Eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        return(te[n-10]);
    }
 public String tens(int n)
    {String tel[]={"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        return(tel[n]);
    }
    public String convert(int n)
    { String w ="";
        int m=n;
    int t= n%100;
    m=n/100;
    if(t/10==1)w=w+teens(t);
    else {w= w + tens(t/10) + " " + units(t%10);}
    int t1= m%10;
    w=units(t1)+" "+hundred()+" "+w;
    m=m/10;
   if(m/10!=0) w=" " +thousand()+" "+w;
    if(m/10==1)w=teens(m)+w;
    else { w=units(m%10)+w; w=tens(m/10)+w;}
   
   
      
    return w;
}
}
    
             



    