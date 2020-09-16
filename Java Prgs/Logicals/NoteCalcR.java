class NoteCalcR
{   int bal,tthousand,fhundred,
    hundred,fifty,twenty,ten,five,two,one,tn,total;  
    public void notesAssign(int n)
    {
        total =n;
        int bal = n;
        tthousand = bal/2000; bal=bal%2000;
        fhundred= bal/500;bal=bal%500;
        hundred = bal/100; bal = bal%100;
        fifty = bal/50; bal = bal%50;
        twenty = bal/20; bal=bal%20;
        ten = bal/10; bal = bal%10;
        five = bal/5; bal = bal%5;
        two = bal/2;one = bal%2;
        tn = tthousand+fhundred+hundred+fifty+twenty+ten+five+two+one;
    }

    public void display()
    {
        if(tthousand>0)System.out.println("2000 * " + tthousand + "=" + (2000*tthousand));
        if(fhundred>0) System.out.println("500 * " + fhundred + "=" + (500*fhundred));
        if(hundred>0)System.out.println("100 * " + hundred + "=" + (100*hundred));
        if(fifty>0)System.out.println("50 * " + fifty + "=" + (50*fifty));
        if(twenty>0)System.out.println("20 * " + twenty + "=" + (20*twenty));
        if(ten>0)System.out.println("10 * " + ten + "=" + (10*ten));
        if(five>0)System.out.println("5 * " + five + "=" + (5*five));
        if(two>0)System.out.println("2 * " + two + "=" + (2*two));
        if(one>0)System.out.println("1* " + one + "=" + (1*one));
        System.out.println("total number of notes" + tn);
        System.out.println("total " + total);
    }

    public static void main(String args[])
    {   int n = Integer.parseInt(args[0]);
        NoteCalcR obj = new NoteCalcR();
        obj.notesAssign(n);
        obj.display();
    }
}

        