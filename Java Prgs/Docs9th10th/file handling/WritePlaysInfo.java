import java.io.*;

class WritePlaysInfo
{String info;
    public WritePlaysInfo()throws IOException
    {
    BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the information");
    info =b.readLine();
    FileWriter f = new FileWriter("plays.txt", true);
    BufferedWriter b2 = new BufferedWriter(f);
    PrintWriter p = new PrintWriter(b2);
    p.println(info);
    p.close();
}
}