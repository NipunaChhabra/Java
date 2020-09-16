class StackOperations
{SNode top;
    void push(String nm)
    {
        SNode n = new SNode(nm);
        n.next= top;
        top= n;
    }

    void pop()
    {System.out.println("data removed is"+top.name);
        top = top.next;}

    boolean stackUnderFlow()
    {
        if(top==null)return true;
        else return false;
    }

    void displaystack()
    {System.out.println("\n The Stack is as follows");
        SNode current = top;
        while(current!=null)
        {
            System.out.println(current.name);
            current= current.next;}
    }

}