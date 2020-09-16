
import java.io.*;
class WriteDictionary
{
    public WriteDictionary()throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the words");
        String word = b.readLine();
        FileWriter f = new FileWriter("diction.txt", true);
        BufferedWriter b2 = new BufferedWriter(f);
        PrintWriter p = new PrintWriter(b2);
        p.println(word);
        p.close();
    }
}

   /* public void sortDictionary()throws IOException
    {FileReader fr = new FileReader("diction.txt");
        BufferedReader br = new BufferedReader(fr);
        String rec = br.readLine();

        FileWriter fw = new FileWriter("dictionsort.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);  
        PrintWriter pw = new PrintWriter(bw);
        pw.println(rec);

        while(rec!=null)
        {String i=rec;
            FileReader fr1 = new FileReader("dictionsort.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            String j=br1.readLine();
            while(i.compareTo(j)<0){j=br1.readLine();
                */

            