import java.util.*;
class WordFrequency
{  String a; int F[];
    String A[] =  new String[100];

    public WordFrequency()
    {Scanner ab = new Scanner(System.in);
        System.out.println("Enter data");
        a = ab.nextLine();
    }

    public int CountExtractWords()
    {int k=0; int t= 0; 
        loop1: for(int i =0; i<a.length(); i++)
        {   if(a.charAt(i)==' '||a.charAt(i)=='?'||
            a.charAt(i)=='!'||a.charAt(i)=='.')
            {String t1 = a.substring(t,i);
                for(int j = 0; j<k; j++)
                { if(t1==A[j])continue loop1;
            }
                   A[k]= t1;k++; t=i+1;}
                
            }
        
            return k;
        
    }

    public void frequency()
    {int f[] = new int[CountExtractWords()]; int t =0;
        for(int j=0; j<CountExtractWords(); j++)
        { for(int i =0; i<a.length(); i++)
            {   if(a.charAt(i)==' '||a.charAt(i)=='?'||
                a.charAt(i)=='!'||a.charAt(i)=='.')
                     { String t1 = a.substring(t,i); t=i+1;
              
                if(A[j].equalsIgnoreCase(t1)) {f[j]++;}
            }
            }
        }
        F=f;
    }

    public static void main(String args[])
    {WordFrequency obj= new WordFrequency();
        obj.CountExtractWords();
        obj.frequency();
        for(int i =0; i<obj.CountExtractWords(); i++)
        {System.out.println(obj.A[i] + " : " +obj.F[i]);
        }
    }

}
