import java.util.Scanner;
class WordFrequencySir
{
    String sen;
    int f[] = new int[100];
    String w[] = new String[100];
    int wc;

    public void enterData()
    {Scanner sb = new Scanner(System.in);
        System.out.println("Enter data");
        sen = sb.nextLine();
    }

    public void extractWords()
    {        int k=0; w[0]="";
        for(int i =0; i<sen.length(); i++)
        {char x=sen.charAt(i);
            if(x==' '||x=='.')
            {k++;
                w[k]="";
            }
            wc=k;	
        }
    }
    
    

    void countFreq()
    {for(int i=0; i<wc; i++)
        {
            for(int j = i+1; j<wc; j++)
            {
                if(w[i].equalsIgnoreCase(w[j]))
                {f[i]++;
                    if(i!=j)w[j]="";

                }
            }
        }

        for(int i =0; i<wc; i++)
        {
            if(f[i]==0&& w[i].equals(""))continue;
            System.out.println(w[i]+"\t" + f[i]);
        }
    }
}        
