//currency
class NotesCalculator
{
    public static void main (int amount)
    {
        int bal=amount;
        
        int r1000=bal/1000;
        bal=bal%1000;
        
        int r500=bal/500;
        bal%=500;
        
        int r100=bal/100;
        bal%=100;
        
        int r50=bal/50;
        bal%=50;
        
        int r20=bal/20;
        bal%=20;
        
        int r10=bal/10;
        bal%=10;
        
        int r5=bal/5;
        bal%=5;
        
        int r2=bal/2;
        bal%=2;
        
        int r1=bal;
        
        System.out.println("Amount:Rs. " + amount);
        System.out.println("Rs. 1000 : " + r1000);
        System.out.println("Rs. 500: " + r500);
        System.out.println("Rs. 100: " + r100);
        System.out.println("Rs. 50: " + r50);
        System.out.println("Rs. 20: " + r20);
        System.out.println("Rs. 10: " + r10);
        System.out.println("Rs. 5: " + r5);
        System.out.println("Rs. 2: " + r2);
        System.out.println("Rs. 1: " + r1);
    }
}
        
        