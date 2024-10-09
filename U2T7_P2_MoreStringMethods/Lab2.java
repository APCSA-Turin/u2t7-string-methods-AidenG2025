import java.util.Scanner;

public class Lab2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

       System.out.print("Enter a word to start the word game: ");
       String s1 = scan.nextLine();
       int wordCount = 0;
       int score = 0;
       String s2;
       



       while (score < 50)
       {
       
     
        

        System.out.println("Enter the next word: ");
        s2 = scan.nextLine();
        

        if (s1.compareTo(s2) < 0)
        {
            score = score + 2;
            System.out.println("+2 points: current word alphabetically after; SCORE: " + score);

        }
        else if (s1.compareTo(s2) > 0)
        {
            score = score - 5;
            System.out.println("-5 points: current word alphabetically before; SCORE: " + score);

        }
        else if (s1.equals(s2))
        {
            score = score - 10;
            System.out.println("-10 points: current word same as previous; SCORE: "+ score);

        }
        else if (s2.substring(0,3).equals(s2.substring(s2.length() - 2)))
        {
            score = score + 5;
            System.out.println("+5 points: last 2 letters of previous match first two letters of current; SCORE: " + score);

        }
        else if (s1.indexOf(s2.substring(0,1)) > -1)
        {
            score = score + 3;
            System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);

        }
        else if (score >= 50)
        {
            System.out.println("You beat the game oongrats!");
            System.out.println("Score: " + score + "Word Count: " + wordCount);
        }
        {
            s1 = s2;
            wordCount = wordCount + 1;
        }
       }
       
       
 

       
    }

} 