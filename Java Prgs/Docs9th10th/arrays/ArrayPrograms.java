// oop style to find sum and average and biggest of these numbers
class ArrayPrograms
{
    double avg;
    double sum;
    double N[];
    
    public ArrayPrograms(double N[])
    {
       
        this.N=N;
    }
    
    public ArrayPrograms()
     {}
    
    public  void sumAndAvg()
    {
        for (int i=0; i<N.length; i++)
        {
            sum=sum+N[i];
        }
        System.out.println ("Sum of marks: " + sum);
        avg= sum/N.length;
        System.out.println("Average of marks: " + avg);
    }
    
    public  void biggest()
    {
        double l=N[0];
        
        for(int i=1; i<N.length; i++)
        {
            if(N[i] > l) l=N[i];
        }
        
        System.out.println("Biggest of these numbers: " + l);
    }
}
        