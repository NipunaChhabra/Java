class Dqueue
{
    int Dq[]=new int[5];
    int f, r;
    public Dqueue
    {f=0; r=-1;}
    public void addAtRear(int n)
    {r++; Dq[r]=n;
    }

    public void addAtFront()
    {dq[--f]=n;}

    public int removeFromFront()
    {int r=Dq[f]; Dq[f]=0;f++;
        return r;}

    public void removeFromRear()
    {int r1 = Dq[r];
        Dq[r]=0;
        r--;
        return r1;
    }
    
    public void displayDqueue()
    {System.out.println("Data items in the Dqueue are:");
        for(int i =f; i<=r; i++)
        System.out.println(Dq[i]+"\t");
    }
    
    boolean isDQueueEmpty()
    {if(f==0&&r>=0)
        return true;
        else return false;
    }
    boolean is RearFull{
        if(r>=Dq.length-1)
        return true;
        else return false;
    }
     import java.util.Scanner;
     class DQueueDemo
     {
         Scanner S = new Scanner(System.in)
         Dqueue D1=new Dqueue();
         while(true)
         {
             System.out.println((char)12);
             System.out.println("1. Add at rear");
             System.out.println("

    
        