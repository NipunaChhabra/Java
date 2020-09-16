//conversion decimal to binary
class DecimalToBinary
{
    public static void main(int deci)
    { int copy = deci; String bin = ""; long binDigit;
        while(deci!=0)
        {
            binDigit = deci%2;
            deci= deci/2;
             bin =binDigit+bin ;
        }
        System.out.println(bin);
    }
}