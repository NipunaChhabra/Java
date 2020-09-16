/*distance by bus*/
public class Distance
{
    public static void main()
    {
        int totaldistance= 5350;
        int onfoot= 1070;
        int onbus= totaldistance- onfoot;
        float km = onbus/1000;
        System.out.println("distance travelled by bus is "+ onbus + "m");
        System.out.println("distance travelled by bus is "+ km + "km");
    }
}