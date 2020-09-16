class BinaryToDecimal
{
    public static void main(long bin)
    {    int digit; long copy = bin; int count= 0;long deciDigit; long deci=0;
        while(bin!=0)
        {
            digit= (int)bin%10;  
            deciDigit = digit *(int)Math.pow(2,count);
            deci = deci + deciDigit;
            count ++;
            bin = bin/10;
        }
        System.out.println(deci);
    }
}