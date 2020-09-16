import java.util.*;
import java.io.*;
class Quiz
{String ans; String choice; boolean run=true; static double score=0;

    public void PlayQuiz()throws IOException
    { FileReader f = new FileReader("quiz.txt");
        BufferedReader b = new BufferedReader(f);
        while(b!=null && run){System.out.println((char)12);
            StringTokenizer t= new StringTokenizer(b.readLine(),",");
            System.out.println("Question" + t.nextToken());
            System.out.println("a " + t.nextToken() + "\tb " + t.nextToken() + 
                "\tc " + t.nextToken() + "\td " + t.nextToken());
            ans = t.nextToken();
            BufferedReader b2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your answer or s for skip or q for quit");
            choice= b2.readLine();

            if(choice.equalsIgnoreCase(ans))correct();
               else if(choice.equalsIgnoreCase("s"))skip(ans);
                else if(choice.equalsIgnoreCase("q"))run = false;
                else wrong(ans);
            }
            b.close();
            
        }
    

    private void correct()
    {
        System.out.println("Well Done! Your answer is correct");
        score+=5;
        System.out.println("Current score is: " + score);
        for(long i=1; i<2000000000; i++){};
    }
    
    private void skip(String a)
    {System.out.println("you have skipped");
       System.out.println("Current score is: " + score); 
       System.out.println("Correct ans is:" + a);
        for(long i=1; i<2000000000; i++){};
    }
    
    private void wrong(String a)
    {score = score--;
        System.out.println("sorry");
        System.out.println("Current score is: " + score); 
       System.out.println("Correct ans is:" + a);
        for(long i=1; i<2000000000; i++){};
    }

    public static void main()throws IOException
    {System.out.println("Welcome To The Quiz");
        Quiz obj= new Quiz();
        obj.PlayQuiz();
       System.out.println("Thank you for playing with us. /n Your final score was:" +  score);
    }
}

