class VowelWords
{
 public static void vowelWords(String m)
  { String word = ""; 
    for(int i=0; i<m.length(); i++)
     { 
      if(m.charAt(i)==' '|m.charAt(i)==','||m.charAt(i)=='.')
       {
        if(word.charAt(0)=='a'||word.charAt(0)=='e'||word.charAt(0)=='i'||
        word.charAt(0)=='o'||word.charAt(0)=='u')          
         System.out.println(word);
         else if(word.charAt(word.length()-1)=='a'||word.charAt(word.length()-1)=='e'||
         word.charAt(word.length()-1)=='i'||word.charAt(word.length()-1)=='o'||
         word.charAt(word.length()-1)=='u')
               
               System.out.println(word);
            
        
        word="";
    }
            word  = word + m.charAt(i);
        }
    }
}