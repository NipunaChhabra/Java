
class TelephoneDirectory
{
    String name[];
    long number[];
    
    public TelephoneDirectory(String name[], long number[])
    {
        this.name=name;
        this.number=number;
    }
    
    public void arrange()
    {
        for (int p=1; p<name.length; p++)
        {
            for (int j=0; j < name.length-p; j++)
            {
                if(name[j].compareTo(name[j+1]) > 0)
                {
                    String temp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = temp;
                    long t = number[j];
                    number[j]= number[j+1];
                    number[j+1] = t;
                }
            }
        }
    }
    
    public void display()
    {
        for(int i = 0; i<name.length; i++)
        {
            System.out.println(name[i] + " " + number[i]);
        }
    }
 
    public static void main()
    {
        String nm[] = { "MUSKAN", "NAINA", "SHIVANI", "NIPUNA", "MINI" , "ANUSHA"};
        long ph[]= { 1111,2222,3333,5555,4444,6666};
        TelephoneDirectory a = new TelephoneDirectory(nm, ph);
        a.arrange();
        a.display();
    }
}

        
                   
                    