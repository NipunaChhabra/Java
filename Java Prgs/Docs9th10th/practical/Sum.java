import java.util.*;
class Sum
{
    public static void main()
    {
    int sum=0;
    int n[]=new int[10];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<10;i++)
    {
    System.out.println("Enter number"+(i+1));
    n[i]=sc.nextInt();
    if(n[i]%5==0) continue;
    sum=sum+n[i];
}
System.out.println("sum="+ sum);
}}


    
    
