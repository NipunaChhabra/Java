import java.io.*;
class WriteQuizFile
{String info;
public WriteQuizFile()throws IOException
{
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the informatio");
    info = b.readLine();
    FileWriter f = new FileWriter("quiz.txt", true);
    BufferedWriter b2 = new BufferedWriter(f);
    PrintWriter p = new PrintWriter(b2);
    p.println(info);
    p.close();
}
}
        