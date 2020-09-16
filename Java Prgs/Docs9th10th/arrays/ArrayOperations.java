import java.util.*;
class ArrayOperations
{
    int n[]= new int[10];
    Scanner k= new Scanner(System.in);
    
    void enterData()
    {
        for(int i=0; i<n.length; i++)
        {
            System.out.println("Enter number " + (i+1));
            n[i]=k.nextInt();
        }
    }
    
    void biggest()
    {
        int l=n[0];
        for(int i=1; i<n.length; i++)
        {
            if (n[i]>l) l=n[i];
        }
        System.out.println("Biggest of all: " + l);
    }
    
    void sumOfAll()
    {
        int sum=0;
       for (int i=0; i<n.length; i++)
        {
            sum=sum+n[i];
        }
        System.out.println ("Sum of numbers: " + sum);
    }
    
    void reverseTraverse()
    {
        for(int i=n.length -1; i>0; i--)
        {
            System.out.println(n[i]);
        }
    }
}
            