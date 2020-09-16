/*temperature2*/
import java.util.Scanner;

public class Temperature2
{
public static void main ()
{
    Scanner ab= new Scanner(System.in);
    System.out.println("enter 1 for conversion into celcius and 2 for conversion into farenheit");
    int n =ab.nextInt();
    System.out.println("enter the temperature");
    int t=ab.nextInt();
    
    if(n==2)
    {
     int ans= 9*t/5 + 32;
      System.out.println ("temperature in farenheit="+ans);
    }
    
    if (n==1)
    {
        
     int ans2= (5*(t-32))/9;
        System.out.println  ("temperature in celsius="+ans2);
    }
}
}
