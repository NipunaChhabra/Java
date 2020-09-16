import java.util.Scanner;
//deleteAndInsert
class Insertion extends Base
{int n; int p;
    public Insertion()
    {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter position, then number");
        p = ab.nextInt();
        n= ab.nextInt();
    }

    public void Insert()
    {
        for(int i = NE+1; i>p; i--)
        
            A[i]=A[i-1];
                A[p-1]=n;
    }
}

    