// looping
import java.util.Scanner;
class Calculator
{
    public static void main(char n)
     {
        Scanner ab = new Scanner(System.in);
        System.out.println("enter numbers");
        int a = ab.nextInt();
        int b = ab.nextInt();
        switch(n)
        {
            case '*' : System.out.println("multiplication= "+ '\t'+(a*b)); break;
            case '/' : System.out.println("division= " + (a/b)); break;
            case '+' : System.out.println("addition= " + (a+b)); break;
            case '-' : System.out.println("subtraction= " + (a-b)); break;
            case '%' : System.out.println("remainder= " + (a%b)); break;
            default : System.out.println("invalid"); break;
        }
    }
}
        