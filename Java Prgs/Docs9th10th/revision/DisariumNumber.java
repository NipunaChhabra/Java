//disarium number
class DisariumNumber
{
    public static void main(int check)
    {int i = 0;  int copy =check;  int digit[]=new int[10]; double sum=0;
 
        while(copy>0)
        {
            digit[i]= copy%10;
            i=i+1;
            copy = copy/10;
        }
   // System.out.println("i="+i);
    for(int j = i-1; j>=0; j--)
    {//System.out.println(digit[j]+" "+ (i-j));
        sum =sum +  Math.pow(digit[j],(i-j));}
    
     if(sum==check)
     System.out.println("disarium number");
     else
     System.out.println("not a disarium number");
    }
}

