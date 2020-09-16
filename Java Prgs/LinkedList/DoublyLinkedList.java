import java.util.Scanner;
class DoublyLinkedList
{ DoublyLLNode first;
    Scanner s = new Scanner(System.in);
    DoublyLLNode Last;
    public void createDLinkedList()
    {
        System.out.println("enter no. of nodes");
        int nm = s.nextInt();
        System.out.println("enter roll no.");
        int r = s.nextInt();
        System.out.println("enter first name");
        String n = s.next();
        first = new DoublyLLNode(r,n);
        first.pre = null;
        Last = first;

        for(int i =2; i<=nm; i++)
        {System.out.println("enter roll number");
            r= s.nextInt();
            System.out.println("enter name");
            n= s.next();
            DoublyLLNode current = new DoublyLLNode(r,n);
            Last.nxt = current; 
            current.pre=Last;
            Last = current;
        }
    }

  /*  //last cannot be deleted
    void deleteNode(int nm)
    {
        DoublyLLNode current = first; 
        DoublyLLNode t = null, p = null; 
        int i = 1; 
        while(current !=null)
        {if(nm==1){first= first.nxt;} 
            else if(nm==i)
            {
                t.pre=p;
                t.nxt=current.nxt; 
                break;
            }
            else 
            {p = current.pre; 
                t = current;
                current=current.nxt;
                i++;
            }
        }
    }
*/
    void insertNode(int p )
    {
        DoublyLLNode current = first;
        int i = 1;
        while(current!=null)
        {
            if(i==(p-1))
            {
                System.out.println("enter roll number of new student");
                int r = s.nextInt();
                System.out.println("enter nm  now");
                String nm = s.next();
                DoublyLLNode x = new DoublyLLNode(r, nm);
                x.nxt=current.nxt;
                current.nxt=x;
                break;}
            current =current.nxt;
            i++;
        }
    }

    void deleteNode(int nm)
    {
        DoublyLLNode current = first; 
        DoublyLLNode t = null; 
        int i = 1; 
        while(current !=null)
        {if(nm==1){first= first.nxt; t=first;}
            else if(nm==i)
            {
                current=current.nxt;
                t.nxt=current;
                current.pre=t;
                break;
            }
            else 
            { 
                t = current;
                current=current.nxt;}
            i++;

        }
    }

    void displayascending()
    {
        DoublyLLNode cr = first;
        while(cr!=null)
        {
            System.out.print(cr.rn);
            System.out.println(cr.nm);
            cr=cr.nxt;
        }
    }

    void displaydescending()
    {DoublyLLNode cr =Last;
        while(cr!=null)
        {
            System.out.print(cr.rn);
            System.out.println(cr.nm);
            cr=cr.pre;
        }
    }
}

