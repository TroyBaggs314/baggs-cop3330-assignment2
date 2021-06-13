package ex33;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        input();
        give(prediction(-1));
    }

    public static void question()
    {
        System.out.println("What is your question?");
    }

    public static void input()
    {
        question();
        Scanner sc = new Scanner(System.in);
        sc.next();
    }

    public static String prediction(int choice)
    {
        String s = "";
        if(choice < 0)
        {
            choice = (int) (Math.ceil(Math.random() * 10)) % 4;
        }
        if(choice == 0)
        {
            s = "Yes.";
        }
        else if(choice == 1)
        {
            s = "No.";
        }
        else if(choice == 2)
        {
            s = "Maybe.";
        }
        else if(choice == 3)
        {
            s = "Ask again later.";
        }
        return s;
    }

    public static void give(String s)
    {
        System.out.println(s);
    }
}
