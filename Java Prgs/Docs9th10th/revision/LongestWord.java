//Longest Word
class LongestWord
{
    void main(String sen)
    { sen = sen +" ";
        String w = "";int big = 1; String fin="";
        for(int i =0; i<sen.length()-1; i++)
        {
            if(sen.charAt(i)!=' ')
                w=w+sen.charAt(i);
            else 
            {
                if(w.length()>big)
                {big=w.length();
                    fin = w;}
                w="";}
        }
        System.out.println(fin);
    
    }

}

       
            