class Dates
{   

    public int Date2DateNumber(int day, int month, int year)
    {
        int dn=0;
        int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31} ;
        if(year%400==0)m[2]=29;
        else if(year%100!=0&&year%4==0)m[2]=29;
        for(int i=1; i<month; i++){dn=dn+m[i];}
        dn+=day;
        return dn;}

    public int daysElapsed(String date1,String date2)
    { int dn=0;
        int day1=Integer.parseInt(date1.substring(0,2));
        int month1=Integer.parseInt(date1.substring(3,5));
        int year1=Integer.parseInt(date1.substring(6));
        int day2=Integer.parseInt(date2.substring(0,2));
        int month2=Integer.parseInt(date2.substring(3,5));
        int year2=Integer.parseInt(date2.substring(6));
        for(int i=year1+1; i<year2; i++)
        {int y=365;
            if(i%400==0)y=366;
            else if(i%100!=0&&i%4==0)y=366;
            dn=dn+y;}
        int t;
        if(year1%400==0)t=366-Date2DateNumber(day1,month1,year1);
        else if(year1%100!=0&&year1%4==0)t=366-Date2DateNumber(day1,month1,year1); 
        else t=365-Date2DateNumber(day1,month1,year1);
        dn=dn+t;
        dn=dn+ Date2DateNumber(day2,month2,year2);
        return dn;
    }

    public void futureDate(String date, int num)
    { int day=Integer.parseInt(date.substring(0,2));
        int month=Integer.parseInt(date.substring(3,5));
        int year=Integer.parseInt(date.substring(6));
        int d1=Date2DateNumber(day, month, year);
        int d2 = d1+num;
       DateNumber2Date obj=new DateNumber2Date();
       int fmonth=obj.getMonth(d2,year);
       int fdate=obj.getDate(d2,year);
       System.out.println(fdate + " " + fmonth + " " + year);
    }
}
    
            