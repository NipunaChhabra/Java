class Encryption
{ String sentence; String w[]=new String[20]; int wk;
    public Encryption(String sentence)
    {
        this.sentence=sentence;}

    private void extractWord ()
    {
        int L=sentence.length(); int k=0;
        for(int i=0; i<L; i++)
        {char x = sentence.charAt(i);
            if(x==' '||x=='.'||x==','||x=='!'||x=='?')
                k++;
            else w[k]=w[k]+x;}
        wk =k;
    }

    private void reverseSpell()
    {String t;
        for(int j=0; j<wk; j++)
        {  t = "";
            for(int i=w[j].length(); i>=0; i--)
            {t=t+w[j].charAt(i);}
            w[j]=t;
        }
    }

    private void encrypt()
    {String t;
        for(int j=0; j<wk; j++)
           { t = "";
         for(int i=0; i<w[j].length(); i++)
            {int k = (int)w[j].charAt(i)+1;
                t=t+(char)k;}
            w[j]=t;
        }
    }

    private void reverseSentence()
    {  String t = "";
        for(int j=wk; j>=0; j++)
        {
            t=t+j;
        }
        sentence= t;
    }

    public static void main(String args[])
    {String sen = args[0]; 
        Encryption obj = new Encryption(sen);
        obj.extractWord ();
        obj.reverseSpell();
        obj.encrypt();
        obj.reverseSentence();
    }
}

