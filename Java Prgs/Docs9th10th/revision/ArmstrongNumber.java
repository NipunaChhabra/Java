//Armstrong Number
class ArmstrongNumber
{
    public static void main(int a)
    {    double cubeSum = 0;
        double copy = a;
        while (a!=0)
        {

            int digit = a%10;
            cubeSum = cubeSum + Math.pow(digit,3);
            a=a/10;
        }
        if(cubeSum == copy)
            System.out.println(" It is an armstrong number");
        else
            System.out.println("It is not an amstrong number");

    }
}