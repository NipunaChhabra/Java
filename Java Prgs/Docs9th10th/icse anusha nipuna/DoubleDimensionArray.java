//Double dimensioned array
class DoubleDimensionArray
{
    public static void main()
    {
        int a[][]={{1,2,3},{2,3,4,5,8},{2,4,5,6}};
        
        for(int i = 0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
        