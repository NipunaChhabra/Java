class DateNumber2Date
{
    private String month; private int dt; private int year; private int monthNumber;
    int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31} ;
    String m$[]={"","january", "february", "march","april","may","june","july","august","september",
            "october", "november", "december"};
    
    private void dateNumberToDate(int dn, int year)
    {    this.year=year;      
        if(year%400==0) m[2]=29;
        else if(year%100!=0&&year%4==0)m[2]=29;
        int j=0; for(int i=1;i<=12;i++)
        {if(dn>m[i])dn=dn-m[i];
            else{j=i;break;}}
        System.out.println(dt+" " + m$[j] + " " + year);
        monthNumber=j;
        month=m$[j];
        dt=dn;
    }
    public int getMonth(int dt, int year)
    {
        dateNumberToDate(dt,year);
        return monthNumber;}
    public int getDate(int dt, int year)
    {
        dateNumberToDate(dt,year);
        return dt;}
}