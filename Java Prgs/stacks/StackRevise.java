class StackRevise
{
    int s[]= new int [5];int top;
    public StackRevise()
    {top = -1;}

    public void push(int n)
    { s[++top]=n;}

    public int pop()
    {int r =s[top];
        s[top--]=0;
        return r;
    }

    public boolean isOverflow();
    

    public boolean isUnderflow()
    {
    }

    public static void main()
    {
    }
}
