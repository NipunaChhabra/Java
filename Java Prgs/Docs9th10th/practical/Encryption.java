class Encryption
{
    public static void main(String name)
    {
        int l=name.length();
        String res="";
        
        for(int i=l-1; i>=0; i--)
        {
            char c=name.charAt(i);
            int u = (int)c;
            u = u + 2;
            if(u== 124) u=98;
            if(u== 92) u=66;
            if(u== 123) u=97;
            if(u==91) u= 65;
            c = (char)u;
            res= res+c;
        }
        System.out.println("Encrypted string: " + res);
    }
}
        
        