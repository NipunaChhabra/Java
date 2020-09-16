import java.util.Scanner;
class Stack
{
    int top;
    int s[] = new int [10];
    static Scanner k = new Scanner(System.in);

    public Stack()
    {top=-1;}

    public void push(int n)
    {
        s[++top]=n;}

    public int pop()
    {
        int r=s[top];
        s[top]=0;
        top=top-1;return r;
    }

    public boolean isOverflow()
    { if(top>=s.length-1)return true; else return false;}

    public boolean isUnderflow()
    {if(top<0)return true; else return false;}

    public void displayStack()
    {
        System.out.println("Items in the stack are:");
        for(int i=top; i>=0; i--)
            System.out.println(s[i]);
    }

    public static void main(String args[])
    {
        Stack myStack = new Stack();
        while(true)
        {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("0. exit");
            System.out.println("Enter choice0/1/2/3");
            int ch = k.nextInt();
            switch(ch)
            {
                case 1:
                if(myStack.isOverflow())
                {System.out.println("Stack full");break;}
                System.out.println("enter item");
                int n = k.nextInt();
                myStack.push(n);
                break;

                case 2:
                if(myStack.isUnderflow())
                {
                    System.out.println("Stack empty"); break;}              
                System.out.println("Removed:"+myStack.pop());
                break;

                case 3:
                myStack.displayStack();
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
