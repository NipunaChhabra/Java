class NoteCalc
{   int bal,tthousand,fhundred,
    hundred,fifty,twenty,ten,five,two,one;  
    public void notesAssign(int n)
    {
        int bal = n;
         tthousand = bal/2000; bal=bal%2000;
         fhundred= bal/500;bal=bal%500;
         hundred = bal/100; bal = bal%100;
         fifty = bal/50; bal = bal%50;
         twenty = bal/20; bal=bal%20;
         ten = bal/10; bal = bal%10;
         five = bal/5; bal = bal%5;
         two = bal/2;int one = bal%2;

    }

    public void display()
    {
        System.out.println("two thousand: " + tthousand);
        System.out.println("five hundred: " + fhundred);
        System.out.println("hundred: " + hundred);
        System.out.println("fifty: " + fifty);
        System.out.println("twenty" + twenty);
        System.out.println("ten " + ten);
        System.out.println("five: " + five);
        System.out.println("two: " + two);
        System.out.println("one: " + one);
    }

    public static void main(String args[])
    {   int n = Integer.parseInt(args[0]);
        NoteCalc obj = new NoteCalc();
        obj.notesAssign(n);
        obj.display();
    }

}




        