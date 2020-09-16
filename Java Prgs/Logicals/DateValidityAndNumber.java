import java.util.*;
class DateValidityAndNumber
{int dd, mm, year;
    int dt[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public DateValidityAndNumber()
    {Scanner ab = new Scanner(System.in);
     System.out.println("Enter date in format");
        String d = ab.nextLine();
        if(d.charAt(0)=='0')      
        {char x = d.charAt(1); dd= (int)x-48;}
        //dd = Integer.parseInt(d.charAt(1));
        else dd = Integer.parseInt(d);
        String m = ab.nextLine();
        if(m.charAt(0)=='0')
        {{char k = m.charAt(1); mm= (int)k-48;}}
        //mm = Integer.parseInt(m.charAt(1));
        else mm = Integer.parseInt(m);
        year = ab.nextInt();

    }

    public boolean validity() 
    {if(dd==0||mm==0||year==0)return false;
        if(mm>12)return false;
        if(year%100==0){if(year%400==0)dt[2]++;}
        else if(year%4==0)dt[2]++;
        if(dd>dt[mm])return false;
        return true;
    }

    public  int dateNumber()
    {int datenum =0;
        for(int i = 0; i<mm; i++)
        {
            datenum= datenum + dt[i];
        }
        datenum = datenum + dd;
        return datenum;
    }
    
    public static void main()
    {DateValidityAndNumber obj = new DateValidityAndNumber();
        if(obj.validity())
        System.out.println(" Date number = " + obj.dateNumber());
        else System.out.println(" invalid " );
    }
    }