package ex35;
import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        announceWinner(decideWinner(nameInitializer(),-1));
    }

    public static ArrayList<String> nameInitializer()
    {
        ArrayList<String> names = new ArrayList<>();
        String answer;
        do
        {

            answer = input();
            if(!answer.isEmpty())
            {
                names.add(answer);
            }
            names.add(answer);
        }while(!answer.isEmpty());
        return names;
    }
    public static String input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        return sc.nextLine();
    }

    public static String decideWinner(ArrayList<String> names, int i)
    {
        String winner;
        if(i == -1)
        {
            winner = names.get(randomWinner(names.size()));
        }
        else
        {
            winner = names.get(i);
        }
        return winner;
    }

    public static int randomWinner(int i)
    {
        return (int)(Math.random()*(10^i))%i;
    }

    public static void announceWinner(String s)
    {
        System.out.println("The winner is... " + s + ".");
    }

}
