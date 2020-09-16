//Longest Word
class LongestWord2
{
    void main(String sen)
    { sen = sen +" ";
        String w = "";int big = 1; String fin="";
        for(int i =0; i<sen.length()-1; i++)
        {
            if(sen.charAt(i)==' ')
            {if(w.length()>big)
                {big=w.length();
                    fin = w;
                    w="";}
            }
            else 
            {w=w+sen.charAt(i);

            }
        }
        System.out.println(fin);

    }
}

            