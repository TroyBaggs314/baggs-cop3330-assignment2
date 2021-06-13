package ex32;
import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        System.out.println("Lets play Guess the Number!");
        do
        {
            play(difficultyInput());
            System.out.println("Do you wish to play again (Y/N)? ");
        }while(again());
    }

    public static int difficultyInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        String answer;
        boolean flag;
        do {
            answer = sc.next();
            try {
                Integer.parseInt(answer);
                if(Integer.parseInt(answer) == 1)
                {
                    boolean temp = true;
                }
                else if(Integer.parseInt(answer) == 2)
                {
                    boolean temp = true;
                }
                else if(Integer.parseInt(answer) == 3)
                {
                    boolean temp = true;
                }
                else
                {
                    int temp = (Integer.parseInt(answer)) /0;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
                flag = true;
            }
        }while(flag);
        return Integer.parseInt(answer);
    }

    public static int play(int diff)
    {
        int counts = 0;
        int toGuess = 0;
        if(diff == 1)
        {
            toGuess = (int)(Math.ceil(Math.random() * 10));
        }
        else if (diff == 2)
        {
            toGuess = (int)(Math.ceil(Math.random() * 100));
        }
        else if (diff == 3)
        {
            toGuess = (int)(Math.ceil(Math.random() * 1000));
        }
        else if (diff > 3)
        {
            toGuess = diff;
        }
        System.out.println("I have my number. " + toGuess + " What's your guess?");
        int guess = 0;
        do
        {
            guess = guess(0);
            counts++;
            if(guess < toGuess)
            {
                System.out.println("Too low. Guess again: ");
            }
            if(guess > toGuess)
            {
                System.out.println("Too high. Guess again: ");
            }
        }while(guess != toGuess);
        System.out.println("You got it in "+ counts + " guesses!");
        return counts;
    }

    public static int guess(int i)
    {
        String answer;
        if(i == 0)
        {
            Scanner sc = new Scanner(System.in);
            answer = sc.next();
            boolean flag;
            do {
                try {
                    Integer.parseInt(answer);
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Sorry. That's not a valid input.");
                    flag = true;
                }
            } while (flag);
        }
        else
        {
            answer = "" + i;
        }
        return Integer.parseInt(answer);
    }

    public static boolean again()
    {
        Scanner sc = new Scanner(System.in);
        char temp = sc.next().toLowerCase().charAt(0);
        if(temp == 'y')
        {
            return true;
        }
        else if (temp == 'n')
        {
            return false;
        }
        return false;
    }
}
