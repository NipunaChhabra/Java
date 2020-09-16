import java.util.*;
class KeyEncryption
{
    String key; String sentence; 
    char A[]={'a','b','c','d','e','f','g','h',
            'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public KeyEncryption(String key, String sentence)
    { this.key=key;
        this.sentence=sentence;}

    public void SetCharacters()
    {char a; int k; int t;
        for(int i =0; i<key.length(); i++)
        {  
            for(int j=0; j<A.length; j++)
            {
                if(key.charAt(i)==A[j])
                { a =A[j];
                    k =j-1;
                    while(k>=i)
                    {A[k+1]=A[k]; k--;}
                    A[i]=a;}
            }
        }
    }

    public void encryption()
    { String s=""; char t=' '; 
        for(int i=0; i<sentence.length(); i++)
            {if(sentence.charAt(i)==' ')
                t=' ';
            else 
            { int l = (int)sentence.charAt(i);
                int c= 122-l;
                t=A[c];}
             s=s+t;       
    }
    System.out.println(s);
}
}

