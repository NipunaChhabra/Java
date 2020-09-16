class ExtractAllCharaters
{
    public static void main(String nm)
    {
        int l=nm.length();

        for(int i=0; i<l; i++)
        {
            char c=nm.charAt(i);
            System.out.println(c);
        }
    }
}