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
    }

    void highestRun()throws IOException 
    {
        FileReader f = new FileReader("cricketer.txt");
        BufferedReader b = new BufferedReader(f);
        int rs=0; String name;
        while(true)
        {
            String rec = b.readLine();
            if(rec==null)break;
            StringTokenizer s = new StringTokenizer()
            name = s.nextToken();
            nm= s.nextToken();
            rs= s.nextToken();
            wt= s.nextToken();
            if(hrs<rs){hrs=rs; hname=name;}
        }
    }

    void searchRecord()throws IOException 
    {
        BufferedReader b = new BufferedReader(new InputStreamReader);
        FileReader f = new FileReader("cricketer.txt");
        BufferedReader b = new BufferedReader(f);
        while(true)
        {
            String rec = b.readLine();
            if(rec==null)break;

