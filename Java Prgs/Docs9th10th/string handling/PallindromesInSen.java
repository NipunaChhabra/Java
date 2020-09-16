class PallindromesInSen
{String sen; String w[]= new String[40]; int wk;
    public PallindromesInSen(String sen)
    {this.sen=sen;
    }

    public void extractWords()
    {
        int L=sen.length(); int k=0; w[k]="";
        for(int i=0; i<L; i++)
        {char x = sen.charAt(i);
            if(x==' '||x=='.'||x==','||x=='!'||x=='?')
                {k++; w[k] = "";}
            else w[k]=w[k]+x;}
        wk =k;
    }
   
    public void Special()
    {System.out.println("Specials:");
        for(int i=0; i<wk; i++)
        {
            if(w[i].charAt(0)==w[i].charAt(w[i].length()-1))
            {System.out.println(w[i]);
            }
        }
    }

    public void Pallindrome()
    { System.out.println("pallindromes:");
        for(int i=0; i<wk; i++)
        {  String rev="";
            for(int j=w[i].length()-1; j>=0; j--)rev= rev+ w[i].charAt(j);
            if(w[i].equalsIgnoreCase(rev))System.out.println(w[i]);      
        }
    }
    public static void main(String args[])
    {PallindromesInSen obj = new PallindromesInSen(args[0]);
        obj.extractWords();
       obj.Special();
       obj.Pallindrome();
        }
}

        