class StringOperations
{
    String name = "";
    
    public StringOperations(String n )
    {name=n;}
    
    public void countA()
    {
        int a = 0;
        int L = name.length();
        for( int i = 0; i<L; i++)
        {
            char c= name.charAt(i);
            
            if(c=='a' || c=='A')
            {
                a++;
            }
        }
        System.out.println("The number of As in the name " + name + " are " + a);
    }

    public void joinFirstAndLast()
    {
        int l=name.length();
        String ans="";
        String f=name.substring(0,2);
        String la=name.substring(l-2,l);
        ans=f+la;
        System.out.println("Ans= " +ans);
    }
    
    public static void main()
    {
        StringOperations object1=new StringOperations("Anuhsa");
        object1.countA();
        object1.joinFirstAndLast();
    }
}
        
        