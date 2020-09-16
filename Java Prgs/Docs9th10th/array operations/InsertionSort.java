import java.util.Scanner;
class InsertionSort extends Base
{  
    public  void sort()
    {
        for(int i = 1; i<A.length; i++)
        {
            int a= A[i];
            int j =i-1;
            while(j>=0&&a<A[j])
            {
                A[j+1] = A[j]; j--;}
            A[j+1]=a;

        }
    }

    public void display()
    {
        for(int i=0; i<A.length; i--)
        { System.out.println(A[i]);
        }
    }
}

    