class BinarySearch
{
    public static void main(int n)
    {
        int a[]={12,23,56,78,90,97,99};
        int max=a[a.length-1];
        int min=a[0];

        while(min<=max)
        {
            int mid= (max+min)/2;
            if(n==a[mid])
            {
                System.out.println(n +"found at" + (mid+1));
                return;
            }
            else if(n>a[mid])
                min=mid;

            else max=mid;
        }

        System.out.println("number not found");
    }
}