import java.util.*;
class Quiz
{
    public static void main()
    {
        System.out.println("Welcome! Enter your choice as a/b/c/d or s to skip question");        
        System.out.println ("Each correct answer will gain you 2 marks and each wrong ans accounts for -1");
        Scanner ab = new Scanner(System.in);
        int score = 0;
        System.out.println("Q1. How much dirt is there in a ditch/hole of dimensions 10m, 20m, 30m?");
        System.out.println("a. 6000m cube" + "\t" + "b. 1m cube");
        System.out.println("c. 0m cube" + "\t" + "d. 600m cube");
        String ans = ab.nextLine();
        if(ans.equalsIgnoreCase("c"))
        {
            System.out.println("Well done! Your answer is correct.");
            score+=2;
            System.out.println("Your current score is: " + score);
        }

        else if(ans.equalsIgnoreCase("s"))
        {
            System.out.println("Correct answer is c");
            System.out.println("score:" + score);
        }

        else 
        {
            System.out.println("Oops! Your answer is wrong.Correct answer is c");
            score-=1;
            System.out.println("Your current score is: " + score);
        }
        for(long i=0; i<=2000000000; i++)
        {}
        System.out.println((char)12);

        System.out.println("Q2. How many tube lights are there in our class?");
        System.out.println("a. 6" + "\t" + "b. 1");
        System.out.println("c. 4" + "\t" + "d. 5");
        String ans1 = ab.nextLine();
        if(ans1.equalsIgnoreCase("c"))
        {
            System.out.println("Well done! Your answer is correct.");
            score+=2;
            System.out.println("Your current score is: " + score);
        }

        else if(ans1.equalsIgnoreCase("s"))
        {
            System.out.println("Correct answer is c");
            System.out.println("score:" + score);
        }

        else 
        {
            System.out.println("Oops! Your answer is wrong.Correct answer is c");
            score-=1;
            System.out.println("Your current score is: " + score);
        }
        for(long i=0; i<=2000000000; i++)
        {}
        System.out.println((char)12);

        
        System.out.println("Q3. How many charts are there in this room?");
        System.out.println("a. 18" + "\t" + "b. 20");
        System.out.println("c. 13" + "\t" + "d. 25");
        String ans2 = ab.nextLine();
        if(ans2.equalsIgnoreCase("a"))
        {
            System.out.println("Well done! Your answer is correct.");
            score+=2;
            System.out.println("Your current score is: " + score);
        }

        else if(ans2.equalsIgnoreCase("s"))
        {
            System.out.println("Correct answer is a");
            System.out.println("score:" + score);
        }

        else 
        {
            System.out.println("Oops! Your answer is wrong.Correct answer is a");
            score-=1;
            System.out.println("Your current score is: " + score);
        }
        for(long i=0; i<=2000000000; i++)
        {}
        System.out.println((char)12);
        
        System.out.println("Q4. Who is the current CEO of Google?");
        System.out.println("a. Jerry Yang" + "\t" + "b. Satya Nadela");
        System.out.println("c. Sundar Pichai " + "\t" + "d. Larry Page");
        String ans3 = ab.nextLine();
        if(ans3.equalsIgnoreCase("c"))
        {
            System.out.println("Well done! Your answer is correct.");
            score+=2;
            System.out.println("Your current score is: " + score);
        }

        else if(ans3.equalsIgnoreCase("s"))
        {
            System.out.println("Correct answer is c");
            System.out.println("score:" + score);
        }

        else 
        {
            System.out.println("Oops! Your answer is wrong.Correct answer is c");
            score-=1;
            System.out.println("Your current score is: " + score);
        }
        for(long i=0; i<=2000000000; i++)
        {}
        System.out.println((char)12);
        
        System.out.println("Q5. What does the word 'nifty' mean?");
        System.out.println("a. Quick" + "\t" + "b. Naughty");
        System.out.println("c. Careless" + "\t" + "d. Skilled");
        String ans4 = ab.nextLine();
        if(ans4.equalsIgnoreCase("d"))
        {
            System.out.println("Well done! Your answer is correct.");
            score+=2;
            System.out.println("Your current score is: " + score);
        }

        else if(ans4.equalsIgnoreCase("s"))
        {
            System.out.println("Correct answer is d");
            System.out.println("score:" + score);
        }

        else 
        {
            System.out.println("Oops! Your answer is wrong.Correct answer is d");
            score-=1;
            System.out.println("Your current score is: " + score);
        }
        for(long i=0; i<=2000000000; i++)
        {}
        System.out.println((char)12);
        
        System.out.println("Q6. What is the functional group of Methanol?");
        System.out.println("a. Aldehyde " + "\t" + "b. Alcohol ");
        System.out.println("c. Ketone" + "\t" + "d. Ester ");
        String ans5 = ab.nextLine();
        if(ans5.equalsIgnoreCase("b"))
        {
            System.out.println("Well done! Your answer is correct.");
            score+=2;
            System.out.println("Your current score is: " + score);
        }

        else if(ans5.equalsIgnoreCase("s"))
        {
            System.out.println("Correct answer is b");
            System.out.println("score:" + score);
        }

        else 
        {
            System.out.println("Oops! Your answer is wrong.Correct answer is b");
            score-=1;
            System.out.println("Your current score is: " + score);
        }
        for(long i=0; i<=2000000000; i++)
        {}
        System.out.println((char)12);


        System.out.println("Q7. What is the breaking of white light into its seven colours called? ?");
        System.out.println("a. Spectrum" + "\t" + "b. Refraction");
        System.out.println("c. Reflection" + "\t" + "d. Dispersion");
        String ans6 = ab.nextLine();
        if(ans6.equalsIgnoreCase("d"))
        {
            System.out.println("Well done! Your answer is correct.");
            score+=2;
            System.out.println("Your current score is: " + score);
        }

        else if(ans6.equalsIgnoreCase("s"))
        {
            System.out.println("Correct answer is d");
            System.out.println("score:" + score);
        }

        else 
        {
            System.out.println("Oops! Your answer is wrong.Correct answer is d");
            score-=1;
            System.out.println("Your current score is: " + score);
        }
        for(long i=0; i<=2000000000; i++)
        {}
        System.out.println((char)12);
        
        System.out.println("Q8. Who is the writer of the book 'To Kill A Mocking Bird'?");
        System.out.println("a. Harper Lee" + "\t" + "b. Enid Blyton");
        System.out.println("c. Sulman Rushdie" + "\t" + "d. Charles Dickens");
        String ans7 = ab.nextLine();
        if(ans7.equalsIgnoreCase("a"))
        {
            System.out.println("Well done! Your answer is correct.");
            score+=2;
            System.out.println("Your current score is: " + score);
        }

        else if(ans7.equalsIgnoreCase("s"))
        {
            System.out.println("Correct answer is a");
            System.out.println("score:" + score);
        }

        else 
        {
            System.out.println("Oops! Your answer is wrong.Correct answer is a");
            score-=1;
            System.out.println("Your current score is: " + score);
        }
        for(long i=0; i<=2000000000; i++)
        {}
        System.out.println((char)12);
        
        
        System.out.println("Q9. Which of these stones is related to the colour Blue?");
        System.out.println("a. Ruby" + "\t" + "b. Turquoise");
        System.out.println("c. Aquafena" + "\t" + "d. Emerald");
        String ans8 = ab.nextLine();
        if(ans8.equalsIgnoreCase("b"))
        {
            System.out.println("Well done! Your answer is correct.");
            score+=2;
            System.out.println("Your current score is: " + score);
        }

        else if(ans8.equalsIgnoreCase("s"))
        {
            System.out.println("Correct answer is b");
            System.out.println("score:" + score);
        }

        else 
        {
            System.out.println("Oops! Your answer is wrong.Correct answer is b");
            score-=1;
            System.out.println("Your current score is: " + score);
        }
        for(long i=0; i<=2000000000; i++)
        {}
        System.out.println((char)12);
        
        System.out.println("Q10. Which advertisment has the slogan 'ideas for life' ?");
        System.out.println("a. Idea " + "\t" + "b. Intel ");
        System.out.println("c. Panasonic " + "\t" + "d. HCL ");
        String ans9 = ab.nextLine();
        if(ans9.equalsIgnoreCase("c"))
        {
            System.out.println("Well done! Your answer is correct.");
            score+=2;
            System.out.println("Your current score is: " + score);
        }

        else if(ans9.equalsIgnoreCase("s"))
        {
            System.out.println("Correct answer is c");
            System.out.println("score:" + score);
        }

        else 
        {
            System.out.println("Oops! Your answer is wrong.Correct answer is c");
            score-=1;
            System.out.println("Your current score is: " + score);
        }
        for(long i=0; i<=2000000000; i++)
        {}
        System.out.println((char)12);
        
        System.out.println("Final Score: " + score);

    }
}

        