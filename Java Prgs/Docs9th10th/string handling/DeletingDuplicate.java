class DeletingDuplicate
{
    public static void main(int n[])
    {
        int s[] = new int[n.length];
        int s1 = 0;
        boolean k = true;
        
        for(int i = 1; i<n.length; i++)
        {
            for(int j = i; j<n.length; j++)
            {
                if(n[i-1] == n[j]) k=false;
            }
            if(k==true)
            {
                s[s1] = n[i-1];
                s1 = s1 + 1;
            }
            k= true;
        }
        int a[] = new int[s1+1];
        for(int i =0; i<s1; i++)
        {
            a[i]=s[i];
        }
        for(int i =0; i<a.length; i++)
        {
           System.out.println(a[i]);
        }
    }
}
            

            
        