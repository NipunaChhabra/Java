import java.util.Scanner;
class SLinkedList
{StudentNode first; Scanner s = new Scanner(System.in);
    /*public void createLinkedList()
    {StudentNode n1 = new StudentNode(1, "Chakshu");
    StudentNode n2 = new StudentNode(2, "Riddhi");
    StudentNode n3 = new StudentNode(3, "Swarna");
    StudentNode n4 = new StudentNode(4, "Anushka");
    StudentNode n5 = new StudentNode(5, "Sonalika");

    first = n1;
    n1.nxt=n2;
    n2.nxt=n3;
    n3.nxt=n4;
    n4.nxt=n5;   
    }*/

    public void createLinkedList()
    {
        System.out.println("enter no. of nodes");
        int nm = s.nextInt();
        System.out.println("enter roll no.");
        int r = s.nextInt();
        System.out.println("enter first name");
        String n = s.next();
        first = new StudentNode(r,n);
        StudentNode last = first;
        for(int i =2; i<=nm; i++)
         {System.out.println("enter roll number");
            r= s.nextInt();
            System.out.println("enter name");
            n= s.next();
        
         StudentNode current = new StudentNode(r,n);
        last.nxt = current;
        last = current;
         }
        }

  //1 cannot be deleted  
    void deleteNode(short nm)
    {
        StudentNode current = first;
        StudentNode t= null;
        int i = 1; 
        while(current !=null)
        {if(nm==1){first=first.nxt;return;}
         if(nm ==i)
            {
                t.nxt=current.nxt;
                break;
            }
            else t = current;
            current=current.nxt;
            i++;
        }
    }

    void insertNode(int p )
    {
        StudentNode current = first;
        int i = 1;
        while(current!=null)
        {
            if(i==(p-1))
            {
                System.out.println("enter roll number of new student");
                int r = s.nextInt();
                System.out.println("enter nm  now");
                String nm = s.next();
                StudentNode x = new StudentNode(r, nm);
                x.nxt=current.nxt;
                current.nxt=x;
                break;}
            current =current.nxt;
            i++;
        }
    }
    

    public int countNodes()
    {StudentNode cr= first; int count=0;
        while(cr!=null)
        {count++;
            cr=cr.nxt;
        }
        return count;
    }
    
    
    void displayll()
    {
        StudentNode cr = first;
        while(cr!=null)
        {
            System.out.print(cr.rn);
            System.out.println(cr.nm);
            cr=cr.nxt;
        }
    }
    
    /*
    int sum(StudentNode x)
    {
        if(x==null)return 0;
        else return x.value + sum(x.nxt);
    }*/
    
    //to split a linked list after a given position/number;
   /* void splitList(int num)
    {StudentNode cr = first; 
        while(cr!=null)
        {if(cr==num)
            
        }
        
    }*/
}




