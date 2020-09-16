class SerialSearch
{
    public static void main(int ns)
    {
        int n[]={2,3,4,45,56,7,8,9,1};
        for(int i = 0; i<n.length; i++)
        {
            if(ns==n[i])
            {System.out.println(ns + "Is found at position " + (i+1));
                return;
            }
        }

            System.out.println(ns + "not found");
        }
    }
