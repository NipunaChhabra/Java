
class OctalToDecimal
{
    public static void main(long oct)
    {    int digit; long copy = oct; int count= 0;long deciDigit; long deci=0;
        while(oct!=0)
        {
            digit= (int)oct%10;  
            deciDigit = digit *(int)Math.pow(8,count);
            deci = deci + deciDigit;
            count ++;
            oct = oct/10;
        }
        System.out.println(deci);
    }
}