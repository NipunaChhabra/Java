//sorting students according to percentage
class StudentCalibre
{
    public static void main()
    {
        
            String name[] = { "Ishita", "Neha" , "Anjali", "Shivani" , "Anusha" ,
            "Nipuna"};
            int marks[] = {90,87,56,98,96,87};
            int sum  = 0;
            for(int i =0; i<name.length; i++)
            {sum = sum + marks[i];}
            double avg = sum/marks.length;
            System.out.println("average= " + avg);
            
            for(int i=0; i<name.length; i++)
            {
                if(marks[i]>avg)
                System.out.println(name[i] + " " + marks[i]);
            }
        }
    }