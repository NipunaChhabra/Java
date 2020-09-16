import java.util.*;
import java.io.*;
class ReadAndSort
{String w[] = new String[1000];
    String m[] = new String[1000];
    int wc;
    public static void read()
    {
        FileReader fr = new FileReader("diction.txt");
        BufferedReader br = new BufferedReader(fr);

        FileReader fr1 = new FileReader("diction.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        wc=0;
        
        for(String rec = br.readLine(); rec!=null; rec = br.readLine())
        {

           for(int j=rec; j!=null; j=br.readLine())
            {
                if(i.compareTo(j)<0)
                {String Tokenizer
                    w[wc++]=

                }
                j=br1.readLine();
            }

            /*FileReader f = new FileReader("diction.txt");
            BufferedReader b = new BufferedReader(f);
            String rec = br.readLine();
            StringTokenizer a = new StringTokenizer(rec,",");
            while
             */