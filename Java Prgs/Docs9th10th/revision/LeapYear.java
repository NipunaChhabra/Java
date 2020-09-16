//leap year
class LeapYear
{
    public static void main(int yr)
    {
      if(yr%100==0)
      {
          if(yr%400==0)
          {
              System.out.println("Leap Year");
            }
        }
        else if(yr%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
           System.out.println("Not a Leap Year"); 
        }
    }
}