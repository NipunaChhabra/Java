//conversion decimal to binary
class DecimalToOctal
{
    public static void main(int deci)
    { int copy = deci; String oct = ""; long octDigit;
        while(deci!=0)
        {
            octDigit = deci%8;
            deci= deci/8;
             oct =octDigit+oct ;
        }
        System.out.println(oct);
    }
}