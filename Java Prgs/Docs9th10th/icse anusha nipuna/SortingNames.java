// Sorting names using selection sort
class SortingNames
{
    String names[] = {"aastha", "nipuna","anusha","shreya","sarah","shivani"};
    public void sort()
    {
        for(int i = 1; i<names.length; i++)
        {
            for(int j=i; j<names.length-1; j++)
            {
                if(names[i].compareTo(names[j+1])>0)
                {
                    String t = names[i];
                    names[i]=names[j+1];
                    names[j+1]=t;
                }
            }
        }

        for(int i=1; i<names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}

    
        