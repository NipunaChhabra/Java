import java.util.*;
class SimpleQueue
{ 
    int Q[] = new int[5];
    int f, r;
    public SimpleQueue()
    {
        f=0; r=-1;}

    public void add(int n)
    {r++; Q[r]=n;}

    public int remove()
    {
        int t = Q[f];
        for(int i =0; i<r; i++)
        {
            Q[i] = Q[i+1];
            Q[r] =0; r--;}
            return t;
        
    }
    
    public boolean isUnderflow()
    { if(f>r) return true; else return false;}
    
    public boolean isOverflow()
    {
        if(r>=Q.length-1)return true;
        else return false;
    }
    
    public void display()
    {for(int i=f; i<=r; i++)
        System.out.println(Q[i]+" " );
    }
    
    public static void main(String args[])
    {Scanner k = new Scanner(System.in);
        SimpleQueue Queue1 = new SimpleQueue();
        while(true)
        {
            System.out.println("1.add");
            System.out.println("2.remove");
            System.out.println("3.display");
            System.out.println("0. exit");
            System.out.println("Enter choice0/1/2/3");
            int ch = k.nextInt();
            switch(ch)
            {
                case 1:
                if(Queue1.isOverflow())
                {System.out.println("Queue full");break;}
                System.out.println("enter item");
                int n = k.nextInt();
               Queue1.add(n);
                break;

                case 2:
                if(Queue1.isUnderflow())
                {
                    System.out.println("Queue empty"); break;}              
                System.out.println("Removed:"+Queue1.remove());
                break;

                case 3:
                Queue1.display();
                break;

                case 0:return;
                default:
                System.out.println("error");
            }
            for(long i=1; i<2000000000; i++){}
            System.out.println((char)12);
        }
    }
}

    