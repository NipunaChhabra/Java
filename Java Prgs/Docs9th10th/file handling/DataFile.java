import java.io.*;
class DataFile
{  Sting name; int m, r ,w;
    public DataFile(Sting name, int m,int r,int w)
    {
        this.name = name;
        this.m=m; this.r=r;
        this.w=w;
    }

    public void addRecord()
    {
        FileWriter f = new FileWriter(crickter.txt, true)
        BufferedWriter bw =  new BufferedWriter(f);
        PrintWriter pw = new PrintWriter(bw)
        pw.println(name+m+r+" "+" " +w
