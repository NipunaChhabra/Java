class SerialSearch
{ double n[]={2,3,4,45.256,7,8,9,1};
    public  void main(double ns)
    {
       
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
