//contact search
class ContactList
{
    public static void main(String ns)
    {
        String names[]={"Nipuna","Anusha","Naina","Sarah","Aastha","Navya","Shivani"};
        long phone[] = {7656458,78574389,8746237,784389,6746875,734673};
        
        boolean s = false;
        for(int i = 0; i<phone.length; i++)
        {
            if(names[i].startsWith(ns))
            {
                System.out.println(names[i] + " " + phone[i]);
                s=true;
            }
        }
        if(s==false)
        System.out.println(ns+ " is not in the list");
    }
}

            
            