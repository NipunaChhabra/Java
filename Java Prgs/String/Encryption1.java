import java. util.Scanner;
import java.io.*;
class Encryption1
{ StringBuffer b;
    public Encryption1()
    {Scanner ab = new Scanner(System.in);
        System.out.println("Enter data");
        StringBuffer a = new StringBuffer(ab.nextLine());  
        b=a;
    }

    public void encrypt()
    { b=b.reverse();
        StringBuffer a = new StringBuffer(" "); 
        char A; int t; int t2; char T;
        for(int i=1; i<b.length(); i++)
        { A = b.charAt(i);
            if(A==' ')T='q';        
            else if(A=='A')T='Z';
            else if(A=='a')T='z';
            else {t = (int)A; t2= t-1;
                T = (char)t2;}
            a=a.append(T);
        }
        b=a;
    }

    public void display()
    {int t=0;
        for(int i=4; i<b.length(); i=i+4)
        {System.out.println(b.substring(t,i+1));t=i;
        }
    }

}
