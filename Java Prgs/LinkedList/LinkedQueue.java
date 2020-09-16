class LinkedQueue
{
    QNode front, rear;

    public LinkedQueue()
    {front = rear =null;}

    void addFirstNode(int rn, String nm)
    {
        front = new QNode(rn, nm);
        rear = front;}

    void addNodes(int rn, String nm)
    {QNode N = new QNode(rn , nm);
        rear.next = N;
        rear = N;
    }

    public void remove()
    {
        System.out.println("Data removed :" + front.rn
            + "." + front.name);
        front = front.next;
    }

    boolean queueUnderFlow()
    {
        if(front==null)return true;
        else return false;
    }

    void displayQueue()
    {
        System.out.println("The Queue");
        QNode cr = front;
        while(cr!=null)
        {
            System.out.println(cr.rn + "  " + cr.name);
            cr= cr.next;
        }

    }
}

        