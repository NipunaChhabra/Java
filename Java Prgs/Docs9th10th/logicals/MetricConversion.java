import java.util.*;
class MetricConversion
{ static double n; static String A[] = {"km", "hm","dm", "m"};
    static String a[] = {"dm","cm","mm"};
   static  String M$ = "";
    public static void enterData()
    {
        System.out.println("Enter the value in meters(decimal)");
        Scanner ab = new Scanner(System.in);
        n= ab.nextDouble();
    }

    public static void execute()
    {int M = (int)n;double m =n%M; int i; int j;
        while(M>0)
        { i =1;
            int t = M%10 ;
            String t$ = Integer.toString(t);
            M$=t$ +A[A.length-i]+M$;
            M=M/10;
            i++;
        }
        while(m<1)
        { j=0;
            int t = (int)m*10;
            String t$ = Integer.toString(t);
            M$=M$+t$+a[j];
            double t1=m*10;
            m=t1/t;    
            j=j+1;
        }
    }

    public static void display()
    {
        System.out.println(M$);
    }
}