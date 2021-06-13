package ex29;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int i = input();
        results(math(i));
    }

    public static int math(int i)
    {
        return 72/i;
    }

    public static void results(int i)
    {
        System.out.println("It will take " + i + " years to double your initial investment.");
    }

    public static int input()
    {
        String val = "";
        Scanner sc = new Scanner(System.in);
        boolean flag;
        do
        {
            System.out.println("What is the rate of return? ");
            val = sc.next();
            try
            {
                Integer.parseInt(val);
                int temp = 1/Integer.parseInt(val);
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
                flag = true;
            }
        }while(flag);
        return Integer.parseInt(val);
    }
}
