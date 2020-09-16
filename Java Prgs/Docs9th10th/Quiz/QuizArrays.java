import java.util.*;
class QuizArrays
{
    String name;
    String Q[], A[], B[], C[], D[], X[];
    int score;
    Scanner ab = new Scanner(System.in);

    private QuizArrays()
    {
        String q[]={" A doctor prescribes you three pills to be taken in half an hour each. What is the shortest time in which you can finish the pills?"
            , "Mary's father has four daughters Eena, Meena, Mina And?",
                "How much mud will there be in a pit of dimension 20, 10 and 30m ?",
           "A is the father of B and B is the daughter D. While D is the only daughter of C, who is the wife of F, How is F related to B??",
           "What will weigh more? 1 kg of cotton or 1 kg of iron?", "Can a man of California mary his widows sister?",
        "Write the eigth element of this series: 0,1,1,2,3,5,....", "If APPLE stands for NCCYR, BANANA stands for ONANAN and MANGO stands for ZNATB, what does CHERRY stand for?"};
        String a[]={"one and half hour" , "Mo", "6000", "Grand father", "iron", "Yes!","8","PURFFL"};
        String b[]={"Two hours" , "Tina" , "600" , "Grand daughter","cotton","No!","7","QVRGGP"};
        String c[]={"one hour" , "Meera", "1", "Uncle", "equal","His wish","13","RSIJJN"};
        String d[]={"three hour", "Mary" , "0", "Aunt", "metal", "Obviously","11","DKSRRZ"};
        String x[]={"c", "d", "d", "a", "c", "b", "c", "a"};

        Q=q;
        A=a;
        B=b;
        C=c;
        D=d;
        X=x;
    }
    
    public void intro()
    {
        System.out.println("Welcome to our Quiz!!!!");
        System.out.println("Enter your name" );
        String name = ab.nextLine();
        System.out.println(name + "All the best!!!!");
    }

    public void playQuiz()
    {
        for(int i = 0; i < Q.length; i++)
        {
            System.out.println((char)12);
            System.out.println((i+1) + "." + Q[i]);
            System.out.println("a. " + A[i] + "\t" + "b. " + B[i]);
            System.out.println("c. " + C[i] + "\t" + "d. " + D[i]);
            System.out.println("Enter your choice A/B/C/D, S to skip or Q to Quit the question");
            String choice=ab.next();
            
            if(choice.equalsIgnoreCase(X[i])) correct();
            else if(choice.equalsIgnoreCase("s"))skip(i);
            else if(choice.equalsIgnoreCase("q"))break;
            else wrong();
            delay();
        }
    }
    
    private void correct()
    {
        System.out.println("Well Done! Your answer is correct");
        score+=2;
        System.out.println("Current score is: " + score);
    }
    
    private void skip(int a)
    {
       System.out.println("Current score is: " + score); 
       System.out.println("Correct ans is:" + X[a]);
    }
    
    private void wrong()
    {
        System.out.println("Oops! Wrong answer");
        score--;
        System.out.println("Current score is: " +score);
    }
    
    public void delay()
    {
        for(long i = 1; i<2000000000; i++)
        {
        }
        
    }
    
    public void conclude()
    {
       
       System.out.println("Thank you for playing!!");
       
       System.out.println("Your final score: "+ score);
       
    }
    
    public static void main()
    {
        QuizArrays Qi = new QuizArrays();
        Qi.intro();
        Qi.playQuiz();
        Qi.conclude();
    }       
        
}
    
        
            

    