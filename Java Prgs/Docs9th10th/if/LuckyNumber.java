/* lucky number*/
import java.util.Scanner;
public class LuckyNumber
{
    public static void main()
    {
        Scanner ab= new Scanner(System.in);
        System.out.println("Choose a number between 1 to 5");
        int n=ab.nextInt();
        
        if(n==1)
        {
            System.out.println("You will be rich");
        }
        if(n==2)
        {
            System.out.println("You will be beautiful");
        }
        if(n==3)
        {
            System.out.println("You will be bankrupt");
        }
        if(n==4)
        {
            System.out.println("You will be a traveller");
        }
        if(n==5)
        {
            System.out.println("You will be the president");
        }
        if(n>=6)
        {
            System.out.println("Invalid number");
        }
    }
}