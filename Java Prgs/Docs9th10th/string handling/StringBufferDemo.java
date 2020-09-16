class StringBufferDemo
{
    public static void main(String A)
    {
        StringBuffer B = new StringBuffer(A);
        System.out.println(B);
        B.append("\"");
        System.out.println(B);
        B.reverse();
        System.out.println(B);
        B.insert(3,"\"");
        System.out.println(B);
        B.delete(3,7);
        System.out.println(B);
    }
}
