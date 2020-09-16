import java.io.*;
public class ArrayOperations
{
    int N[]=new int[10];
    void enterdata()throws IOException
    {
        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader K = new BufferedReader(I);
        for(int i = 0; i<N.length; i++)
        {
            System.out.println("Enter number" + (i+1));
            String a = K.readLine();
            N[i]=Integer.parseInt(a);
        }
    }
}
