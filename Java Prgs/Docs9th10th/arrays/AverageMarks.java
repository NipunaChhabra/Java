//average marks
class AverageMarks
{
    public static void main(double N[])
    {
        double sum=0;
        double avg;
        for( int i=0; i<N.length; i++)
        {
            sum= sum +N[i];
        }
        System.out.println ("Sum of marks: " + sum);
        avg= sum/N.length;
        System.out.println("Average of marks: " + avg);
    }
}
