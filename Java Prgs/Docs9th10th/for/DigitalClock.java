public class DigitalClock
{
    public static void main()
    {
        for(;;)
        {
            for(int h =1; h<=12; h++)
            {
                for(int m = 0; m<=59; m++)
                {
                    for(int s = 0; s<= 59; s++)
                    {
                        System.out.println((char)12);
                        System.out.println(h+":"+m+":"+s);
                        for(int d = 1; d<=2000000000; d++)
                        {
                        }
                    }
                }
            }
        }
    }
}